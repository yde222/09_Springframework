package com.ohgiraffers.section02.javaconfig;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();
        do {
            System.out.println("===== 메뉴 관리 ======");
            System.out.println("1. 메뉴 전체 조회");
            System.out.println("2. 메뉴 코드로 메뉴 조회");
            System.out.println("3. 신규 메뉴 추가");
            System.out.println("4. 메뉴 수정");
            System.out.println("5. 메뉴 삭제");
            System.out.print("메뉴 관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    menuController.selectAllMenu(); break;
                case 2 :
                    menuController.selectMenuByMenuCode(inputMenuCode()); break;
                case 3 :
                     menuController.registMenu(inputMenu()); break;
                case 4 :
                    menuController.modifyMenu(inputMenu()); break;
                case 5 :
                    break;
                default :
                    System.out.println("잘못 된 번호를 선택하셨습니다.");
                    break;
            }
        } while(true);
    }

    private static Map<String, String> inputMenuCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 코드 입력 : ");
        String menuCode = sc.nextLine();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("menuCode", menuCode);
        return parameter;
    }

    private static Map<String, String> inputMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 이름을 입력하세요 : ");
        String menuName = sc.nextLine();
        System.out.print("메뉴 가격을 입력하세요 : ");
        String menuPrice = sc.nextLine();
        System.out.print("카테고리 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("menuName", menuName);
        parameter.put("menuPrice", menuPrice);
        parameter.put("categoryCode", categoryCode);

        return parameter;
    }

    private static Map<String, String> inputModifyMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 메뉴 코드를 입력하세요 : ");
        String menuCode = sc.nextLine();
        System.out.print("수정할 메뉴 이름을 입력하세요 : ");
        String menuName = sc.nextLine();
        System.out.print("수정할 메뉴 가격을 입력하세요 : ");
        String menuPrice = sc.nextLine();
        System.out.print("수정할 카테고리 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("menuCode", menuCode);
        parameter.put("menuName", menuName);
        parameter.put("menuPrice", menuPrice);
        parameter.put("categoryCode", categoryCode);

        return parameter;
    }
}
