/* this : 자기자신을 접근하는 객체 레퍼런스변수
 * 인스턴스 메소드의 첫번째 매개변수로 항상 존재한다
 * 선언할수는 없고, 사용만 가능하다
 * 객체를 구별해주는 역할 ( 함수는 하나밖에 없는데 얘인지 예인지 구분해주는 역할) = > 디폴트 기능
 * 
 * 1. 필드명과 지역변수 이름이 같을 경우 필드를 구별하기 위해 사용한다
 * 2. instance method 에서 자기자신의 객체를 리턴하고 싶을 때, this를 명시적으로 사용한다
 * 
 * 
 * this() : 괄호는 함수호출
 * this 호출은 자기자신의 또다른 생성자를 호출하는 것이다.
 * 
 * 
 */
public class ThisExam {

	int a;
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a=a;								//필드 a 로 연결해줌
	}
	
	
	public static void main(String []args) {
			ThisExam th=new ThisExam();
			
			th.setA(100);
			System.out.println(th.getA());
		
		
		
	}

}
