/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.i.praktikumpbo_6;

import praktikum6.hewan;
import praktikum6.kucing;

/**
 *
 * @author acer
 */
public class PraktikumPBO_6 {

    public static void main(String[] args) {
        hewan kucing = new kucing();
        kucing.bersuara();
        kucing.makan("ikan");
        kucing.makan("ikan", 2);
    }
}
