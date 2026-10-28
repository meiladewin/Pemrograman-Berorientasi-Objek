/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author acer
 */
class Anjing extends Hewan {
    public void bersuara() {
        System.out.println("Anjing bersuara: Guk guk!");
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara();
    }
}
