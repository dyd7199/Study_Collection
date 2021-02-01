package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array1D_01 {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 10�� ¥�� �迭 ����
		int []arr = new int[10];
		
		int cnt = 0;
		int temp = 0;
		// �Է°� 10�� ¥�� �迭�� ����
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;		//42�� ���� �������� �迭�� ����
		}
		// �˻�
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					arr[j] = -1;			// ���� ���� -1���� ����ִ´�.
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