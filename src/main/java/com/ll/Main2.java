package com.ll;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        new App().run();
    }
}
class App{
    void run(){
        System.out.println("프로그램 실행");
        System.out.println("== 명언 앱 ==");

        while(true) {
            System.out.print("명령) ");

            Scanner scan = new Scanner(System.in);
            String cmd = scan.nextLine();

            if(cmd.equals("종료")) {
                break;
            }

            else if(cmd.equals("등록")) {
                System.out.println("명언 : ");
                String content = scan.nextLine();
                System.out.println("작가 : ");
                String authorName = scan.nextLine();

                System.out.println("1번 명언이 등록되었습니다.");
            }

            System.out.printf("입력하신 명령 : %s\n", cmd);

        }
    }
}