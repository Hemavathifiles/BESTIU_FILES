package org.tns.capgemini.c2tc.oops;

class Human1
{
	private int age;
	private String name;

			public void setAge(int a)
			{
				age=a;
			}

			public int getAge()
				{
					return age;
				}
			
			public void setName(String n)
			{
				name=n;
			}
			public String getname()
			{
				return name;
			}

}

public class Encapsulation {

	public static void main(String[] args) {
		Human1 obj=new Human1();
		Human1 obj2=new Human1();
		obj.setAge(12);
		obj.setName("Neha");
		System.out.println(obj.getAge());
		System.out.println(obj.getname());
		
		obj2.setAge(17);
		obj2.setName("Vishu");
		System.out.println(obj2.getAge());
		System.out.println(obj2.getname());
	
	}

}
