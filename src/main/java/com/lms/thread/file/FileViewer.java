package com.lms.thread.file;

import java.io.*;

class FileViewer {
	public static void main(String args[]) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
//	 ��Ŭ���������� �� �� ��� �Ʒ� �� �Է��ϰ� Run(ctrl+F11)���� ���� 
//		FileInputStream fis = new FileInputStream(".\\src\\FileViewer.java");

		int data = 0;

		while((data=fis.read())!=-1) {
			char c = (char)data;
			System.out.print(c);
		}
	} 
}