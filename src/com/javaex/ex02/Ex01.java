package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws Exception{
		
		Writer fw = new FileWriter("C:\\javaStudy\\song.txt"); //주스트림
		BufferedWriter bw = new BufferedWriter(fw); //보조 스트림
		
		bw.write("학교종이 땡땡땡 ");
		bw.newLine(); //줄 바꿈
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		bw.newLine();
		
		bw.close();
	}

}
