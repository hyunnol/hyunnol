package test8;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test2Upgrade {

	//컴퓨터의 랜덤 숫자(1~100)를 사람이 맞추는 게임입니다
	//크다,작다,빙고를 표시해서 사람이 맞추도록 유도하는 게임.
	//빙고이면 시도횟수도 알려주면 좋겠네요
	public static void main(String[] args) {
		
		
		while(true) {
		Scanner sc = new Scanner(System.in); //입력받기 
		System.out.println("번호를 입력하세요");
		System.out.println("1.게임시작  2.게임종료");
		String input1 = sc.next();
		Integer input11 = Integer.valueOf(input1);//입력받은 번호를 int형으로
		if(input11 == 1) {
			System.out.println("게임 시작!");
			int count = 1; //시도 횟수 카운트
			int i = (int)(Math.random()*100+1);//랜덤숫자 받기
			//게임시작! while반복문 
			while(true) {
				
				System.out.println("숫자 세개를 입력하세요");
				Scanner sc1 = new Scanner(System.in);
				String input = sc1.next();
				String[] arr = input.split(",");
				
				
				boolean result = Arrays.asList(arr).contains(i);
				System.out.println(result);
				System.out.println("랜덤 숫자는:" + i);			
			
				
				
				
				
				
			
			
//				if(input2 > i) {
//					System.out.println("더 작게");
//					count ++;
//				}else if (input2 < i) {
//					System.out.println("더 크게");
//					count ++;
//				}else if (input2 == i) {
//					System.out.println("빙고");
//				System.out.println("시도 횟수는:" + count);
//					break;
//					
//				} 
//				
				
				}

		}else if(input11 == 2) {
			System.out.println("게임이 종료되었습니다");
			break;
		}
		

		}
	}

}
