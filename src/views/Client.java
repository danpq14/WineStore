package views;

import manager.WineStoreManager;
import methods.add.AddProduct;
import partner.Supplier;

import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void MainMenu(WineStoreManager manager) throws IOException {
        manager.importDataFromeFile();
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình quản lí cửa hàng rượu");
        System.out.println("---------Menu Chính----------");
        System.out.println("1. Thêm mới ");
        System.out.println("2. Chỉnh sửa");
        System.out.println("3. Xóa");
        System.out.println("4. Nghiệp vụ kho");
        System.out.println("5. Nhà cung cấp");
        System.out.println("6. Khách hàng");
        System.out.println("7. Quỹ");
        System.out.println("8. Thoát");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                AddMenu(manager);
            case 2:
                EditMenu(manager);
            case 3:
                DeleteMenu(manager);
            case 4:
                InventoryMenu(manager);
            case 5:
                SupplierMenu(manager);
            case 6:
                CustomerMenu(manager);
            case 7:
                fundMenu(manager);
            case 8:
                System.exit(0);
        }
    }

    public static void AddMenu(WineStoreManager manager) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thêm mới");
        System.out.println("1. Thêm mới sản phẩm");
        System.out.println("2. Thêm mới nhà cung cấp");
        System.out.println("3. Thêm mới khách hàng");
        System.out.println("4. Quay lại menu chính");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            manager.addProduct();
        }
        if (choice == 2){
            manager.addSupplier();
        }
        if (choice == 3){
            manager.addCustomer();
        }
        if (choice == 4){
            MainMenu(manager);
        }
        System.out.println("1. Quay lại menu chính");
        System.out.println("2. Quay lại menu thêm");
        int choiceAgain = sc.nextInt();
        sc.nextLine();
        if (choiceAgain == 1) {
            MainMenu(manager);
        }
        else if (choiceAgain == 2) {
            AddMenu(manager);
        }
        else {
            System.out.println("Chọn sai. Sẽ tự động thoát chương trình");
            System.exit(0);
        }
    }

    public static void EditMenu(WineStoreManager manager) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thay đổi thông tin");
        System.out.println("1. Thay đổi sản phẩm");
        System.out.println("2. Thay đổi cung cấp");
        System.out.println("3. Thay đổi khách hàng");
        System.out.println("4. Quay lại menu chính");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            manager.edit();
        }
        if (choice == 2){
            manager.editSupplier();
        }
        if (choice == 3){
            manager.editCustomer();
        }
        if (choice == 4){
            MainMenu(manager);
        }
        System.out.println("1. Quay lại menu chính");
        System.out.println("2. Quay lại menu sửa");
        int choiceAgain = sc.nextInt();
        sc.nextLine();
        if (choiceAgain == 1) {
            MainMenu(manager);
        }
        else if (choiceAgain == 2) {
            EditMenu(manager);
        }
        else {
            System.out.println("Chọn sai. Sẽ tự động thoát chương trình");
            System.exit(0);
        }
    }

    public static void DeleteMenu(WineStoreManager manager) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn xóa mục nào ?");
        System.out.println("1. Xóa sản phẩm");
        System.out.println("2. Xóa nhà cung cấp");
        System.out.println("3. Xóa khách hàng");
        System.out.println("4. Quay lại menu chính");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            manager.removeProduct();
        }
        if (choice == 2) {
            manager.removeSupplier();
        }
        if (choice == 3) {
            manager.removeSupplier();
        }
        if (choice == 4){
            MainMenu(manager);
        }
        System.out.println("1. Quay lại menu chính");
        System.out.println("2. Quay lại menu xóa");
        int choiceAgain = sc.nextInt();
        sc.nextLine();
        if (choiceAgain == 1) {
            MainMenu(manager);
        }
        else if (choiceAgain == 2) {
            DeleteMenu(manager);
        }
        else {
            System.out.println("Chọn sai. Sẽ tự động thoát chương trình");
            System.exit(0);
        }
    }

    public static void InventoryMenu(WineStoreManager manager) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn làm gì ?");
        System.out.println("1. Kiểm tra kho");
        System.out.println("2. Nhập hàng");
        System.out.println("3. Xuất kho");
        System.out.println("4. Quay lại menu chính");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            manager.checkInventory();
        }
        if (choice == 2) {
            manager.importProduct();
        }
        if (choice == 3) {
            manager.exportProduct();
        }
        if (choice == 4){
            MainMenu(manager);
        }
        System.out.println("1. Quay lại menu chính");
        System.out.println("2. Quay lại menu kho");
        int choiceAgain = sc.nextInt();
        sc.nextLine();
        if (choiceAgain == 1) {
            MainMenu(manager);
        }
        else if (choiceAgain == 2) {
            InventoryMenu(manager);
        }
        else {
            System.out.println("Chọn sai. Sẽ tự động thoát chương trình");
            System.exit(0);
        }
    }

    public static void SupplierMenu(WineStoreManager manager) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thông tin nhà cung cấp :");
        System.out.println("1. Kiểm tra công nợ");
        System.out.println("2. Thanh toán công nợ cho nhà cung cấp");
        System.out.println("3. Quay lại menu chính");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            manager.checkSuppiler();
        }
        else if (choice == 2) {
            manager.paymentToSupplier();
        }
        if (choice == 3){
            MainMenu(manager);
        }
        System.out.println("1. Quay lại menu chính");
        System.out.println("2. Quay lại menu nhà cung cấp");
        int choiceAgain = sc.nextInt();
        sc.nextLine();
        if (choiceAgain == 1) {
            MainMenu(manager);
        }
        else if (choiceAgain == 2) {
            SupplierMenu(manager);
        }
        else {
            System.out.println("Chọn sai. Sẽ tự động thoát chương trình");
            System.exit(0);
        }
    }

    public static void CustomerMenu(WineStoreManager manager) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thông tin khách hàng :");
        System.out.println("1. Kiểm tra công nợ");
        System.out.println("2. Khách hàng thanh toán");
        System.out.println("3. Quay lại menu chính");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            manager.checkCustomer();
        }
        else if (choice == 2) {
            manager.paymentCustomer();
        }
        if (choice == 3){
            MainMenu(manager);
        }
        System.out.println("1. Quay lại menu chính");
        System.out.println("2. Quay lại menu khách hàng");
        int choiceAgain = sc.nextInt();
        sc.nextLine();
        if (choiceAgain == 1) {
            MainMenu(manager);
        }
        else if (choiceAgain == 2) {
            CustomerMenu(manager);
        }
        else {
            System.out.println("Chọn sai. Sẽ tự động thoát chương trình");
            System.exit(0);
        }
    }

    public static void fundMenu(WineStoreManager manager) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn làm gì ?");
        System.out.println("1. Kiểm tra tổng công nợ phải thu");
        System.out.println("2. Kiểm tra tổng công nợ phải thanh toán");
        System.out.println("3. Kiểm tra tổng giá trị hàng trong kho");
        System.out.println("4. Quay lại menu chính");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            manager.checkTotalReceivable();
        }
        if (choice == 2) {
            manager.checkToTalLiabilities();
        }
        if (choice == 3){
            manager.checkInventoryValue();
        }
        if (choice == 4){
            MainMenu(manager);
        }
        System.out.println("1. Quay lại menu chính");
        System.out.println("2. Quay lại menu quỹ");
        int choiceAgain = sc.nextInt();
        sc.nextLine();
        if (choiceAgain == 1) {
            MainMenu(manager);
        }
        else if (choiceAgain == 2) {
            fundMenu(manager);
        }
        else {
            System.out.println("Chọn sai. Sẽ tự động thoát chương trình");
            System.exit(0);
        }
    }

    public static void backToMainMenu(WineStoreManager manager) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Quay lại menu chính");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            MainMenu(manager);
        }
        else {
            System.out.println("Nhập sai, sẽ tự động thoát chương trình");
            System.exit(0);
        }
    }
}
