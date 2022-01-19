package Chapter07_generics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<4;i++) {
			System.out.print("�̸��� �Է��ϼ���>>");
			String name = sc.next();
			a.add(name);
		}
		for(int i = 0;i<a.size();i++) {
			String name = a.get(i);
			System.out.print(name+" ");
		}
		int longestIdx = 0;
		for(int i=1;i<a.size();i++) {
			if(a.get(longestIdx).length()<a.get(i).length()) {
				longestIdx=i;
			}
		}

		System.out.println("���� �� �̸��� : "+a.get(longestIdx));
	}
}
