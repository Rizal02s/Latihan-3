/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D-18
 */
class Dealer {

    private String nama;
    private Mobilbaru mobilBaru;
    private mobilbekas mobilBekas;

    public Dealer(String nama, Mobilbaru Mobilbaru, mobilbekas mobilbekas) {
        this.nama = nama;
        this.mobilBaru = Mobilbaru;
        this.mobilBekas = mobilbekas;
    }

    public String getNama() {
        return nama;
    }

    public void info() {
        System.out.println("Dealer: " + nama);
        mobilBaru.info();
        mobilBekas.info();
    }
}
