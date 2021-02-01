package simple;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("가위 바위 보 중 한개를 입력하세요: ");
			String input = sc.nextLine();

			System.out.println("당신은 "+input+"를 냈습니다.");

			int random = (int)(Math.random()*3);
			String computer ="";


			switch (random) {
			case 0: computer = "가위";

				break;
			case 1: computer  ="바위";

				break;
			case 2: computer = "보";

				break;
			}
			
			System.out.println(" 컴퓨터는 "+computer+"를 냈습니다.");
			
			if(input.equals(computer)) {
				System.out.println("비겼습니다.");
			} else {
				boolean win = false;
				
				if(computer == "가위") {
					if("바위".equals(input)) {
						win = true;
					}
				}else if("바위".equals(computer)){
					if("보".equals(input)) {
						win = true;
					}
					
				}else {
					if("가위".equals(input)) {
						win = true;
					}
				}
				
				
				if(win) {
					System.out.println("당신이 이겼습니다");
					break;
				}else {
					System.out.println("당신이 졌습니다.");
					break;
				}
				
				
				
				
				
			}
			
			
			
		}while(true);


	}
}
