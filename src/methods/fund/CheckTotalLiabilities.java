package methods.fund;

import partner.Supplier;

import java.util.ArrayList;

public class CheckTotalLiabilities {
    public static void execute(ArrayList<Supplier> suppliers) {
        int sum = 0;
        for (Supplier supplier : suppliers) {
            int liablities = supplier.getLiabilities();
            sum += liablities;
        }
        System.out.println("Tổng công nợ còn phải thanh toán là : " +sum);
    }
}
