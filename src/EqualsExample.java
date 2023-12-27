public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = "홍길동"; //1. 문자열 리러털 생성(리터럴 풀로 문자열을 관리 : 같은 문자열 할당시 메모리 재사용을 위해)
		String strVar2 = "홍길동";

		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		if(strVar1 == strVar2)

		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}

		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		System.out.println(System.identityHashCode(strVar1));
		System.out.println(System.identityHashCode(strVar2));
		System.out.println(System.identityHashCode(strVar3));
		System.out.println(System.identityHashCode(strVar4));

		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음"); //2. new 연산자로 생성
		} else {
			System.out.println(strVar3 == strVar4);
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}