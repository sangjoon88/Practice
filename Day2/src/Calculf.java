import java.util.Scanner;

public class Calculf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // System.in : 내키보드를 인식하겠다

		// 변수를 정해주는 부분

		int num1, num2;
		char ch;
		char ans = 'n';
		int result = 0;
		do {
			// 입력함수 호출
			num1 = Calculf.inputInt(sc);
			ch = Calculf.inputChar(sc);
			num2 = Calculf.inputInt(sc);
			
			// 연산함수 호출
			switch (ch) {
			case '+':
				result = add(num1, num2);
				break;
			case '-':
				result = sub(num1, num2);
				break;
			case '*':
				result = mul(num1, num2);
				break;
			case '/':
				result = div(num1, num2);
				break;
			}
			// 출력함수 호출
			disp(num1, ch, num2, result);
			System.out.println("계속 : (Y,y)");
			ans = inputChar(sc);

		} while (ans == 'y' || ans == 'Y');
	}

	// 여기부터 함수가 뭔지 정의 해줌
	public static void disp(int num1, char ch, int num2, int result) { // 디스플레이 함수
		System.out.println(num1 + "" + ch + "" + num2 + "=" + result);
	}

	public static int inputInt(Scanner sc) { // 입력하는 함수 Scanner sc가 뭐지?
		int num = sc.nextInt();
		return num;
	}

	public static char inputChar(Scanner sc) { // 캐릭터 넣는 함수
		char ch = sc.next().charAt(0);
		return ch;
	}

	public static int add(int num1, int num2) { // 덧셈
		return num1 + num2;
	}

	public static int sub(int num1, int num2) { // 뺄셈
		return num1 - num2;
	}

	public static int mul(int num1, int num2) { // 곱셈
		return num1 * num2;
	}

	public static int div(int num1, int num2) { // 나눗셈
		return num1 / num2;
	}
}
