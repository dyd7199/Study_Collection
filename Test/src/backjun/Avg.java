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
		
		// personSco 에 저장
		for(int i=0;i<testCase;i++) {		// testCase번 순회
			
			st = new StringTokenizer(br.readLine()," ");	// 한줄씩 testCase번 입력받음
			int people = Integer.parseInt(st.nextToken());		// 각반 사람수 저장
			score = new int[people];	// 각반 점수 저장
			double totalScore = 0;	// 누적 점수

			for(int j = 0 ; j < people ; j++) {
				int val = Integer.parseInt(st.nextToken());	// 성적 저장
				score[j] = val;
				totalScore += val;	// 성적 누적 합 
			}
			
			double avg = totalScore / people;	// 평균
			double cnt = 0;	// 평균넘는 학생의 수
			
			for(int j=0;j<people;j++) {
				if(avg<score[j]) {		// 평균보다 점수가 높은 학생이 있는가?		
					cnt++;
				}
			}
			//출력
//			bw.write(Math.round(cnt/people*(double)100*1000)/(double)1000+"%"+"\n");
			bw.write(String.format("%.3f",cnt/people*(double)100 )+"%\n");
		}

		bw.flush();
		bw.close();

	}

}