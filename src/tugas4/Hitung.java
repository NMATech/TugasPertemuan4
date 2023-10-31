/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author LENOVO
 */
public class Hitung extends Variable2 {
    public Hitung(int sisiKubus){
        super(sisiKubus);
    }
    
    public Hitung(int panjangBalok, int lebarBalok, int tinggiBalok){
        super(panjangBalok, lebarBalok, tinggiBalok);
    }
    
    public int hitungVolumKubus(){
        int hasil = getSisi() * getSisi() * getSisi();
        return hasil;
    }
    
    public int hitungLuasKubus(){
        int hasil = 6 * (int)Math.pow(getSisi(), 2);
        return hasil;
    }
    
    public int hitungVolumBalok(){
        int hasil = getPanjangBalok() * getLebarBalok() * getTinggiBalok();
        return hasil;
    }
    
    public int hitungLuasBalok(){
        int hasil = 2 * (getPanjangBalok() * getLebarBalok() + getPanjangBalok() * getTinggiBalok() + getLebarBalok() * getTinggiBalok());
        return hasil;
    }
}
