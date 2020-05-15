package methods.supplier;

import methods.search.SearchSupplier;
import partner.Supplier;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentToSupplier {
    public static void execute(ArrayList<Supplier> suppliers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhà cung cấp :");
        String word = sc.nextLine();
        int index = SearchSupplier.execute(suppliers, word);
        if (index == -1) {
            System.out.println("Ko tìm thấy nhà cung cấp");
        }
        if (index!=-1) {
            suppliers.get(index).toString();
            System.out.println("Nhập số tiền thanh toán cho nhà cung cấp :");
            int pay = sc.nextInt();
            sc.nextLine();
            int old = suppliers.get(index).getLiabilities();
            suppliers.get(index).setLiabilities(old - pay);
            System.out.println("Thanh toán cho nhà cung cấp thành công!!!");
        }
    }
}
