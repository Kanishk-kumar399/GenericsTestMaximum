package com.findmaximum;
public class Maximum implements Comparable
{
    public <T extends Comparable<T>> T getMaximum(T x,T y,T z)
    {
    	T max=x;
    	if(y.compareTo(max)>0)
    		max=y;
    	if(z.compareTo(max)>0)
    		max=z;
    	return max;
    }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
