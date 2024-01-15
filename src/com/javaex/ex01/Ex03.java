package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		
		//in
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg"); //주스트림: 없으면 못씀
		BufferedInputStream bin = new BufferedInputStream(in); //보조스트림
		
		//out
		OutputStream out = new FileOutputStream("C:\\javaStudy\\buffedImg.jpg"); //주스트림
		BufferedOutputStream bout = new BufferedOutputStream(out); //보조스트림
		
		System.out.println("복사 시작");
		while(true) {
			int data = bin.read();
			
			if(data == -1) {
				System.out.println("복사 끝");
				break;
			}
			
			bout.write(data);
		}
		
		//in.close(); 굳이 할 필요 없음. bin이 다 해줌
		bin.close();
		bout.close();
	}

}
