package baitap.quan_li_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EditProduct {
    static Scanner sc = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    public static void addProduct() {
        String code = null;
        String name = null;
        String delay = null;
        String price = null;
        String describe = null;
        try {
            while (true) {
                try {
                    System.out.println("input id");
                    code = sc.nextLine();
                    if (code.length() <= 0) {
                        throw new Exception("lỗi rỗng");
                    } else
                        break;
                } catch (Exception e) {
                    System.out.println();
                }

            }
            while (true) {
                try {
                    System.out.println("input name");
                    name = sc.nextLine();
                    if (name.length() <= 0) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("lỗi rỗng");
                }

                break;
            }
            while (true) {
                try {
                    System.out.println("input delay");
                    delay = sc.nextLine();
                    if (name.length() <= 0) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("lỗi rỗng");
                }
                break;
            }
            while (true) {
                try {
                    System.out.println("input price");
                    price = sc.nextLine();
                    if (name.length() <= 0) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("lỗi rỗng");
                }
                break;
            }
            while (true) {
                try {
                    System.out.println("input describe");
                    describe = sc.nextLine();
                    if (name.length() <= 0) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("lỗi rỗng");
                }
                break;
            }

            Product product = new Product(code, name, delay, price, describe);
            productList.add(product);
            FileOutputStream fos = new FileOutputStream("E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai17_binaryfile_serialization\\src\\baitap\\quan_li_san_pham\\productManagement.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println("lỗi file không tồn tại");
        } catch (IOException e) {
            System.out.println("lỗi ghi file");
        } catch (NullPointerException e) {
            System.out.println("lỗi");
        }

    }

    public static void showProduct() {
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream("E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai17_binaryfile_serialization\\src\\baitap\\quan_li_san_pham\\productManagement.txt");
            ObjectInputStream osi = new ObjectInputStream(fis);
            obj = osi.readObject();
            fis.close();
            osi.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (obj == null) {
            System.out.println("file rỗng");
        } else {
            System.out.println(obj);
        }
    }
    public static Product searchProduct(){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        for(int i=0;i<productList.size();i++){
            if(name.equals(productList.get(i).getProductName())){
               return productList.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        addProduct();
        showProduct();
        System.out.println(searchProduct());
    }
}
