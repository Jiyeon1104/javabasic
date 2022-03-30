package Q2;

class H {
	static int a;
	
	static {
		a = 8;
		// 클래스가 로딩될 때 static block을 자동 실행
	}
	
	H () {
		a = 8;
		// 객체가 찍힐 때 a = 8로 초기화 함
	}
}
// System.out.println(H.a); // 결과 8

/* 정적 초기화 블록
 * 일반적으로 필드의 초기화는 객체가 만들어진 시점에서 이루어짐
 * 즉 객체가 생성자에서 만들어지므로 생성자 내에서 필드를 초기화하는 것이 일반적임
 * 그러나 정적 필드 객체의 생성 이전에도 사용할 수 있도록 해야 하기 때문에
 * 생성자가 호출되지 않은 상태에서도 초기화 할 수 있어야 함
 * 생성자에서 정적 필드를 초기화 할 수는 없으므로 정적 필드를 초기화하기 위한 문법이 별도로 제공됨
 * 이것이 바로 정적 초기화 블록임
 
 * static {
 *  클래스가 메모리에 로딩될 때 실행되는 내용
 *  }
 
 * 정적 초기화 블록 클래스가 메모리에 로딩될 때 가장 먼저 실행되므로 여기에 
 * 정적 필드의 초기화 코드를 넣어두면 클래스가 로딩되는 시점에서 바로 초기화 할 수 있게 됨 
 */