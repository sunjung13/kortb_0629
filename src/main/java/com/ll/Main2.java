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

        System.out.print("명령) ");

        Scanner scan = new Scanner(System.in);
        String cmd = scan.nextLine();

        System.out.printf("입력하신 명령 : %s\n", cmd);
        //위 라인과 아래 라인과 같은 의미
        //System.out.print("입력하신 명령 : " + cmd + "\n");
    }
}