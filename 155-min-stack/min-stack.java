class MinStack {

    List<Pair<Integer, Integer>> list;
    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        Pair<Integer, Integer> top = list.isEmpty() ? new Pair<>(val, val) : list.get(list.size()-1);
        int min = top.getValue();
        if (val < min) min = val;
        list.add(new Pair<>(val, min));
    }
    
    public void pop() {
        list.remove(list.size()-1);
    }
    
    public int top() {
        return list.get(list.size()-1).getKey();
    }
    
    public int getMin() {
        return list.get(list.size()-1).getValue();
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