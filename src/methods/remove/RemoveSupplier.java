package methods.remove;

import methods.search.SearchSupplier;
import partner.Supplier;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveSupplier {
    public static boolean execute(ArrayList<Supplier> suppliers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhà cung cấp muốn xóa");
        String word = sc.nextLine();
        int index = SearchSupplier.execute(suppliers, word);
        if (index != -1) {
            System.out.println("Bạn có chắc chắn muốn xóa nhà cung cấp này");
            System.out.println("1. Xóa");
            System.out.println("2. Thoát");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice ==1 ){
                suppliers.remove(index);
                return true;
            }
            else {
                return false;
            }
        }
        if (index == -1) {
            System.out.println("Ko tìm thấy nhà cung cấp");
            return false;
        }
        return false;
    }
}
