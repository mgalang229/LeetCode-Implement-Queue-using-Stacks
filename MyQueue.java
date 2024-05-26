class MyQueue {
    Stack<Integer> normalStack;
    Stack<Integer> reverseStack;

    public MyQueue() {
        normalStack = new Stack<>();
        reverseStack = new Stack<>();
    }
    
    public void push(int x) {
        while (!reverseStack.empty()) {
            int top = reverseStack.pop();
            normalStack.push(top);
        }
        normalStack.push(x);
    }
    
    public int pop() {
        while (!normalStack.empty()) {
            int top = normalStack.pop();
            reverseStack.push(top);
        }
        return reverseStack.pop();
    }
    
    public int peek() {
        while (!normalStack.empty()) {
            int top = normalStack.pop();
            reverseStack.push(top);
        }
        return reverseStack.peek();
    }
    
    public boolean empty() {
        return (normalStack.empty() && reverseStack.empty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
