package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		
		Reader fr = new FileReader("C:\\javaStudy\\MS949.txt"); 
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		
		
		br.close();
		
	}

}
//저장방식이 ms949 -- utf파일이 아니어서 깨짐
// [ms949] -- [번역] -- [utf파일]  

//준비물: 주스트림, 번역기, 보조스트림

