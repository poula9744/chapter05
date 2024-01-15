package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {
	
	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byBuffImg.jpg");

		byte[] buff = new byte[1024];

		System.out.println("복사 시작");
		while (true) {
			int data = in.read(buff); // 빈 쟁반을 넣어주면, 채워줌

			if (data == -1) {
				System.out.println("복사 끝");
				break;
			}
			out.write(buff);
		}

		in.close();
		out.close();

	}

}
