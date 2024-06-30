package com.ll;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        int num = 1;
        String[] a = new String[100];
        String[] b = new String[100];
        int size = a.length;

        while(true) {
            System.out.print("명령) ");
            String command = scan.nextLine();

            if(command.equals("종료")) {
                break;
            }

            else if(command.equals("등록")) {
                for(int i = 0; i < size; i++) {
                    System.out.print("명언 : ");
                    a[i] = scan.nextLine();
                    System.out.print("작가 : ");
                    b[i] = scan.nextLine();

                    System.out.println(num++ + "번 명언이 등록되었습니다.");
                }
            }

            else if(command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("------------------");
                for(int i = 0; i < size; i++) {
                    System.out.println(i + " / " + a[1] + " / " + b[1]);
                }
            }

        }
    }
}