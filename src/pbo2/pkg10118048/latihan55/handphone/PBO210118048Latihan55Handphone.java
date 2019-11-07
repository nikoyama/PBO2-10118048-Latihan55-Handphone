/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan55.handphone;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan handphone berdasarkan OS
 */
public class PBO210118048Latihan55Handphone {

    public static void main(String[] args) {
        
        Android andro = new Android("Samsung", "Android", "Grand", 3_000_000);
        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2_000_000);
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1_000_000);
        
        andro.setKeyStore("234ibfd3840fo");
        andro.displayProduct();
        System.out.println("Android Key Store : " + andro.getKeyStore());
        System.out.println("");
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN\t\t: " + bb.getPinBB());
        System.out.println("");
        wp.setWpKeyStore("UUUQIKWORJ");
        wp.displayProduct();
        System.out.println("Wp Key Store\t: " + wp.getWpKeyStore());
    }

}
