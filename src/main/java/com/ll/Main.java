package com.ll;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        while(true) {
            System.out.print("명령) ");
            String command = scan.nextLine();

            if(command.equals("종료")) {
                break;
            }

            else if(command.equals("등록")) {
                System.out.print("명언 : ");
                String a = scan.nextLine();
                System.out.print("작가 : ");
                String b = scan.nextLine();
            }
            System.out.println("번 명언");

        }
    }
}