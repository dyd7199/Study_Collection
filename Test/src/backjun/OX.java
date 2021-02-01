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

		// �Է� ����
		int N = Integer.parseInt(br.readLine());
		// ���ڿ� ������ 1���� �迭 ����
		String []str = new String[N];
		
		// �迭�� ���ڿ� �Է� ����
		for(int i=0;i<str.length;i++) {
			str[i] = br.readLine();
			
		}

		// ī��Ʈ 
		int[] cnt = new int[N];			// �ʱⰪ 0���� ���õǾ� ����
		
		int addSco = 0;						// ���� ���
		
		// �� ���ڿ� ���� N�� 
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str[i].length();j++) {		
				//O���� ã��
				if(str[i].charAt(j) == 'O') {
					if(j > 0 && str[i].charAt(j-1) == str[i].charAt(j)) {
						// �������� ����.
						addSco++;
					}else {
						addSco=0;
					}
					cnt[i]++;			// 
					cnt[i] += addSco;
				} 
			}
		}
		
		//test ���
		for (int i = 0; i < N; i++) {
			bw.write(cnt[i]+"\n");
		}
		bw.flush();
		bw.close();
	}

}