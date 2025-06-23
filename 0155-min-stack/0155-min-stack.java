class MinStack {
    class Node{
        int val;
        int min;
        Node(int val,int min){
            this.val=val;
            this.min=min;
        }
    }
    Stack<Node> st;
    public MinStack() {
        st=new Stack<>();
    }
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Node(val,val));
        }
        else{
            int curmin=Math.min(val,st.peek().min);
            st.push(new Node(val,curmin));
        }
    }
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */