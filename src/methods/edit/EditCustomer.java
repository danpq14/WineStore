package methods.edit;

import methods.search.SearchCustomer;
import partner.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class EditCustomer {
    public static void execute(ArrayList<Customer> customers){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên hoặc số điện thoại khách hàng muốn chỉnh sửa");
        String word = sc.nextLine();
        int index = SearchCustomer.excute(customers,word);
        if (index == -1) {
            System.out.println("Ko tìm thấy khách hàng như yêu cầu");
        }
        else {
            System.out.println("Nhập tên mới khách hàng :");
            String newName = sc.nextLine();
            System.out.println("Nhập số điện thoại mới :");
            String phone = sc.nextLine();
            System.out.println("Nhập công nợ mới khách hàng :");
            int receivable = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập phần trăm chiết khấu mới :");
            int discount = sc.nextInt();
            sc.nextLine();
            customers.get(index).setName(newName);
            customers.get(index).setPhoneNumber(phone);
            customers.get(index).setReceivable(receivable);
            customers.get(index).setDiscountPercent(discount);
            System.out.println("Thay đổi thông tin khách hàng thành công");
        }
    }
}
