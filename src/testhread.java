
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otmangx
 */

public class testhread {
    
     public static int tab[] = new int[1000];
     
    
    public static void main(String args[]) {
        
        int [] T1 = new int[]{1,2,-1,3,0};
System.out.println(Arrays.toString(T1));
int [] T2 = new int[]{1,2,-1,3,0};
System.out.println("1: "+T1.equals(T2));
System.out.println("2: "+Arrays.equals(T1, T2));
System.out.println("3: "+Arrays.binarySearch(T1, -1));
Arrays.sort(T1);
System.out.println("4: "+Arrays.toString(T1));
Arrays.fill(T1,1,4,55);
System.out.println("5: "+Arrays.toString(T1));
       ArrayList<String> l =new ArrayList<String>();
        for (int i=0;i<1000;i++){
            tab[i] = 0;
        }
        tab[100] = 18;
        threadfind t;
        for (int i=0;i<5;i++) {
         new threadfind(tab, 18).start();
         
        }
        
    }
}
