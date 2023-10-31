/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hitung kubus = new Hitung(4);
        Hitung balok = new Hitung(4, 4, 2);
        
        System.out.println("Luas dari kubus adalah = " + kubus.hitungLuasKubus());
        System.out.println("Volume dari kubus adalah = " + kubus.hitungVolumKubus());
        
        System.out.println("\nLuas dari balok adalah = " + balok.hitungLuasBalok());
        System.out.println("Volume dari balok adalah = " + balok.hitungVolumBalok());
    }
}
