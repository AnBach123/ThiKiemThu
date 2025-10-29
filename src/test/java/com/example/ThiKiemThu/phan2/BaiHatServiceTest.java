package com.example.ThiKiemThu.phan2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaiHatServiceTest {
BaiHatService baiHatService;
    @BeforeEach
    void setUp() {
        baiHatService = new BaiHatService();
    }

    @Test
    public void tuongDuong_addAccess() {
        baiHatService.addBH(new BaiHat("1","Bai 1","Son Tung",3.5f,"Pop"));
        assertEquals(1,baiHatService.getAll().size());
    }

    @Test
    public void tuongDuong_addNotAccess() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->{
            baiHatService.addBH(new BaiHat("1","Bai 1","Son Tung",-3.5f,"Pop"));
            assertEquals(1,baiHatService.getAll().size());
        });
        assertEquals(ex.getMessage(),"Thoi luong phai nam trong khoang 2p - 5.59p");
    }

    @Test
    public void bienDuoi_addAccess() {
        baiHatService.addBH(new BaiHat("1","Bai 1","Son Tung",2f,"Pop"));
        assertEquals(1,baiHatService.getAll().size());
    }

    @Test
    public void bienDuoi_addNotAccess() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->{
            baiHatService.addBH(new BaiHat("1","Bai 1","Son Tung",1f,"Pop"));
            assertEquals(1,baiHatService.getAll().size());
        });
        assertEquals(ex.getMessage(),"Thoi luong phai nam trong khoang 2p - 5.59p");
    }

    @Test
    public void bienTren_addAccess() {
        baiHatService.addBH(new BaiHat("1","Bai 1","Son Tung",5.58f,"Pop"));
        assertEquals(1,baiHatService.getAll().size());
    }

    @Test
    public void bienTren_addNotAccess() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->{
            baiHatService.addBH(new BaiHat("1","Bai 1","Son Tung",6f,"Pop"));
            assertEquals(1,baiHatService.getAll().size());
        });
        assertEquals(ex.getMessage(),"Thoi luong phai nam trong khoang 2p - 5.59p");
    }

    @AfterEach
    void tearDown() {
        baiHatService = null;
    }
}