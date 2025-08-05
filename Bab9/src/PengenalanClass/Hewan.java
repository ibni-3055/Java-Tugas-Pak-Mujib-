/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PengenalanClass;

/**
 *
 * @author Dwi Handayani
 */
public class Hewan {
    
    public String jeniskelamin;
    public int umur;
    public String warnabulu;
    
    //coantructor default
    public Hewan() {
    }
    
    //constructor dengan parameter
    
    public Hewan(String jeniskelamin, int umur, String warnabulu) {
        this.jeniskelamin = jeniskelamin;
        this.umur = umur;
        this.warnabulu = warnabulu;
    }
    
    public String melompat() {
        return "Anjing melompat dengan lincah!";
    }
    
    public String melompat(String parameter) {
        String perilaku = "Anjing melompati" + parameter + ".";
        return perilaku;
    }
    
    public void memakan() {
        System.out.println("Anjing sedang memakan daging");
    }
    
    public void memakan(String parameter) {
        System.out.println("Anjing sedang memakan" + parameter + ".");
    }
    
    public static void main(String[] args) {
        Hewan anjing = new Hewan();
    anjing.jeniskelamin = "jantan";
    anjing.umur = 5;
    anjing.warnabulu = "cokelat";
    
    System.out.println("anjing" + anjing.jeniskelamin + "berumur"
    + anjing.umur + "tahun berbulu" + anjing.warnabulu);
    //cara memanggil prosedur
    System.out.println(anjing.melompat("Kursi"));
    //cara memanggil Prosedur
    anjing.memakan();
    //cara memanggil Prosedur
    anjing.memakan("daging");
    }

    
  
}

