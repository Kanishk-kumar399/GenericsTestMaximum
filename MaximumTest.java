package com.findmaximum;
import org.junit.Assert;
import org.junit.Test;
public class MaximumTest
{
	  static Integer[] intArray= {10,20,30,40,50,60};
      static Float[] floatArray= {1.0f,2.0f,3.0f,4.0f};
      static String[] stringArray= {"A","B","C","D","E","F"};
		@Test
	    public void given_Integer_MaxAtAnyPlaceShouldBeShown()
	    {
	       Maximum<Integer> maximum=new Maximum<Integer>(intArray);
	       Integer max=maximum.getMaximum();
	       Assert.assertEquals((Integer)60,max);
	    }
		@Test
		public void given_Float_MaxAtAnyPlaceShouldBeShown()
	    {
	       Maximum<Float> maximum=new Maximum<Float>(floatArray);
	       Float max=maximum.getMaximum();
	       Assert.assertEquals((Float)4.0f,max);
	    }
		@Test
		public void given_String_MaxAtAnyPlaceShouldBeShown()
	    {
	       Maximum<String> maximum=new Maximum<String>(stringArray);
	       String max=maximum.getMaximum();
	       Assert.assertEquals((String)"F",max);
	    }
}
