package com.findmaximum;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest
{
	  static Integer a=10;
      static Integer b=20;
      static Integer c=30;
		@Test
	    public void givenMaxAtFirstShouldReturnFast()
	    {
	       Maximum maximum=new Maximum();
	       Integer max=maximum.getMaximumOfIntegers(c,b,a);
	       Assert.assertEquals(c,max);
	    }
	    @Test
	    public void givenMaxAtSecondShouldReturnFast()
	    {
	       Maximum maximum=new Maximum();
	       Integer max=maximum.getMaximumOfIntegers(a,b,c);
	       Assert.assertEquals(c,max);
	    }
	    @Test
	    public void givenMaxAtThirdShouldReturnFast()
	    {
	       Maximum maximum=new Maximum();
	       Integer max=maximum.getMaximumOfIntegers(a,b,c);
	       Assert.assertEquals(c,max);
	    }
}
