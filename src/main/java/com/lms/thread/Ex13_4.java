package com.lms.thread;

import javax.swing.JOptionPane;

class Ex13_4 {
	public static void main(String[] args) throws Exception {
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���."); 
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");

		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);  // 1�ʰ� �ð��� �����Ѵ�.
			} catch(Exception e ) {}
		}
	}
}