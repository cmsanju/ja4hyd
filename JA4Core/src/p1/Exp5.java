package p1;

public class Exp5 {
	
	public static void main(String[] args) {
		
		//converting fundamental data to wrapper class data 
		//Auto Boxing
		
		long l = 2345;
		
		Long ll = new Long(l);
		
		System.out.println(l);
		System.out.println(ll);
		
		Double d = new Double(34.56);
		
		double dd = d;
		
		String str1 = String.valueOf(l);
		String str2 = String.valueOf(dd);
		
	}
}
