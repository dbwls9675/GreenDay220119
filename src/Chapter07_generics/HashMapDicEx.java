package Chapter07_generics;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("baby","아기");
		hm.put("love","사랑");
		hm.put("apple","사과");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			String kor=hm.get(name);
			if(kor==null) {
				System.out.println(name+"는 없는 단어입니다.");
			}else {
				System.out.println(kor);
			}
		}

	}

}
