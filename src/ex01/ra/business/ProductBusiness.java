package ex01.ra.business;

import ex01.ra.entity.Product;

import java.util.*;

public class ProductBusiness {
    public static List<Product> products = new ArrayList<>();

    public static void addProduct(Scanner scanner){
        Product product = new Product();
        product.inputData(scanner);
        products.add(product);
    }

    public static void  displayProducts(){
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
    public static Product findProductById(int id){
        for (Product product : products) {
            if(product.getProductId() == id){
                return product;
            }
        }
        return null;
    }

    public static void updateProduct(Scanner scanner){
        System.out.println("Nhap vao ma san pham can cap nhat ");
        int id = Integer.parseInt(scanner.nextLine());
        Product productById = findProductById(id);
        if(productById!= null){
            boolean checkExit = true;
            do {
                System.out.println("1. Cap nhat ten");
                System.out.println("2. Cap nhat So luong");
                System.out.println("3. thoat");
                System.out.println("Chon thong tin can sua");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("Nhao vao ten can can nhat ");
                        productById.setProductName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Nhap vao so luong ");
                        productById.setQuantity(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 3:
                        checkExit = false;
                        break;
                }
            }while (checkExit);

        } else {
            System.err.println("Khong tim thay san pham nao ");
        }
    }
    public static void  sortProductByQuantityDESC(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getQuantity() - o1.getQuantity();
            }
        });
    }
}
