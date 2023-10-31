/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author LENOVO
 */
public class Variable2 {
    private int sisiKubus;
    private int panjangBalok;
    private int lebarBalok;
    private int tinggiBalok;
    
    protected Variable2(int sisiKubus){
        this.sisiKubus = sisiKubus;
    }
    
    protected Variable2(int panjang, int lebar, int tinggi){
        this.panjangBalok = panjang;
        this.lebarBalok = lebar;
        this.tinggiBalok = tinggi;
    }
    
    public int getSisi(){
        return sisiKubus;
    }
    
    public int getPanjangBalok(){
        return panjangBalok;
    }
    
    public int getLebarBalok(){
        return lebarBalok;
    }
    
    public int getTinggiBalok(){
        return tinggiBalok;
    }
}
