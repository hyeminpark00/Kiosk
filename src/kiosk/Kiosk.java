package kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

        //속성
        private List<MenuItem> menuItem;
        private List<MenuItem> selectedItems;
        private Scanner sc;


        //생성자
        public Kiosk() {
            menuItem = new ArrayList<>();
            selectedItems = new ArrayList<>();
            sc = new Scanner(System.in);

            menuItem.add(new MenuItem(" ShackBurger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
            menuItem.add(new MenuItem(" SmokeShack", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
            menuItem.add(new MenuItem(" Cheeseburger", "W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
            menuItem.add(new MenuItem(" Hamburger", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거"));
        }
        //기능
        //키오스크 실행
        public void start() {
            while (true) {

                System.out.println("[SHAKESHACK MENU]");

                for (int i = 0; i < menuItem.size(); i++) {
                    MenuItem item = menuItem.get(i);
                    System.out.println((i + 1) + "." + item.getName() + " | " + item.getPrice() + " | " + item.getIngredient());
                }
                System.out.println("0. 종료 | 종료");

                System.out.println(" 번호를 입력하여 메뉴를 선택하세요!");
                int number = sc.nextInt();

                switch (number) {
                    case 1:
                        System.out.println("ShackBurger 선택");
                        selectedItems.add(menuItem.get(0));
                        break;

                    case 2:
                        System.out.println("SmokeShack 선택");
                        selectedItems.add(menuItem.get(1));
                        break;

                    case 3:
                        System.out.println("Cheeseburger 선택");
                        selectedItems.add(menuItem.get(2));
                        break;

                    case 4:
                        System.out.println("Hamburger 선택");
                        selectedItems.add(menuItem.get(3));
                        break;

                    case 0:
                        System.out.println("프로그램을 종료합니다.");
                        System.out.println("선택메뉴: ");

                        if (selectedItems.isEmpty()) {
                            System.out.println("선택한 메뉴가 없습니다.");
                        } else {
                            for (MenuItem item : selectedItems) {
                                System.out.println(item.getName() + " | " + item.getPrice() + " | " + item.getIngredient());
                            }
                        }
                        sc.close();
                        return;

                    default:
                        System.out.println("잘못된 입력");
                        break;

                }

            }

        }
    }
