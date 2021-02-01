package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Avg {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int []score;
		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		// personSco �� ����
		for(int i=0;i<testCase;i++) {		// testCase�� ��ȸ
			
			st = new StringTokenizer(br.readLine()," ");	// ���پ� testCase�� �Է¹���
			int people = Integer.parseInt(st.nextToken());		// ���� ����� ����
			score = new int[people];	// ���� ���� ����
			double totalScore = 0;	// ���� ����

			for(int j = 0 ; j < people ; j++) {
				int val = Integer.parseInt(st.nextToken());	// ���� ����
				score[j] = val;
				totalScore += val;	// ���� ���� �� 
			}
			
			double avg = totalScore / people;	// ���
			double cnt = 0;	// ��ճѴ� �л��� ��
			
			for(int j=0;j<people;j++) {
				if(avg<score[j]) {		// ��պ��� ������ ���� �л��� �ִ°�?		
					cnt++;
				}
			}
			//���
//			bw.write(Math.round(cnt/people*(double)100*1000)/(double)1000+"%"+"\n");
			bw.write(String.format("%.3f",cnt/people*(double)100 )+"%\n");
		}

		bw.flush();
		bw.close();

	}

}