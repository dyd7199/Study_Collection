package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class While_01 {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num = Integer.parseInt(br.readLine());	// 입력
		
		int savNum = num;		// 초기값 저장
		int cnt = 0;
		
		int temp = 0;
		
		while(true) {			// 반복문
			
			
			// 십의자리 추출
			int tenPlace = num / 10;
			// 일의자리 추출
			int onePlace = num % 10;
			
			temp = onePlace;							// 일의자리 저장
			onePlace = (onePlace + tenPlace)%10;		// 일의자리 십의자리 더한 값을 다시 일의 자리에 넣는다.
			
			num = temp*10 + onePlace;				// 새로운수
			
			cnt++;			// 카운트
			if(num == savNum||num == 0) {						// 초기값과 같다면 break;
				break;
			}
											// 카운트
			
			
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		
		
		
	}

}