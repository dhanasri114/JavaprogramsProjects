package org.java.programs;

public class Construct 
{
	int id;
	String name;
	int age;
	String email;
	
	Construct(int id,String name, int age,String email)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.email=email;
	}
	
	void student()
	{
		System.out.println("my name :"+name+"\n"+"my age was:"+age+"\n"+"my email is :"+email);
	}
	
	public static void main(String[] args) 
	{
		new Construct(1,"dhanu",22,"dhaniu@gmail.com").student();
	}
}
