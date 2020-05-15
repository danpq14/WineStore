package views;

import manager.WineStoreManager;
import product.Wine;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        WineStoreManager manager = new WineStoreManager();
        Client.MainMenu(manager);
    }
}
