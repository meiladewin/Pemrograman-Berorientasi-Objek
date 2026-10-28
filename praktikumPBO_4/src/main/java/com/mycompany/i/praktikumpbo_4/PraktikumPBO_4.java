/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.i.praktikumpbo_4;

import praktikum4.kendaraan;

/**
 *
 * @author acer
 */
public class PraktikumPBO_4 {
        public static void main(String[] args) {
        kendaraan mobil = new kendaraan("Toyota", "Avanza", 2020);
        
        System.out.println("merek: " + mobil.getMerek());
        System.out.println("model: " + mobil.getModel());
        System.out.println("tahun: " + mobil.getTahun());
        
        mobil.setModel("Innova");
        mobil.setTahun(2021);
        
        System.out.println("model baru: " + mobil.getModel());
        System.out.println("tahun baru: " + mobil.getTahun());
    }
}