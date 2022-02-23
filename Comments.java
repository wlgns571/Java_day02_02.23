
package java_day02_inout;

public class Comments {
	// 단일 주석
//	int intVal = 1; -> Ctrl + /
	
	// 다중 주석
	/*
	 * 다중 주석
	 * ㅡㅡㅡㅡㅡㅡ
	 * ㅡㅡㅡㅡㅡㅡ
	 * ㅡㅡㅡㅡㅡㅡㅡ
	 */
	
	// 자바 문서(javadoc) 주석
	// 해당 변수위에 마우스 커서를 위에 올리면 설명 주석이 딸려온다.
	/**
	 * 가장 맛있는 과일은
	 */
	static String orange = "오렌지";
	
	public static void main(String[] args) {
		String banana = "바나나";
		System.out.println(banana);
		// TODO 바나나를 콘솔에 출력해야함
		
		System.out.println(orange);
	}
	
	// TODO 주석 [윈도우에 Tasks]
	
}
