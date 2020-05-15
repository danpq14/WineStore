package methods.customer;

import methods.search.SearchCustomer;
import partner.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckReceivable {
    public static void execute(ArrayList<Customer> customers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên hoặc số điện thoại khách hàng");
        String word = sc.nextLine();
        int index = SearchCustomer.excute(customers, word);
        if (index == -1 ){
            System.out.println("Ko tìm thấy khách hàng như yêu cầu");
        }
        else {
            System.out.println("Công nợ của khách hàng "+customers.get(index).getName()+ " là : "+customers.get(index).getReceivable());
        }
    }
}
