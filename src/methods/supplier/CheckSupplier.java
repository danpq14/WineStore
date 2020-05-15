package methods.supplier;

import methods.search.SearchCustomer;
import methods.search.SearchSupplier;
import partner.Supplier;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckSupplier {
    public static void execute(ArrayList<Supplier> suppliers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhà cung cấp :");
        String word = sc.nextLine();
        int index = SearchSupplier.execute(suppliers, word);
        if (index == -1) {
            System.out.println("Ko tìm thấy nhà cung cấp");
        }
        if (index!=-1) {
            System.out.println("Nhà cung cấp "+suppliers.get(index).getName()+" có công nợ là "+suppliers.get(index).getLiabilities());
        }
    }
}
