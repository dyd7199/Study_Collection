package simple;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("���� ���� �� �� �Ѱ��� �Է��ϼ���: ");
			String input = sc.nextLine();

			System.out.println("����� "+input+"�� �½��ϴ�.");

			int random = (int)(Math.random()*3);
			String computer ="";


			switch (random) {
			case 0: computer = "����";

				break;
			case 1: computer  ="����";

				break;
			case 2: computer = "��";

				break;
			}
			
			System.out.println(" ��ǻ�ʹ� "+computer+"�� �½��ϴ�.");
			
			if(input.equals(computer)) {
				System.out.println("�����ϴ�.");
			} else {
				boolean win = false;
				
				if(computer == "����") {
					if("����".equals(input)) {
						win = true;
					}
				}else if("����".equals(computer)){
					if("��".equals(input)) {
						win = true;
					}
					
				}else {
					if("����".equals(input)) {
						win = true;
					}
				}
				
				
				if(win) {
					System.out.println("����� �̰���ϴ�");
					break;
				}else {
					System.out.println("����� �����ϴ�.");
					break;
				}
				
				
				
				
				
			}
			
			
			
		}while(true);


	}
}
