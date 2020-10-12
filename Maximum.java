package com.findmaximum;

import java.util.Collection;

public class Maximum<T extends Comparable<T>>
{
	T[] inputArray;
	
    public Maximum(T[] inputArray) {
		this.inputArray=inputArray;
	}

    public T getMaximum()
    {
    	return Maximum.getMaximum(inputArray);
    }
	public static <T extends Comparable<T>> T getMaximum(T[] inputArray)
    {
		T max=inputArray[0];
    	for(T element:inputArray)
    	{
    	if(element.compareTo(max)>0)
    		max=element;
    	}
    	return max;
    }
	
}
