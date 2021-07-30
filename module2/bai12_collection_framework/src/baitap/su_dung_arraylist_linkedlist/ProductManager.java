package baitap.su_dung_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    List<Product> productList = new ArrayList<Product>();

    public void showList() {
        productList.sort(Comparator.comparing(Product::getPrice));
        for (Product s : productList) {
            System.out.println(s);
        }

    }

    public void addProduct() {
        int id;
        do {
            System.out.println("nhập id");
            id = sc.nextInt();
            if (checkId(id)) {
                break;
            }
        } while (true);
        System.out.println("nhập tên");
        String name = sc.next();
        System.out.println("nhập giá");
        int price = sc.nextInt();
        productList.add(new Product(id, name, price));
    }

    public void removeProduct() {
        System.out.println("nhập id");
        int id = sc.nextInt();
        boolean check = false;
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                check = true;
                index = i;
                break;
            }
        }
        if (check = true) {
            productList.remove(index);
        } else {
            System.out.println("không tồn tại id");
        }
    }

    public boolean checkId(int id) {
        for (Product product :
                productList) {
            return !(product.getId() == id);
        }
        return true;
    }

    public void editProduct() {
        System.out.println("nhập id bạn muốn sửa");
        int id = sc.nextInt();
        boolean check = false;
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                check = true;
                index = i;
                break;
            }
        }
        if (check) {
            System.out.println("hãy thay đổi");
            System.out.println("tên sản phẩm mới");
            String newName = sc.next();
            System.out.println("giá tiền mới");
            int newPrice = sc.nextInt();
            productList.set(index, new Product(id, newName, newPrice));

        } else {
            System.out.println("không tồn tại id");
        }
    }

    public void seachProduct() {
        System.out.println("nhập tên để tìm kiếm");
        String name = sc.nextLine();
        boolean check = false;
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                check = true;
                index = i;
            }
        }
        if (check) {
            System.out.println(productList.get(index));
        } else {
            System.out.println("không tìm thấy " + name);
        }
    }

    public void Menu() {
        System.out.println("Bạn muốn làm gì");
        System.out.println("1. Thêm");
        System.out.println("2. Tìm kiếm");
        System.out.println("3. Xóa");
        System.out.println("4. Sửa");
        System.out.println("5. Hiển thị sản phẩm");
        System.out.println("6. Thoát");

        int nhap = sc.nextInt();
        sc.skip("\\R");
        switch (nhap) {
            case 1:
                addProduct();
                showList();
                break;
            case 2:
                seachProduct();
                break;
            case 3:
                removeProduct();
                showList();
                break;
            case 4:
                editProduct();
                showList();
                break;
            case 5:
                showList();
            case 6:
                System.exit(0);
        }
    }
}


