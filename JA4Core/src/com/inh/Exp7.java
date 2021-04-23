package com.inh;

@FunctionalInterface
interface Inf2 // inside the interface only one abstract method is there  functional interface 
{
	void disp(int x);
	//void show();
	//void dog();
	
}

public class Exp7 {
	
	public static void main(String[] args) {
		
		Inf2 obj = new Inf2()
				{
					public void disp(int x)
					{
						System.out.println("overriding inf2");
					}
					
					public void show()
					{
						
					}
				};
			obj.disp(30);
			
			new Inf2()
			{
				public void disp(int x)
				{
					System.out.println("overrided");
				}
				public void show()
				{
					
				}
			}.disp(30);
			
			Inf2 oj = (int x) -> System.out.println("hello this is lambda expressions");
			oj.disp(20);
	}

}
