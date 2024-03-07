import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {

		// 변수선언
		int num1, num2;
		char ch;
		char ans='n';
		
		Scanner sc = new Scanner(System.in);
		
		do {
		//입력기능
		System.out.print("NUM1 input : ");
		num1 = sc.nextInt();
		
		System.out.print("Oper input :");
		ch = sc.next().charAt(0);
		
		System.out.print("NUM2 imput :");
		num2 = sc.nextInt();
		
		//출력기능
		switch(ch) {
		case '+': System.out.println(num1+""+ch+""+num2+"="+(num1+num2)); break;
		case '-': System.out.println(num1+""+ch+""+num2+"="+(num1-num2)); break;
	    case '*': System.out.println(num1+""+ch+""+num2+"="+(num1*num2)); break;
	    case '/': System.out.println(num1+""+ch+""+num2+"="+((double)num1/num2)); break;
	    default : System.out.println("잘못된입력");
		}
		
		System.out.print("계속 : (y,Y)");
		ans = sc.next() .charAt(0);
		}while( ans=='y' || ans =='Y');
		
	}

}
