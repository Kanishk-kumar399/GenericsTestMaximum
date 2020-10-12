package com.findmaximum;
import java.lang.Integer;
public class Maximum implements Comparable
{
    public Integer getMaximumOfIntegers(Integer x,Integer y,Integer z)
    {
    	Integer max=x;
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
