/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D-18
 */
public class Main {
    public static void main(String[] args) {
        Mobilbaru Mobilbaru = new Mobilbaru("Toyota", "Avanza", "3 tahun");
        mobilbekas mobilbekas = new mobilbekas("Honda", "Hyundai", 2018, 200000000);
        Dealer Dealer = new Dealer("Mobilindo", Mobilbaru, mobilbekas);
        Dealer.info();
    }
}
