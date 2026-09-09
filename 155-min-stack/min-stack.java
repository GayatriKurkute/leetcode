class MinStack 
{
    Stack<Integer> stack1;  //normal stack
    Stack<Integer> stack2;   // monotonic decreasing stack
    public MinStack() 
    {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    
    public void push(int value) 
    {
      stack1.push(value);
      if (stack2.isEmpty()==true)
      {
        stack2.push(value);
        return;
      }
      if (stack2.peek()>=value)
      {
        stack2.push(value);
        return;
      }
    }
    
    public void pop() 
    {
      if (stack1.isEmpty() || stack2.isEmpty())
      {
        return;
      }
      if ((stack1.peek()).equals(stack2.peek()))
      {
        stack1.pop();
        stack2.pop();
      }
      else
      {
        stack1.pop();
      }
    }
    
    public int top() 
    {
       return stack1.peek(); 
    }
    
    public int getMin() 
    {
        if(stack1.isEmpty()||stack2.isEmpty())
        {
            return -1;
        }
    return stack2.peek();
    }
}