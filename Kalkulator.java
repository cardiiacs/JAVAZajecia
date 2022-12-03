package javazajecia;

import java.util.Scanner;

public class Kalkulator {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Podaj pierwszą liczbę:");

            float l1 = scanner.nextInt();

            System.out.println("Podaj drugą liczbę:");

            float l2 = scanner.nextInt();

            System.out.println("Podaj znak działania:");
            System.out.println("+ dodawanie");
            System.out.println("- odejmowanie");
            System.out.println("* mnożenie");
            System.out.println("/ dzielenie");
            System.out.println("% dzielenie modulo");
            System.out.println("x wyjście z programu");

            char znak = scanner.next().charAt(0);
            
            float wynik;
            
            switch (znak) {
            
            case '+':
                wynik = l1 + l2;
                System.out.println(l1 + " + " + l2 + " = " + wynik);
                break;
                
            case '-':
            	wynik = l1 - l2;
            	System.out.println(l1 + " - " + l2 + " = " + wynik);
                break;
                
            case '*':
            	wynik = l1 * l2;
            	System.out.println(l1 + " * " + l2 + " = " + wynik);
                break;
            
            case '/':
            	if (l2 != 0) {
            		wynik = l1 / l2;
                	System.out.println(l1 + " / " + l2 + " = " + wynik);
                    break;
            	}
            	if (l2 == 0) {
            		System.out.println("Błąd: dzielenie przez zero");
            	}
            	
            case '%':
            	wynik = l1 % l2;
            	System.out.println(l1 + " % " + l2 + " = " + wynik);
                break;
                
            case 'x':
            	break;
            	
            default:
                System.out.println("Nieprawidłowy znak");
                break;
                
            }
            scanner.close();
        }
}
         
