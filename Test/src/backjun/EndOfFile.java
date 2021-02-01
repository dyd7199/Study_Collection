package backjun;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String args[]) throws Exception {
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//
//		while (true) {
//			
//			
//			
//			
//			st = new StringTokenizer(br.readLine());
//			
//			
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			bw.write(a + b + "\n");
//			bw.flush();
//		}
//	
		
		
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
		}
		
	}

}