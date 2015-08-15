import java.util.*;

public class NumbersToWords{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.printf("Please input a number: ");
		int number = sc.nextInt();		
		if(number == 0){
		System.out.println("zero");
		}else{
		System.out.println(numberWord(number));
		}
		
		// System.out.println(wDigits(number));
		// System.out.println(tenDigits(number));
		
	}
	
	public static String numberWord(int n){
		String ns = Integer.toString(n);
		char[] clist = ns.toCharArray();
		int x = clist.length;
		ArrayList<String> list = new ArrayList();
		for(int i = x; i <= 0; i--){
			list.add(getContian(n, i));
		}
		String print = String.join(" ", list);
		return print;
	}
	
	public static String wDigits(int n){
		HashMap<Integer, String> digitsWord = new HashMap();
		digitsWord.put(0, "");
		digitsWord.put(1, "one");
		digitsWord.put(2, "two");
		digitsWord.put(3, "three");
		digitsWord.put(4, "four");
		digitsWord.put(5, "five");
		digitsWord.put(6, "six");
		digitsWord.put(7, "seven");
		digitsWord.put(8, "eight");
		digitsWord.put(9, "nine");
		String digi = digitsWord.get(n);
		return digi;
	}
	
	public static String tenDigits(int n){
		HashMap<Integer, String> tensWord = new HashMap();
		tensWord.put(0, "");
		tensWord.put(1, "ten");
		tensWord.put(2, "twenty");
		tensWord.put(3, "thirty");
		tensWord.put(4, "forty");
		tensWord.put(5, "fifty");
		tensWord.put(6, "sixty");
		tensWord.put(7, "seventy");
		tensWord.put(8, "eighty");
		tensWord.put(9, "ninety");
		String tens = tensWord.get(n);
		return tens;
	}
	
	public static String getContian(int k, int i){
		String ks = Integer.toString(k);
		char[] cns = ks.toCharArray();
		int x = cns.length;
		String m = "";
		switch(i){
			case 0:
			int x1 = x - i;
			int n1 = Character.getNumericValue(cns[x1]);
			m = wDigits(n1);
				break;
			case 1:
			int x2 = x - i;
			int n2 = Character.getNumericValue(cns[x2]);
			m = tenDigits(n2);
				break;
			case 3:
			int x3 = x - i;
			int n3 = Character.getNumericValue(cns[x3]);
			m = wDigits(n3) + " hundred";
				break;
			case 4:
			int x4 = x - i;
			int n4 = Character.getNumericValue(cns[x4]);
			m = wDigits(n4) + " thousand";
				break;
			case 5:
			int x5 = x - i;
			int n5 = Character.getNumericValue(cns[x5]);
			m = tenDigits(n5);
				break;
			case 6:
			int x6 = x - i;
			int n6 = Character.getNumericValue(cns[x6]);
			m = wDigits(n6) + " hundred";
				break;
			case 7:
			int x7 = x - i;
			int n7 = Character.getNumericValue(cns[x7]);
			m = wDigits(n7) + " million";
				break;
			case 8:
			int x8 = x - i;
			int n8 = Character.getNumericValue(cns[x8]);
			m = tenDigits(n8);
				break;
			case 9:
			int x9 = x - i;
			int n9 = Character.getNumericValue(cns[x9]);
			m = wDigits(n9) + " hundred";
				break;
			case 10:
			int x10 = x - i;
			int n10 = Character.getNumericValue(cns[x10]);
			m = wDigits(n10) + " billion";
				break;
			case 11:
			int x11 = x - i;
			int n11 = Character.getNumericValue(cns[x11]);
			m = tenDigits(n11);
				break;
			case 12:
			int x12 = x - i;
			int n12 = Character.getNumericValue(cns[x12]);
			m = wDigits(n12) + " hundred";
				break;
			case 13:
			int x13 = x - i;
			int n13 = Character.getNumericValue(cns[x13]);
			m = wDigits(n13) + " trillion";
				break;
			case 14:
			int x14 = x - i;
			int n14 = Character.getNumericValue(cns[x14]);
			m = tenDigits(n14);
				break;
			case 15:
			int x15 = x - i;
			int n15 = Character.getNumericValue(cns[x15]);
			m = wDigits(n15) + " hundred";
				break;
			default:
			m = "The number is too large to convert!";
				break;
		}
		return m;
	}
}
