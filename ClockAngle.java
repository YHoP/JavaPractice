import java.util.*;

public class ClockAngle{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.printf("Clock Hour (12 hour format): ");
		int h = sc.nextInt();
		System.out.printf("Clock minute: ");
		int m = sc.nextInt();
		System.out.println("The degree between the hour and minute hands is " + angleDegree(h, m) + " degree.");
	}
	
	public static Double angleDegree(int h, int m){
		double cAngle = 0;
		double hAngle = 0;
		double mAngle = 0;
		if((h > 0 && h <= 12) && (m >=0 && m <=60)){
			hAngle = (h*60 + m)*0.5;
			mAngle = m*6;
			cAngle = Math.abs(hAngle - mAngle);
			cAngle = Math.min(cAngle, 360-cAngle);
			// System.out.println("Hour hand angle: " + hAngle);
			// System.out.println("Minute hand angle: " + mAngle);
			// System.out.println("Clock angle: " + cAngle);
		}else{
			System.out.println("Invalid input!");
		}
		return cAngle;
	}
}
