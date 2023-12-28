package com.company;
import java.util.Random;
/**
 * Vezba 18
 */
public class Main {

    public static void main(String[] args) {

//        String znakovi[] = {"Heart", "Cherry", "Coid", "Melon", "Jocker"};
//
//        Random random = new Random();
//
//
//        for (int i = 1; i<5;i++){
//            int index = random.nextInt(5);
//            System.out.print(znakovi[index]+" "); // println - brisemo ln i dodajemo + " " da bi se ispisalo u jednom redu
//        }
/**
 * Igranje sa jokerima
 */

//
//                String znakovi[] = {"Heart", "Cherry", "Coid", "Melon", "Jocker"};
//
//                Random random = new Random();
//
//                boolean allJockers = false; // Inicijalizujemo allJockers u false
//                while (!allJockers) {
//                    allJockers = true; // Pretpostavljamo da su svi Jokeri
//                    for (int i = 0; i < 5; i++) {
//                        int index = random.nextInt(5);
//                        System.out.print(znakovi[index] + " ");
//                        if (!znakovi[index].equals("Jocker")) {
//                            allJockers = false; // Ako bilo koji element nije Jocker, podesite allJockers na false
//
//                        }
//                    }
//                    System.out.println();
//                }
//
//                System.out.println("Svi elementi su Jokeri!!!!");
//            }
//        }
//
//

/**
 * Vezba 17
 */

//            String pojam[]={"Bicikl", "Automobil", "Telefon"} ;
//            String naziva[]={"BMX", "Reno 4", "I Phone"};
//            double cene[] = {150.55, 100.0 ,500.0};
//
//            for (int i = 0; i< pojam.length; i++){
//                System.out.println(naziva[i] + " is type: " + pojam[i] + " and it costs: "+cene[i]);
//            }
//


        /**
         * Vezba 16
         */

        System.out.println("****************************************************************");
        System.out.println("#     1     2     3     4     5     6     7     8     9     10 #");
        System.out.println("****************************************************************");

        for (int i = 1; i < 11; i ++){
            System.out.print(i+" ");
            for (int j = 1; j<11;j++){
                System.out.print(i*j+" ");
            }
            System.out.println("");
           // System.out.println(i+"     "+i*1+"     "+i*2+"     "+i*3);
        }

    }
}