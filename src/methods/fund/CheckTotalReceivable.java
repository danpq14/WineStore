package methods.fund;

import partner.Customer;

import java.text.NumberFormat;
import java.util.ArrayList;

public class CheckTotalReceivable {
    public static void execute(ArrayList<Customer> customers) {
        int sum = 0;
        for (Customer customer: customers) {
           int receivable = customer.getReceivable();
           sum += receivable;
        }
        System.out.println("Tổng số công nợ phải thu là : " + sum);
    }
}
