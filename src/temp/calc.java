package temp;

public class calc 
{
   
	   public int add(int a, int b)
	    {
	    	return a+b;
	    }
	    public double add(double a, double b)
	    {
	    	return a+b;
	    }
	    // three ways of overloading methods
	    //1. (increasing the) number of parameters 
	    public int add(int a, int b, int c)
	    {
	    	return a+b;
	    }
	    public double add(double a, double b, double c)
	    {
	    	return a+b;
	    }
	    
	    //2. Data types of parameters
	    public float add(int a, float b)
	    {
	    	return a+b;
	    }
	    
	    //3. sequence of data type parameter
	    public float add(float a, int b, int c)
	    {
	    	return a+b;
	    }
	    // method overloading it cannot care about return type
}


// method overloading --> is a feature allows a class to have 
// morethan one method having same method name and arguments are different 