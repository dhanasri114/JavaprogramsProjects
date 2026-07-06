package org.java.programs;

public class Construct 
{
	int id;
	String name;
	int age;
	
	Construct(int id,String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	void student()
	{
		System.out.println("my name :"+name+"\n"+"my age was:"+age+"\n");
	}
	
	public static void main(String[] args) 
	{
		new Construct(1,"dhanu",22).student();
	}
}
