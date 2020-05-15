package methods.edit;

import methods.search.SearchSupplier;
import partner.Supplier;

import java.util.ArrayList;
import java.util.Scanner;

public class EditSupplier {
    public static void execute(ArrayList<Supplier> suppliers){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhà cung cấp muốn chỉnh sửa");
        String word = sc.nextLine().toLowerCase();
        int index = SearchSupplier.execute(suppliers,word);
        if (index == -1) {
            System.out.println("Ko tìm thấy nhà cung cấp");
        }
        else {
            System.out.println("Nhập tên mới : ");
            String newName = sc.nextLine();
            System.out.println("Nhập công nợ mới :");
            int newL = sc.nextInt();
            sc.nextLine();
            suppliers.get(index).setName(newName);
            suppliers.get(index).setLiabilities(newL);
            System.out.println("Thay đổi thành công");
        }
    }
}
