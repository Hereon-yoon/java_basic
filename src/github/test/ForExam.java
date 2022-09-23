package github.test;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int user = sc.nextInt();
		for (int i = 0; i < user; i++) {
			for (int j = 1; j <= user; j++) {
				if (i >= user - j) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}

	}

}
