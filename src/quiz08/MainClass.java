package quiz08;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		User u1 = new User("홍길동", 123123, 20);
		User u2 = new User("김길동", 456456, 30);
		
		User[] arr = new User[2];
		arr[0] = u1;
		arr[1] = u2;
		
		for(User us: arr) { // 향상된 for문
			System.out.println(us.getName());
			System.out.println(us.getRrn());
			System.out.println(us.getAge());
		}
		
		User[] arr2 = new User[5];
		
		int i = 0;
		while(i < arr2.length) {
			
			Scanner scan = new Scanner(System.in);
			
			String n = scan.next();
			int r = scan.nextInt();
			int a = scan.nextInt();
			
			User u = new User(n, r, a);
			arr2[i] = u;	
			
			System.out.println(Arrays.toString(arr2));
			
			i++;
			
		}
		
		
		
		
		
//		System.out.println("----------문제1----------");
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 */

//		System.out.println("----------문제2----------");
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */

//		System.out.println("----------문제3----------");
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 
		 * 스캐너를 User 안에 쓰라는 뜻이 아닙니다.(x) 메인에서 사용자한테 입력받은 값(o)
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		
		
	}

}
