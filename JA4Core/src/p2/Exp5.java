package p2;

public class Exp5 {
	
	public static void main(String[] args) {
		
		String name = "java";
		
		StringBuffer sb = new StringBuffer(name);
		
		sb.reverse();
		
		System.out.println(sb);
		
		for(int i = name.length()-1; i >=0; i -- )
		{
			System.out.print(name.charAt(i));
		}
	}
}
