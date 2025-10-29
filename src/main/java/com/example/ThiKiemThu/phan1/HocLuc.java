package com.example.ThiKiemThu.phan1;

public class HocLuc {
    public int XetDiemHocLuc(int diem) {
        String hocLuc ;
        if (diem >= 9 || diem <= 10) hocLuc = "Xuat sac";
        else if (diem >=7 || diem < 9) throw new IllegalArgumentException("Gioi");
        else if (diem >=5 || diem < 7) throw new IllegalArgumentException("Trung binh");
        else if (diem <5 || diem == 0) throw new IllegalArgumentException("Yeu");
        if (diem < 0 || diem > 10) throw new IllegalArgumentException("Diem khong hop le");
        return diem;
    }
}
