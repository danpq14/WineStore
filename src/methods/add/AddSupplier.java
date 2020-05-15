package methods.add;

import methods.FactoryMethods;
import partner.Supplier;

import java.util.ArrayList;
import java.util.Scanner;

public class AddSupplier {
    public static void excute(ArrayList<Supplier> suppliers){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhà cung cấp mới :");
        String name = sc.nextLine();
        Supplier newSupp = FactoryMethods.creatSupplier(name);
        suppliers.add(newSupp);
        System.out.println();
    }
}
