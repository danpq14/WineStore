package methods.remove;

import methods.search.SearchCustomer;
import partner.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveCustomer {
    public static boolean execute(ArrayList<Customer> customers){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên hoặc số điện thoại khách hàng");
        String word = sc.nextLine();
        int index = SearchCustomer.excute(customers, word);
        if (index == -1) {
            System.out.println("Ko tìm thấy khách hàng !!");
            return false;
        }
        else {
            System.out.println("Bạn có chắc chắn muốn xóa nhà cung cấp này");
            System.out.println("1. Xóa");
            System.out.println("2. Thoát");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice ==1 ){
                customers.remove(index);
                return true;
            }
            else {
                return false;
            }
        }
    }
}
