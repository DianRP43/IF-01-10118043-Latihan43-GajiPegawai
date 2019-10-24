
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner inpu = new Scanner(System.in);
    System.out.println("judul");
    GajiPegawai gp = new GajiPegawai();
    System.out.println("=====");
    System.out.println("NAMA\t: ");
    String nama = inpu.nextLine();
    System.out.println("ALAMAT\t: ");
    String alamat = inpu.nextLine();            
    System.out.println("Uang Transport\t: ");
    int ut = inpu.nextInt();    
    gp.setUangTransport(ut);
    System.out.println("Uang Tunjangan\t: ");
    int utan = inpu.nextInt();
    gp.setUangTunjangan(utan);
    System.out.println("Gaji Pokok\t: ");
    int gpo = inpu.nextInt();
    gp.setGajiPokok(gpo);
    
    gp.tampilData(gp.totalGaji(ut, utan, gpo));
            
    }
}
