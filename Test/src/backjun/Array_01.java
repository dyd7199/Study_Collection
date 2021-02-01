package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Array_01 {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num = Integer.parseInt(br.readLine());		// 개수입력
		
		int[]temp = new int[num];
		
								// 띄어쓰기로 구분하여 입력받음
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		// temp에 값모두 넣음
		for(int i=0;st.hasMoreTokens();i++) {
			temp[i] =Integer.parseInt(st.nextToken());
		}
		// 비교
		int max = temp[0];
		int min = temp[0];
		for(int i=0;i<temp.length;i++) {
			if(temp[i]>=max) {
				max = temp[i];
			}else if(temp[i] < min) {
				min = temp[i];
			}
		}
		bw.write(String.valueOf(min)+" "+String.valueOf(max));
		

		bw.flush();
		bw.close();
		
	}

}