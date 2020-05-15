package methods.customer;

import methods.search.SearchCustomer;
import partner.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentCustomer {
    public static void execute(ArrayList<Customer> customers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên hoặc số điện thoại khách hàng");
        String word = sc.nextLine();
        int index = SearchCustomer.excute(customers, word);
        if (index == -1) {
            System.out.println("Ko tìm thấy khách hàng như yêu cầu");
        }
        else {
            System.out.println("Nhập số tiền khách hàng thanh toán");
            int pay = sc.nextInt();
            sc.nextLine();
            int old = customers.get(index).getReceivable();
            customers.get(index).setReceivable(old - pay);
            System.out.println("Thanh toán thành công");
        }
    }
}
