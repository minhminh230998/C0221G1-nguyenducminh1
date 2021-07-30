package baitap.su_dung_arraylist_linkedlist;

public class Product {
    int id;
    String name;
    int price;

    public Product() {
    }

    public Product(int id, String name,int price) {
        this.price = price;
        this.name = name;
        this.id=id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
