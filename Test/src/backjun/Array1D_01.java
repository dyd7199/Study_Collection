package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array1D_01 {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 10개 짜리 배열 생성
		int []arr = new int[10];
		
		int cnt = 0;
		int temp = 0;
		// 입력값 10개 짜리 배열에 삽입
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;		//42로 나눈 나머지를 배열에 삽입
		}
		// 검사
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					arr[j] = -1;			// 같은 수면 -1값을 집어넣는다.
				}
			}
		}
		
		for(int value : arr) {
			if(value != -1) {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();

	}

}