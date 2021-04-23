package p2;

public class Exp3 {
	
	static int pincode;
	       int atmpin;
		
	public static void main(String[] args) {
		
		String str1 = "java";
		String str3 = "java";
		String str5 = "bvrit";
		
		String str7 = null;
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append("1.8");
		
		String str2 = new String("java");
		String str4 = new String("java");
		String str6 = new String("java");
		System.out.println(sb);
		System.out.println(str1 == str2);//false
		System.out.println(str1 == str3);//true
		
		System.out.println(str6 .equals( str4));//false
		
		System.out.println(str1.equals(str4));//true
		
		System.out.println(str1 == str5);//false
		
		System.out.println(str4.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str6.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str5.hashCode());
		
		// String   StringBuffer    StringBuilder
		// immutable mutable        mutable but non synchronized
	}
}
