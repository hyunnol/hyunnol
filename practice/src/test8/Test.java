package test8;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("첫번째 숫자를 입력해주세요");	
	String input1 = sc.next();
	System.out.println("두번째 숫자를 입력해주세요");
	String input2 = sc.next();
	
	Integer input11 = Integer.valueOf(input1);
	Integer input22 = Integer.valueOf(input2);
	
	System.out.println( "두 수의 합은:" +(input11 + input22));
	
	
	

	}

}
