/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author acer
 */
public class NewMain {
    public static void main(String[] args) {
         kendaraan_ mobil = new kendaraan_("Toyota", "Avanza", 2020);
        
        System.out.println("merek: " + mobil.getMerek());
        System.out.println("model: " + mobil.getModel());
        System.out.println("tahun: " + mobil.getTahun());
        
        mobil.setModel("Innova");
        mobil.setTahun(2021);
        
        System.out.println("model baru: " + mobil.getModel());
        System.out.println("tahun baru: " + mobil.getTahun());
    }
}
