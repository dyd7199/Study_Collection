package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class While_01 {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num = Integer.parseInt(br.readLine());	// �Է�
		
		int savNum = num;		// �ʱⰪ ����
		int cnt = 0;
		
		int temp = 0;
		
		while(true) {			// �ݺ���
			
			
			// �����ڸ� ����
			int tenPlace = num / 10;
			// �����ڸ� ����
			int onePlace = num % 10;
			
			temp = onePlace;							// �����ڸ� ����
			onePlace = (onePlace + tenPlace)%10;		// �����ڸ� �����ڸ� ���� ���� �ٽ� ���� �ڸ��� �ִ´�.
			
			num = temp*10 + onePlace;				// ���ο��
			
			cnt++;			// ī��Ʈ
			if(num == savNum||num == 0) {						// �ʱⰪ�� ���ٸ� break;
				break;
			}
											// ī��Ʈ
			
			
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		
		
		
	}

}