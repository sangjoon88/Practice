
public class CallByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByName.disp2(); // 1
		CallByName cbn = new CallByName();

		cbn.disp(); // 2
		cbn.disp2(); // 3
		// 요거는 잘못된 것. 스태틱인지 인스턴스인지 구분이 어렵다. 스태틱은 이렇게 쓰면 안됨.

		int num = 100;

		num = cbn.disp3(num); // 4, 5 요거는 대입후 실행한다는 것도 포함하는건가?
		System.out.println(num); // 6

		String str = new String("Superman");
		System.out.println(str);

		cbn.disp4(str);

	}

	public void disp4(String s) {
		System.out.println(s);
	}

	// 리턴이 없으면 public void disp3(int num) {
	public int disp3(int num) {
		System.out.println(num);
		num++;
		System.out.println(num);

		return num;
	}

	public void disp() { // call by name
		System.out.println("call by name");
	}

	public static void disp2() { // call by name
		System.out.println("call by name 2");
	}
}
