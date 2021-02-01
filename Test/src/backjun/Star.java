package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Star {
	public static void main(String[] args) throws IOException {

		// BufferedReader ¼±¾ðºÎ 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(bf.readLine());
		for(int i=0;i<num;i++) {
			for(int j=num;j>0;j--) {	
//				if(i<=j-2) {
//					bw.write(" ");
//				}else {
//					bw.write("*");
//				}
				bw.write(i<=(j-2)?" ":"*");
						
			}								
			bw.write("\n");		
		}
		

		bw.flush();
		bw.close();
		
	}
}
