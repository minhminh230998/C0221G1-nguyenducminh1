package baitap.quan_li_san_pham;

import java.io.Serializable;

public class Product implements Serializable {
    private String productCode;
    private String productName;
    private String productDelay;
    private String price;
    private String describe;

    public Product(String productCode, String productName, String productDelay, String price, String describe) {
        this.productCode = productCode;
        this.productName = productName;
        this.productDelay = productDelay;
        this.price = price;
        this.describe = describe;
    }

    public Product() {
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDelay() {
        return productDelay;
    }

    public void setProductDelay(String productDelay) {
        this.productDelay = productDelay;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productDelay='" + productDelay + '\'' +
                ", price='" + price + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
