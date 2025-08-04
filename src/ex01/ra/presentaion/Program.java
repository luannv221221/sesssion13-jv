package ex01.ra.presentaion;

import ex01.ra.business.ProductBusiness;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       do {
           System.out.println("*********************QUẢN LÝ SẢN PHẨM********************\n" +
                   "\n" +
                   "1. Thêm sản phẩm\n" +
                   "2. Danh sách sản phẩm\n" +
                   "3. Cập nhật sản phẩm theo mã sản phẩm\n" +
                   "4. Xóa sản phẩm theo mã sản phẩm\n" +
                   "5. Tìm kiếm sản phẩm theo tên\n" +
                   "6. Sắp xếp sản phẩm theo giá tăng dần\n" +
                   "7. Sắp xếp sản phẩm theo số lượng giảm dần\n" +
                   "8. Thoát");
           System.out.println("Nhap vao lua chon ");
           int choice = Integer.parseInt(scanner.nextLine());
           switch (choice){
               case 1:
                   ProductBusiness.addProduct(scanner);
                   break;
               case 2:
                   ProductBusiness.displayProducts();
                   break;
               case 7:
                    ProductBusiness.sortProductByQuantityDESC();
                   break;
               case 8:
                   System.exit(0);
                   break;
               default:
                   System.err.println("Nhap lai");

           }
       }while (true);

    }
}
