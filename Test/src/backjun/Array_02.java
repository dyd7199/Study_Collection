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
		int []arr = new int[NUM];				// �迭 0 ~9������ ����
		
		int cnt = 0;							// �� �� ī��Ʈ
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {			// 0~9���� arr�迭�� �Է°� ����
			arr[i] = Integer.parseInt(br.readLine());	
			if(max<=arr[i]) {
				max = arr[i];					// max�� ���ϱ�
			}
		}
		// max�� ����� ��ġã��
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