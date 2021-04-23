package p1;

public class Exp6 {
		
	public static void main(String[] args) {
		
		try
		{
			//System.out.println(1/0);
		 System.out.println("Hello");
		
		 System.out.println(10/2);
		
		 System.out.println("java");
		
		 String name = null;
		
		 System.out.println(name.charAt(3));
		
		 System.out.println("ok");
		
		
		 String[] ar = {"java",".net","python"};
		
		 System.out.println(ar[1]);
		}
		//System.out.println();
		catch(ArithmeticException ae)
		{
			System.out.println("can't divided by zero");
		}
		catch(StringIndexOutOfBoundsException sie)
		{
			System.out.println("check you name length");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("check array size");
		}
		
		catch(Exception e)
		{
			//1 using getMessage();
			System.out.println(e.getMessage());//only message
			//2 by printing exception class object
			System.out.println(e);//exceptions class name and message
			//3 using printStackTrace();
			e.printStackTrace();
		}
		//System.out.println();
		finally
		{
			System.out.println("i am from finally block");
		}
	}
}
