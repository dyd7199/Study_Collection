package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class OX {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 입력 개수
		int N = Integer.parseInt(br.readLine());
		// 문자열 저장할 1차원 배열 생성
		String []str = new String[N];
		
		// 배열에 문자열 입력 저장
		for(int i=0;i<str.length;i++) {
			str[i] = br.readLine();
			
		}

		// 카운트 
		int[] cnt = new int[N];			// 초기값 0으로 세팅되어 있음
		
		int addSco = 0;						// 점수 배수
		
		// 각 문자열 개수 N개 
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str[i].length();j++) {		
				//O문자 찾기
				if(str[i].charAt(j) == 'O') {
					if(j > 0 && str[i].charAt(j-1) == str[i].charAt(j)) {
						// 다음값이 같다.
						addSco++;
					}else {
						addSco=0;
					}
					cnt[i]++;			// 
					cnt[i] += addSco;
				} 
			}
		}
		
		//test 출력
		for (int i = 0; i < N; i++) {
			bw.write(cnt[i]+"\n");
		}
		bw.flush();
		bw.close();
	}

}