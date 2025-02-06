import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String word = s.nextLine();
		System.out.println(word.charAt(0));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		boolean flag = s.nextBoolean();
		s.nextLine();
		System.out.println(!flag);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int num = s.nextInt();
		s.nextLine();
		System.out.println(num > 5);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		double num = s.nextDouble();
		s.nextLine();
		System.out.println(num <= 2 && num >= -2);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String word = s.nextLine();
		System.out.println(word.equals("Hello World"));
	}

	public static void q6() {
		//Write question 6 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int num = s.nextInt();
		s.nextLine();
		System.out.print("In: ");
		int num2 = s.nextInt();
		s.nextLine();
		System.out.println(num <= num2);
	}

	public static void q7() {
		//Write question 7 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		double num = s.nextDouble();
		s.nextLine();
		System.out.print("In: ");
		double num2 = s.nextDouble();
		s.nextLine();
		System.out.println(num > num2);
	}

}
