package com.findmaximum;
import org.junit.Assert;
import org.junit.Test;
public class MaximumTest
{
	  static Integer integer1=10;
      static Integer integer2=20;
      static Integer integer3=30;
      static Float float1=10.0f;
      static Float float2=20.0f;
      static Float float3=30.0f;
      static String string1="Apple";
      static String string2="Banana";
      static String string3="Peach";
		@Test
	    public void givenMaxAtFirstShouldPass()
	    {
	       Maximum<Integer> maximum=new Maximum<Integer>(integer1,integer2,integer3);
	       Integer max=maximum.getMaximum(integer3,integer2,integer1);
	       Assert.assertEquals(integer3,max);
	    }
	    @Test
	    public void givenMaxAtSecondShouldPass()
	    {
	       Maximum<Integer> maximum=new Maximum<Integer>(integer1,integer2,integer3);
	       Integer max=maximum.getMaximum(integer1,integer2,integer3);
	       Assert.assertEquals(integer3,max);
	    }
	    @Test
	    public void givenMaxAtThirdShouldPass()
	    {
	       Maximum<Integer> maximum=new Maximum<Integer>(integer1,integer2,integer3);
	       Integer max=maximum.getMaximum(integer1,integer2,integer3);
	       Assert.assertEquals(integer3,max);
	    }
	    @Test
	    public void givenMaxFloatAtFirstShouldPass()
	    {
	       Maximum<Float> maximum=new Maximum<Float>(float1,float2,float3);
	       Float max=maximum.getMaximum(float1,float2,float3);
	       Assert.assertEquals(float3,max);
	    }
	    @Test
	    public void givenMaxFloatAtSecondShouldPass()
	    {
	       Maximum<Float> maximum=new Maximum<Float>(float1,float2,float3);
	       Float max=maximum.getMaximum(float1,float3,float2);
	       Assert.assertEquals(float3,max);
	    }
	    @Test
	    public void givenMaxFloatAtThirdShouldPass()
	    {
	       Maximum<Float> maximum=new Maximum<Float>(float1,float2,float3);
	       Float max=maximum.getMaximum(float3,float1,float2);
	       Assert.assertEquals(float3,max);
	    }
	    @Test
	    public void givenMaxStringAtFirstShouldPass()
	    {
	       Maximum<String> maximum=new Maximum<String>(string1,string2,string3);
	       String max=maximum.getMaximum(string1,string2,string3);
	       Assert.assertEquals(string3,max);
	    }
	    @Test
	    public void givenMaxStringAtSecondShouldPass()
	    {
	       Maximum<String> maximum=new Maximum<String>(string1,string2,string3);
	       String max=maximum.getMaximum(string1,string3,string2);
	       Assert.assertEquals(string3,max);
	    }
	    @Test
	    public void givenMaxStringAtThirdShouldPass()
	    {
	       Maximum<String> maximum=new Maximum<String>(string1,string2,string3);
	       String max=maximum.getMaximum(string3,string1,string2);
	       Assert.assertEquals(string3,max);
	    }
}
