import java.util.Scanner;

public class javaedu1_1{
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		float avg;
		Scanner scan  = new Scanner(System.in);
		kor1 = scan.nextInt();
		kor2 = scan.nextInt();
		kor3 = scan.nextInt();
		if(0<kor1 && kor1<10) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		System.out.println(kor1);
		System.out.println(kor2);
		System.out.println(kor3);
	}
}