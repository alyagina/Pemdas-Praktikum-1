/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum11;
import java.util.Scanner;

public class Praktikum1Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Deklarasi
        String nama, nim, prodi;
        //Input
        System.out.print("Nama: "); nama = input.nextLine();
        System.out.print("NIM: "); nim = input.nextLine();
        System.out.print("Program Studi: "); prodi = input.nextLine();
        //Output
        System.out.println("Selamat Datang di Praktikum 1 dan 2. Hallo, " + nama + " dengan NIM " + nim + " dari Program Studi " + prodi + ".");
        
    }
    
}
