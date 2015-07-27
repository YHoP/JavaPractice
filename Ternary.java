
class Ternary {
	public static void main(String[] args){
		
		int a = 569097;
		int b = 728350;
		String result;
		
		result = (a % 2 != 0) ? "Odd" : "Even";
		System.out.println(a + " is " + result);
		
		result = (b % 2 != 0) ? "Odd" : "Even";
		System.out.println(b + " is " + result);
	}
}