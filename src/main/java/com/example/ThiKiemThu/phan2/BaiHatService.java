package com.example.ThiKiemThu.phan2;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    List<BaiHat> listBH = new ArrayList<>();
    BaiHat baiHat = new BaiHat("1","Bai 1","Son Tung",3.5f,"Pop");
    List<BaiHat>getAll() {
        return listBH;
    }

    public void addBH(BaiHat bh) {
        if (bh == null) throw new IllegalArgumentException("Bai hat khong duoc trong");
        if (bh.getMa() == null || bh.getMa().trim().isEmpty()
            ||bh.getTen() == null || bh.getTen().trim().isEmpty()
            ||bh.getTenCaSi() == null || bh.getTenCaSi().trim().isEmpty()
            ||bh.getThoiLuong() == null
            ||bh.getTheLoai() == null || bh.getTheLoai().trim().isEmpty()) {
            throw new IllegalArgumentException("Cac truong khong duoc bo trong");
        }
        if (bh.getThoiLuong() < 2 || bh.getThoiLuong() >5.59)
            throw new IllegalArgumentException("Thoi luong phai nam trong khoang 2p - 5.59p");
        listBH.add(bh);
    }
}
