package java_day03;

public class Day03_Test2 {
	public static void main(String[] args) {
		// 삼항 연산자를 이용해서
		// 아래의 주민번호 뒷자리의 첫번째 숫자에 따른 성별을 받는
		// gender 변수에 담아 콘솔에 출력하시오.
		// 항상 주민번호 뒷자리 첫번째 숫자가 홀수면 남성, 짝수면 여성
		
		String hisIdBack = "1231476";
		String herIdBack = "4254654";
		
		String hisFirst = hisIdBack.substring(0,1);
		String herfirst = herIdBack.substring(0,1);
		
		int hisFirst1 = Integer.parseInt(hisFirst);
		int herFirst1 = Integer.parseInt(herfirst);
		
		hisFirst1 = hisFirst1 % 2;
		herFirst1 = herFirst1 % 2;
		
		int gen = 0;
		String gender = (gen == 1) ? "여성" : "남성";
		
		System.out.println(gender);
	}
}
