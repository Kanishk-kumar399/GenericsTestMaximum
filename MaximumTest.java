package com.findmaximum;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest
{
	  static Integer a=10;
      static Integer b=20;
      static Integer c=30;
      static Float x=10.0f;
      static Float y=20.0f;
      static Float z=30.0f;
      static String p="Apple";
      static String q="Banana";
      static String r="Peach";
		@Test
	    public void givenMaxAtFirstShouldPass()
	    {
	       Maximum maximum=new Maximum();
	       Integer max=maximum.getMaximumOfIntegers(c,b,a);
	       Assert.assertEquals(c,max);
	    }
	    @Test
	    public void givenMaxAtSecondShouldPass()
	    {
	       Maximum maximum=new Maximum();
	       Integer max=maximum.getMaximumOfIntegers(a,b,c);
	       Assert.assertEquals(c,max);
	    }
	    @Test
	    public void givenMaxAtThirdShouldPass()
	    {
	       Maximum maximum=new Maximum();
	       Integer max=maximum.getMaximumOfIntegers(a,b,c);
	       Assert.assertEquals(c,max);
	    }
	    @Test
	    public void givenMaxFloatAtFirstShouldPass()
	    {
	       Maximum maximum=new Maximum();
	       Float max=maximum.getMaximumOfFloat(x,y,z);
	       Assert.assertEquals(z,max);
	    }
	    @Test
	    public void givenMaxFloatAtSecondShouldPass()
	    {
	       Maximum maximum=new Maximum();
	       Float max=maximum.getMaximumOfFloat(x,z,y);
	       Assert.assertEquals(z,max);
	    }
	    @Test
	    public void givenMaxFloatAtThirdShouldPass()
	    {
	       Maximum maximum=new Maximum();
	       Float max=maximum.getMaximumOfFloat(z,x,y);
	       Assert.assertEquals(z,max);
	    }
	    @Test
	    public void givenMaxStringAtFirstShouldPass()
	    {
	       Maximum maximum=new Maximum();
	       String max=maximum.getMaximumOfString(p,q,r);
	       Assert.assertEquals(r,max);
	    }
	    @Test
	    public void givenMaxStringAtSecondShouldPass()
	    {
	       Maximum maximum=new Maximum();
	       String max=maximum.getMaximumOfString(p,r,q);
	       Assert.assertEquals(r,max);
	    }
	    @Test
	    public void givenMaxStringAtThirdShouldPass()
	    {
	       Maximum maximum=new Maximum();
	       String max=maximum.getMaximumOfString(r,p,q);
	       Assert.assertEquals(r,max);
	    }
}
