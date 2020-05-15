package methods.search;

import partner.Supplier;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchSupplier {
    public static int execute(ArrayList<Supplier> suppliers, String word){
        Scanner sc = new Scanner(System.in);
        for (int i =0; i< suppliers.size(); i++) {
            String name = suppliers.get(i).getName().toLowerCase();
            word = word.toLowerCase();
            if (name.contains(word)) {
                suppliers.get(i).toString();
                return i;
            }
        }
        return -1;
    }
}
