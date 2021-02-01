package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EnglishWord {

	
	
	
	
	
	
	
	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 개수 입력
		
		String str = br.readLine();
		
		char []arr = {'a','b','c','d','e','f','g','h','i','j','k',
					'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int []intArr = new int[26];
		
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = -1;
		}
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<arr.length;j++) {
				if(str.charAt(i) == arr[j] && intArr[j] == -1) 
					intArr[j] = i;
			
			}
			
		}
		
		
		
		for(int i=0;i<intArr.length;i++) {
			bw.write(intArr[i]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
		
		
		
		
	}

	
	
}