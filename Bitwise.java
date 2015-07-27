class Bitwise {
	public static void main(String[] args){
		int a = 58;
		System.out.println("Flag 1 : " + (((a&1)>0) ? "On" : "Off"));
		System.out.println("Flag 2 : " + (((a&2)>0) ? "On" : "Off"));
		System.out.println("Flag 3 : " + (((a&3)>0) ? "On" : "Off"));
		System.out.println("Flag 4 : " + (((a&4)>0) ? "On" : "Off"));
		System.out.println("Flag 5 : " + (((a&5)>0) ? "On" : "Off"));
		System.out.println("Flag 6 : " + (((a&6)>0) ? "On" : "Off"));
		System.out.println("Flag 7 : " + (((a&7)>0) ? "On" : "Off"));
		System.out.println("Flag 8 : " + (((a&8)>0) ? "On" : "Off"));
	}	
}