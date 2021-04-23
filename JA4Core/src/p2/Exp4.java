package p2;


public class Exp4 
{
	int x;
	float f;
	char c;
	boolean b;
	
	public void show()
	{
		int j = 10;
		System.out.println(j);
		System.out.println(x);//0
		System.out.println(f);//0.0
		System.out.println(c);//null
		System.out.println(b);//false
	}
	
	public static void main(String[] args) {
		
		Exp4 e = new Exp4();
		Exp4 e1 = new Exp4();
		
		e.show();
		
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
	}
}


