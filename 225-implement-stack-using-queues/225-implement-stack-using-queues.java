class MyStack {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;
    public MyStack() {
        mainQ=new ArrayDeque<>();
         helperQ=new ArrayDeque<>();
    }
    
    public void push(int x) {
        mainQ.add(x);
    }
    
    public int pop() {
        while(mainQ.size()>1){
            helperQ.add(mainQ.remove());
        }
        int v1=mainQ.remove();
        Queue<Integer> tempQ=mainQ;
        mainQ=helperQ;
        helperQ=tempQ;
        return v1;
    }
    
    public int top() {
         while(mainQ.size()>1){
            helperQ.add(mainQ.remove());
        }
        int v1=mainQ.remove();
        helperQ.add(v1);
        Queue<Integer> tempQ=mainQ;
        mainQ=helperQ;
        helperQ=tempQ;
        return v1;
    }
    
    public boolean empty() {
        if(mainQ.size()==0) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */