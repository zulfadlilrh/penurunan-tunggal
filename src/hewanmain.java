/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class hewanmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hewan hewa=new hewan();
        kuda kud=new kuda();
        paus ikan=new paus();
        System.out.println("paus berjenis tulang :"+ikan.tulang);
hewa.tulang();

        System.out.println("kkuda bernapas dengan :"+kud.nafas);
   hewa.bernafas();
   
   kud.habitat();
   ikan.habitat();
    }
    
}
