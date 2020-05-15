package methods.search;

import partner.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchCustomer {
    public static int excute(ArrayList<Customer> customers, String word) {
        Scanner sc = new Scanner(System.in);
        String customerInfo = word.toString().toLowerCase();
        int found = 0;
        int index = -1;
        for (int i =0; i<customers.size(); i++) {
            String name = customers.get(i).getName().toLowerCase();
            String phone = customers.get(i).getPhoneNumber();
            if (name.contains(customerInfo) || phone.contains(customerInfo)) {
                System.out.println(customers.get(i).toString());
                found++;
                index = i;
            }
        }
        if (found == 0 ) {
            System.out.println("Ko tìm thấy khách hàng. Thêm vào mục khách lẻ ?");
            System.out.println("1. Ok");
            System.out.println("2. Nhập lại");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    for (int i =0; i< customers.size(); i++){
                        String name = customers.get(i).getName().toLowerCase();
                        if (name.equalsIgnoreCase("khách lẻ")) {
                            return i;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập lại tên hoặc số điện thoại khách hàng");
                    String newWord = sc.nextLine();
                    SearchCustomer.excute(customers, newWord);
                    break;
            }
        }
        if (found == 1) {
            return index;
        }
        if (found > 1) {
            System.out.println("Có "+found+" khách hàng trùng với từ khóa");
            System.out.println("Nhập lại tên hoặc số điện thoại chính xác hơn");
            String newWord = sc.nextLine();
            return SearchCustomer.excute(customers, newWord);
        }
        return index;
    }
}
