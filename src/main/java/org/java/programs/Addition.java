package org.java.programs;


public class Addition 
{
	
	int num1;
	int num2;
	
	int result;
	
	Addition(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	
	int add()
	{
		return num1+num2
	}
	
    public static void main( String[] args )
    {
        Addition a=new Addition(20, 30);
        a.add();
    }
}
