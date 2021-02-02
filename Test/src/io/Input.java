package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Input {
	public static void main(String[] args) {
		// �Է� ��� ��ü ����
		InputStream is = System.in;
		OutputStream os = System.out;
		// �ӽ� ���� ���� ����
		byte [] buf = new byte[1024];
		int len = -1;
		
		
		try {
			while((len = is.read(buf)) != -1) {
				// ���
				os.write(buf, 0, len);
				os.flush();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// ��Ʈ�� �ݱ�, ����
				os.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
