package zajecia;

import java.util.Random;

public class Czlowiek {

   private static int zycie;
   private static int exp;
   private static int obr;

    public Czlowiek(int zycie, int exp, int obr) {
        this.zycie = 100;
        this.exp = 0;
        this.obr = 0;
    }

    public static void stat() {
        System.out.println("Zycie: "+zycie+" EXP: "+exp+" Obrazenia: "+obr);
    }

    public static void walka() {

        Random random = new Random();
        obr = random.nextInt(100)+1;

        while (zycie>obr) {
            zycie -= obr;

            if (zycie>0) {
                exp+=100;
            }
            else {
                System.out.println("Przegrana");break;
            }
        }


    }

    public static void leczenie() {

        zycie+=100;

    }


}
