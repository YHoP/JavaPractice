
class EscapingLiterals {
	public static void main(String[] args){
		
		int a = 569097;
		int b = 728350;
		String result;
		
		String c = "ABCD\nNewLine";
		String d = "ABCD\tTab";
		String e = "ABCD\bBackspace";
		String f = "ABCD\rCarriageReturn";
		String g = "ABCD\fFormfeed";
		String h = "ABCD\\BackSlash";
		String i = "ABCD\'SingleQuoteMark";
		String j = "ABCD\"DobleQuoteMark";		
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
	}
}