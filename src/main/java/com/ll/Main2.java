package com.ll;

import java.util.ArrayList;
import java.util.List;
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
        int lastQuotatinId = 0;

        List<Quotation> quotations = new ArrayList<>();

        while(true) {
            System.out.print("명령) ");

            Scanner scan = new Scanner(System.in);
            String cmd = scan.nextLine().trim();  //명령어 입력 시에 공백 제거

            if(cmd.equals("종료")) {
                break;
            }

            else if(cmd.equals("등록")) {
                System.out.println("명언 : ");
                String content = scan.nextLine().trim();  //명언 입력 시에 공백 제거
                System.out.println("작가 : ");
                String authorName = scan.nextLine().trim();  //작가 입력시에 공백 제거

                lastQuotatinId++;
                int id = lastQuotatinId;
                Quotation quotation = new Quotation(id, content, authorName);
                quotations.add(quotation);
                System.out.printf("%d번 명언이 등록되었습니다.\n", lastQuotatinId);
            }
            else if (cmd.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("------------------");

                if (quotations.isEmpty()) {
                    System.out.println("등록된 명언이 없습니다.");
                }
                for (int i = quotations.size() - 1; i >= 0; i--) {
                    Quotation quotation = quotations.get(i);
                    System.out.printf("%d / %s / %s\n", quotation.id, quotation.authorName, quotation.content);
                }
            }

        }
    }
}