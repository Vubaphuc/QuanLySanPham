import sanpham.SanPham;
import sanpham.SanPhamService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            SanPhamService sanPhamService = new SanPhamService();
            System.out.println("Danh Mục Lựa Chọn");
            System.out.println("1 - Xem danh sách sản phẩm");
            System.out.println("2 - Tìm sản phẩm theo tên");
            System.out.println("3 - Tìm sản phẩm theo id:");
            System.out.println("4 - Tìm các sản phẩn có số lượng dưới 5");
            System.out.println("5 - Tìm sản phẩm theo mức giá:");
            System.out.println("0 - Thoát Chương Trình");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    sanPhamService.inDanhSachSanPham();
                    break;
                case 2:
                    sanPhamService.timKiemTheoTen();
                    break;
                case 3:
                    while (true) {
                        System.out.println("3.1: Xóa sản phẩm");
                        System.out.println("3.2: Cập nhật số lượng sản phẩm");
                        int menu2 = sc.nextInt();
                        switch (menu2) {
                            case 1:
                                sanPhamService.xoaSanPham();
                                break;
                            case 2:
                            break;
                        }
                        break;
                    }
                case 4:
                    sanPhamService.timSoLuongSanPham();
                    break;
                case 5:
                    sanPhamService.timTheoGiaSanPham();
                    break;
                case 0:
                    System.out.println("Thoát Chương Trình");
                    System.exit(0);
                    break;
            }
        }

    }
}