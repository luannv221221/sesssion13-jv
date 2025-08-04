package ex01.ra.entity;

import java.util.Scanner;

public class Product {
    private int productId;
    private String productName;
    private float price;
    private String categoryName;
    private int quantity;

    public Product() {
    }

    public Product(int productId, String productName, float price, String categoryName, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.categoryName = categoryName;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void inputData(Scanner scanner){
        inputProductId(scanner);
        inputProductName(scanner);
        inputQuantity(scanner);
    }
    public void inputProductId(Scanner scanner){
        do {

            try {
                System.out.println("Moi ban nhap vao product Id ");
                this.productId = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception exception){
                System.err.println("Phai la so nguyen");

            }
        } while (true);
    }
    public void inputProductName(Scanner scanner){
        // valiate
        System.out.println("Nhap vao ten san pham");
        this.productName = scanner.nextLine();
    }

    public void inputQuantity(Scanner scanner){
        // validate
        System.out.println("Nhap vao so luong ");
        this.quantity = Integer.parseInt(scanner.nextLine());
    }
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", categoryName='" + categoryName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
