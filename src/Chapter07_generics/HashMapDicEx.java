package Chapter07_generics;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("baby","�Ʊ�");
		hm.put("love","���");
		hm.put("apple","���");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("ã�� ���� �ܾ��?");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			String kor=hm.get(name);
			if(kor==null) {
				System.out.println(name+"�� ���� �ܾ��Դϴ�.");
			}else {
				System.out.println(kor);
			}
		}

	}

}
