package p1;

public class Exp1 
{
	private int j = 10;
	        int k = 30;
  protected int l = 50;
    public  int m = 80;
    
    public void disp()
    {
    	System.out.println(j);
    	System.out.println(k);
    	System.out.println(l);
    	System.out.println(m);
    }
	
	
	public static void main(String[] args) {
		
		Exp1 e = new Exp1();
		
		e.disp();
	}
}

class Exp2 extends Exp1
{
	public void disp()
    {
    	//System.out.println(j);
    	System.out.println(k);
    	System.out.println(l);
    	System.out.println(m);
    }
}
