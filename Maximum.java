package com.findmaximum;

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
    	printMaximum(inputArray,max);
    	return max;
    }
	public static <T> void printMaximum(T[] inputArray,T max)
	{
		for(T element:inputArray)
		System.out.print("  "+element);
		System.out.println("\nMaximum of the present element is: " +max);
	}
	public static void main(String args[])
	{
		Integer[] intArray= {10,20,30,40,50,60};
	    Float[] floatArray= {1.0f,2.0f,3.0f,4.0f};
	    String[] stringArray= {"A","B","C","D","E","F"};
	    new Maximum(intArray).getMaximum();
	    new Maximum(floatArray).getMaximum();
	    new Maximum(stringArray).getMaximum();
	}
}
