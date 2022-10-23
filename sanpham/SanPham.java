package sanpham;

import java.util.ArrayList;

public class SanPham {
    private String id;
    private String tenSanpham;
    private String moTa;
    private int soLuong;
    private double giaBan;
    private String donViGia;

    public SanPham() {
    }

    public SanPham(String id, String tenSanpham, String moTa, int soLuong, double giaBan, String donViGia) {
        this.id = id;
        this.tenSanpham = tenSanpham;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.donViGia = donViGia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSanpham() {
        return tenSanpham;
    }

    public void setTenSanpham(String tenSanpham) {
        this.tenSanpham = tenSanpham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getDonViGia() {
        return donViGia;
    }

    public void setDonViGia(String donViGia) {
        this.donViGia = donViGia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id='" + id + '\'' +
                ", tenSanpham='" + tenSanpham + '\'' +
                ", moTa='" + moTa + '\'' +
                ", soLuong=" + soLuong +
                ", giaBan=" + giaBan +
                ", donViGia='" + donViGia + '\'' +
                '}';
    }
}
