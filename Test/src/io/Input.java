package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Input {
	public static void main(String[] args) {
		// 입력 출력 객체 생성
		InputStream is = System.in;
		OutputStream os = System.out;
		// 임시 저장 공간 생성
		byte [] buf = new byte[1024];
		int len = -1;
		
		
		try {
			while((len = is.read(buf)) != -1) {
				// 출력
				os.write(buf, 0, len);
				os.flush();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 스트림 닫기, 해제
				os.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
