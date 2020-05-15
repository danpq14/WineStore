package methods.add;

import methods.FactoryMethods;
import partner.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class AddCustomer {
    public static void excute(ArrayList<Customer> customers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên Khách hàng mới : ");
        String name = sc.nextLine();
        System.out.println("Nhập Số điện thoại khách hàng : ");
        String phone = sc.nextLine();
        System.out.println("Nhập phần trăm chiết khấu : ");
        int discount = sc.nextInt();
        sc.nextLine();
        Customer newCus = FactoryMethods.creatCustomer(name, phone, discount);
        customers.add(newCus);
        System.out.println("Thêm khách hàng mới thành công");
    }
}
