package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedReaderWriterEx {
	public static void main(String[] args) throws IOException {

		// BufferedReader ¼±¾ðºÎ 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//
		int T = Integer.parseInt(bf.readLine());		
		int sum = 0;
			

		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer (bf.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			sum = num1 + num2;
			
			bw.write(sum+"\n");
		}

		bw.flush();
		bw.close();

	}
}
