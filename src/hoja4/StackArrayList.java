/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

/**
 *
 * @author Mario Barrientos
 */

import java.util.ArrayList;

public class StackArrayList<T> extends Stack<T>{
	protected ArrayList<T> data;

	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<T>();
	}

	public void push(T item)
	// post: the value is added to the stack
	//will be popped next if no intervening push
	{
		data.add(item);
	}

	public T pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
            if(data.size()>0)
		return data.remove(size()-1);
            else 
                return null;
	}

	public T peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	
}

