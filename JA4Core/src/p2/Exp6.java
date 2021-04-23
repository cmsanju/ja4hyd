package p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exp6 {
		
	public static void main(String[] args) {
		
		
		Pattern ptr = Pattern.compile(".s");
		
		Matcher mtr = ptr.matcher("hs");
		
		boolean cnd = mtr.matches();
		
		System.out.println(cnd);
		
		boolean nd1 = Pattern.compile(".j").matcher("wj").matches();
		
		System.out.println(nd1);
		
		System.out.println(Pattern.matches("[abc]*", "cc"));
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "Java1231"));
		
	}
}
