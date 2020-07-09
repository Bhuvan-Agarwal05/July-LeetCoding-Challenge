class BrowserHistory {
    Stack<String> back = new Stack<>();
    Stack<String> forward = new Stack<>();
    
    public BrowserHistory(String homepage) {
        back.add(homepage);
    }
    
    public void visit(String url) {
        if(forward.isEmpty())
            back.add(url);
        else
        {
            back.add(url);
            forward.clear();
        }
    }
    
    public String back(int steps) {
        int x = back.size();
        if(steps >= x)
        {
            while(back.size()!=1)
            {
                forward.push(back.pop());
            }
            return back.peek();
        }
        else
        {
            while(steps!=0)
            {
                forward.push(back.pop());
                steps--;
            }
            return back.peek();
        }
    }
    
    public String forward(int steps) {
        int x = forward.size();
        if(steps >= x)
        {
            while(!forward.isEmpty())
            {
                back.push(forward.pop());
            }
            return back.peek();
        }
        else
        {
            while(steps!=0)
            {
                back.push(forward.pop());
                steps--;
            }
            return back.peek();
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */