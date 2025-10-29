package com.example.ThiKiemThu.phan1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HocLucTest {
HocLuc hocLuc;
    @BeforeEach
    void setUp() {
        hocLuc = new HocLuc();
    }

    @Test
    public void tuongDuong_hocLucAccess() {
            assertEquals(5,hocLuc.XetDiemHocLuc(5));
    }

    @Test
    public void tuongDuong_hocLucNotAccess() {
        assertThrows(IllegalArgumentException.class,()->{
            assertEquals(-5,hocLuc.XetDiemHocLuc(-5));
        });
    }

    @Test
    public void bienDuoi_hocLucNotAccess() {
        assertThrows(IllegalArgumentException.class,()->{
            assertEquals(-1,hocLuc.XetDiemHocLuc(-1));
        });
    }

    @Test
    public void bienTren_hocLucNotAccess() {
        assertThrows(IllegalArgumentException.class,()->{
            assertEquals(11,hocLuc.XetDiemHocLuc(11));
        });
    }

    @Test
    public void bienTren_hocLucAccess() {
            assertEquals(10,hocLuc.XetDiemHocLuc(10));
    }

    @AfterEach
    void tearDown() {
        hocLuc = null;
    }
}