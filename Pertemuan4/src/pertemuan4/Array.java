/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;


import java.util.Scanner;
/**
 *
 * @author KADEK ARLANDI MAHESA GAUTAMA PUTRA
 * 2201010241
 * 22-04-24
 */
public class Array {
    int jdata = 5;
    String[] dTeman = new String[jdata];
    Scanner dtIN = new Scanner(System.in);
    
    public void storedata(){
       System.out.println("Isikan data teman");
       System.out.println("=================");
       
       int num=0;
       for(int i=0; i<jdata; i++){
           num++;
           System.out.print("Data ke-"+num+": ");
           dTeman[i] = dtIN.nextLine();
       }
/**        
       System.out.print("Data ke-1: ");
       dTeman[0] = dtIN.nextLine();
       
       System.out.print("Data ke-2: ");
       dTeman[1] = dtIN.nextLine();
       
       System.out.print("Data ke-3: ");
       dTeman[2] = dtIN.nextLine();
       
       System.out.print("Data ke-4: ");
       dTeman[3] = dtIN.nextLine();
       
       System.out.print("Data ke-5: ");
       dTeman[4] = dtIN.nextLine();
       */
    }
    public void viewdata(){
        System.out.println("");
        System.out.println("");
        System.out.println("DAFTAR TEMAN");
        System.out.println("============");
        
        int no=0;
        for(int i=0; i<jdata; i++){
            no++;
            
            System.out.println(no+". "+dTeman[i]);
        }
    }
    public void editdata(){
        System.out.println("UBAH DATA TEMAN");
        System.out.println("===============");
        System.out.print("Index data yang diubah");
        
        String id = dtIN.nextLine();
        int idx = Integer.parseInt(id);
        
        System.out.println("Data yang di ubah: "+dTeman[idx]);
        System.out.print("Di ubah menjadi: ");
        String newdt = dtIN.nextLine();
        dTeman[idx] = newdt;
        System.out.println("Data index ke-"+idx+" telah diubah");
    }
}
