package p10.project2;

import java.util.Scanner;

public class Memmain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("회원수 입력 ? :");

		int memnum = sc.nextInt();
		Mem mem[] = new Mem[memnum]; // mem배열 생성

		for (int i = 0; i < mem.length; i++) { //키,몸무게,나이등 값을 입력할수 있게 만듦
			mem[i] = new Mem();
		}
		
		boolean run = true;
		while (run) {
			System.out.println("번호 입력하기 ? (1.정보입력, 2.정보출력, 3.비만 정도 출력, 4.종료)");

			int num = sc.nextInt();
			if (num == 1) {
				for (int i = 0; i < mem.length; i++) {
					System.out.println("이름 ? :");
					mem[i].name = sc.next();
					System.out.println(mem[i].name + "님의 키? : ");
					mem[i].ki = sc.nextDouble();
					System.out.println(mem[i].name + "님의 몸무게? : ");
					mem[i].we = sc.nextDouble();
					System.out.println(mem[i].name + "님의 나이? : ");
					mem[i].age = sc.nextInt();
					System.out.println(mem[i].name + "님의 전화번호 뒷자리? : ");
					mem[i].tel = sc.nextInt();
				}
				
				System.out.println("====================");
				System.out.println();
			} else if (num == 2) {
				System.out.println("[회원 정보 출력]");
				for (int i = 0; i < mem.length; i++) {
					
					System.out.println("이름 : " + mem[i].name);
					System.out.println(mem[i].name + "님의 키 : " + mem[i].ki);
					System.out.println(mem[i].name + "님의 몸무게 : " + mem[i].we);
					System.out.println(mem[i].name + "님의 나이 : " + mem[i].age);
					System.out.println(mem[i].name + "님의 전화번호 뒷자리 : " + mem[i].tel);
					System.out.println("====================");
					System.out.println();
				}
				
			} else if (num == 3) {
				System.out.println("[회원 비만도 출력]");
				for (int i = 0; i < mem.length; i++) {
					mem[i].c = mem[i].we / ((mem[i].ki - 100) * 0.9) * 100;
					if (mem[i].c < 100) {
						
						System.out.println(mem[i].name+"님은 저체중입니다");
						System.out.println("비만도 :"+mem[i].c);
						System.out.println("차이값은 " + (100-mem[i].c));
						System.out.println();
					} else if (mem[i].c < 110) {					
						System.out.println(mem[i].name+"님은 정상입니다");
						System.out.println("비만도 :"+mem[i].c);
						System.out.println();
					} else {
						System.out.println(mem[i].name+"님은 과체중입니다");
						System.out.println("비만도 :"+mem[i].c);						
						System.out.println("차이값은 " + (mem[i].c - 110));
						System.out.println();
					}
				}
			} else if (num == 4) {
				System.out.println("[종료]");
				run = false;
			}else {
				System.out.println("숫자를 다시 입력해주세요");
			}
			
		}
		sc.close();
	}

}
