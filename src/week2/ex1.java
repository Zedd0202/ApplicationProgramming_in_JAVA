package week2;

import java.util.Random;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MARK : exercise 2.1
		//왜 main안에서 static으로 method로 선언하는가? 메인 안에서 어디서든지 접근하려면 반드시 static이어야한다. 메인 안에서 사용하려면
		//메인 밖에서 선언하면 static으로 선언해야함. 안쓰면 에러 ㅋ
		Scanner input = new Scanner(System.in);
		Random randomGenerator = new Random();
		while (true) {
			int a = randomGenerator.nextInt(10);// not include 100.
			int b = randomGenerator.nextInt(10);
			System.out.println("How much is " + a + " times " + b + " ? ");
			System.out.print("Enter your answer (-1 to exit): ");
			int q = input.nextInt();
			if (q == a * b) {
				System.out.println("Nice work!");
				continue;
			}
			if (q == -1)
				break;
			else if ((q != a * b) && (q != -1)) {
				while (true) {
					System.out.println("No. Keep trying.!");
					System.out.print("Enter your answer (-1 to exit): ");
					int p = input.nextInt();
					if (p == a * b) {
						System.out.println("Nice work!");
						break;

					}
				}

			}

		}

	}

	}


