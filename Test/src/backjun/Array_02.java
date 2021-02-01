package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array_02 {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		final int  NUM = 9;
		int []arr = new int[NUM];				// 배열 0 ~9개까지 생성
		
		int cnt = 0;							// 줄 수 카운트
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {			// 0~9까지 arr배열에 입력값 저장
			arr[i] = Integer.parseInt(br.readLine());	
			if(max<=arr[i]) {
				max = arr[i];					// max값 구하기
			}
		}
		// max값 저장된 위치찾기
		for(int i=0;i<arr.length;i++) {
			if(max == arr[i]){
				cnt = i+1;
			}
		}

		
		

		bw.write(max+"\n"+cnt);
		bw.flush();
		bw.close();
		
		
		
		
	}

}