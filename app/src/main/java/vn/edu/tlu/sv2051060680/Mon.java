package vn.edu.tlu.sv2051060680;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "mon")
public class Mon {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int maMon;
    private String tenMon;
    private int maLoai;
    private String moTa;
    private Float donGia;
    private String hinh;

    // Constructor công khai mà có các tham số phù hợp với các trường
    public Mon(int maMon, String tenMon, int maLoai, String moTa, Float donGia, String hinh) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.maLoai = maLoai;
        this.moTa = moTa;
        this.donGia = donGia;
        this.hinh = hinh;
    }

    // Constructor rỗng
    public Mon() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter và Setter cho các trường
    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Float getDonGia() {
        return donGia;
    }

    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
}
