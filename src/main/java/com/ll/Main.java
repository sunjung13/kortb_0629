package com.ll;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        ArrayList <String> information1 = new ArrayList<>();
        ArrayList <String> information2 = new ArrayList<>();

        while(true) {
            System.out.print("명령) ");
            String command = scan.nextLine().trim();

            if (command.equals("종료")) {
                break;
            }

            else if (command.equals("등록")) {
                System.out.print("명언 : ");
                String a = scan.nextLine().trim();
                System.out.print("작가 : ");
                String b = scan.nextLine().trim();
                information1.add(a);
                information2.add(b);
                System.out.println(information1.size() + "번 명언이 등록되었습니다.");
            }

            else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("------------------");
                for (int i = 0; i < information1.size(); i++) {
                    System.out.println(i + 1 + " / " + information2.get(i) + " / " + information1.get(i));
                }
            }

            else if (command.equals("삭제")) {
                System.out.print("삭제할 명언의 번호 : ");
                int c = Integer.parseInt(scan.nextLine().trim());
                if (information1.get(c - 1) == null) {
                    System.out.println(c + "번 명언은 존재하지 않습니다.");
                    continue;
                }
                information1.remove(c - 1);
                information2.remove(c - 1);
                information1.add(c -1, null);
                information2.add(c - 1, null);
                System.out.println(c + "번 명언이 삭제되었습니다.");
            }

            else if (command.equals("수정")) {
                System.out.print("수정할 명언의 번호 : ");
                int d = Integer.parseInt(scan.nextLine().trim());
                System.out.println("명언(기존) : " + information1.get(d - 1));
                System.out.print("명언 : ");
                information1.set(d - 1, scan.nextLine().trim());
                System.out.println("작가(기존) : " + information2.get(d - 1));
                System.out.print("작가 : ");
                information2.set(d - 1, scan.nextLine().trim());
            }
        }
    }
}