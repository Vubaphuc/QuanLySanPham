package sanpham;

import java.util.*;

public class SanPhamService {
    Scanner sc = new Scanner(System.in);


        SanPham sanPham1 = new SanPham("SP01", "IPhone 11", "Điện Thoại", 1, 1000000, "VND");
        SanPham sanPham2 = new SanPham("SP02", "IPhone 12", "Điện Thoại", 2, 1200000, "VND");
        SanPham sanPham3 = new SanPham("SP03", "IPhone 11 Pro", "Điện Thoại", 3, 1200000, "VND");
        SanPham sanPham4 = new SanPham("SP04", "IPhone 11 Pro Max", "Điện Thoại", 4, 1300000, "VND");
        SanPham sanPham5 = new SanPham("SP05", "IPhone 12 Pro", "Điện Thoại", 5, 1500000, "VND");
        //SanPham sanPham = new SanPham();
        SanPham sanPhams[] = {sanPham1,sanPham2,sanPham3,sanPham4,sanPham5};


    public void inDanhSachSanPham() {
        for (int i = 0; i < sanPhams.length; i++) {
            System.out.println(sanPhams[i].toString());
        }

    }


    public void xoaSanPham(String id) {
        for (int i = 0; i < sanPhams.length; i++) {
            if (sanPhams[i].getId().equals(id)){
                sanPhams[i] = null;
                System.out.println("xóa thành công");
            }
        }
        Arrays.stream(sanPhams).forEach(e ->{
            if(e != null)  System.out.println(e);
        });
    }

    public void capNhatsoLuong() {
        System.out.println("nhập Id sản phẩm cần cập nhật");
        String id = sc.nextLine();
        System.out.println("nhập số lượng cần cập nhật");
        int soLuongMoi = sc.nextInt();
        for (int i = 0; i < sanPhams.length; i++) {
            if (sanPhams[i].getId().equals(id)){
                sanPhams[i].setSoLuong(soLuongMoi);
                System.out.println("update thành công!");
            }
        }
    }

    public void timKiemTheoTen() {
        System.out.println("Nhập Tên Sản Phẩm cần tìm: ");
        String keyWord = sc.nextLine();
        for (int i = 0; i < sanPhams.length; i++) {
            if (sanPhams[i].getTenSanpham().equals(keyWord)){
                System.out.println(sanPhams[i].toString());
            }else {
                System.out.println("Không có sản phẩm nào!");
            }
        }

    }

    public void capNhatSoLuong() {
    }

    public void timSoLuongSanPham() {
        for (int i = 0; i < sanPhams.length; i++) {
            if (sanPhams[i].getSoLuong() <5){
                System.out.println(sanPhams[i].toString());
            }else {
                System.out.println("Không có sản phẩm nào!");
            }
        }
    }

    public void timTheoGiaSanPham() {
        System.out.println("Nhập Giá Sản Phẩm cần tìm: ");
        double keyWord = Double.parseDouble(sc.nextLine());
        for (int i = 0; i < sanPhams.length; i++) {
            if (sanPhams[i].getGiaBan() == keyWord){
                System.out.println(sanPhams[i].toString());
            }else {
                System.out.println("Không có sản phẩm nào!");
            }
        }
    }

}