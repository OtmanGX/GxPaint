/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otmangx
 */
public class threadfind extends Thread {
        public static int n=-1;
        int mynumber;
        static boolean find = false;
        int tab[], x;
        public threadfind(int []tab, int num_searched){
            this.tab = tab;
            this.x = num_searched;
            mynumber = ++n;
            System.out.println("Thread N"+mynumber);
        }
        public void run(){
            if (find) {
                System.out.println("Thread N"+mynumber+" est arreté");
                return ;
            }
            for (int i = mynumber*200;i<(mynumber+1)*200 && !find;i++) {
                if (tab[i]==x) {
                    System.out.println("L'indice est: "+i);
                    find=true;
                }
            }
            System.out.println("Thread N"+mynumber+" est arreté");
        }
    }
