/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author acer
 */
// Level 1 - Superclass paling atas
class Kendaraan {
    String nama;
    int kecepatan;
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}