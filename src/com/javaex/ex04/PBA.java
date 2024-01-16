package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

public class PBA {

	public static void main(String[] args) throws IOException {
		
		
		
		// Reader 준비
		// 리더 + 버퍼 --> PhoneDB.txt UTF-8
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		// Writer 준비
		// 라이터 + 버퍼
		Writer wr = new FileWriter("C:\\javaStudy\\phoneDB.txt", true);
		BufferedWriter bw = new BufferedWriter(wr);
						
		// 정보 추가
		bw.newLine();
		bw.write("이은빈,010-0000-0000,031-111-1111");
		
		
		// 리스트 만들기
		ArrayList<Person> pList = new ArrayList<Person>();
		

		// 반복
		while (true) {
			// 파일을 한줄 읽는다
			String str = br.readLine();

			
			// null이면 반복문을 나간다 (글자가 없으면) --> 순서 중요
			if (str == null) {
				break;
			}

			// ,로 분리한다
				// name
				// hp
				// company
			String[] personInfo = str.split(",");
			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];

			Person p01 = new Person(personInfo[0], personInfo[1], personInfo[2]);
			Person p02 = new Person(personInfo[0], personInfo[1], personInfo[2]);
			Person p03 = new Person(personInfo[0], personInfo[1], personInfo[2]);
			Person p04 = new Person(personInfo[0], personInfo[1], personInfo[2]);
		
			
			pList.add(p01);
			pList.add(p02);
			pList.add(p03);
			pList.add(p04);

			// 출력한다
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
		}

		// 종료
		br.close();
		bw.close();

	}

}
