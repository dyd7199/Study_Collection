
// 패키지 선언
// 소스코드 파일이 어떤 패키지에 포함되어있는지 표현
// simple 패키지에 포함된 소스코드라는 것을 알린다.
package simple;

import java.util.Scanner;

// 패키지 심플

// 클래스 정의
// 클래스를 만드는 코드를 작성한다.
// 클래스,  class : 자바 프로그램을 구성하는 기본 단위
public class Hello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("나이: ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("주소: ");
		String address = sc.nextLine();



	}


}	


