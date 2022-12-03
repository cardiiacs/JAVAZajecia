package javazajecia;

import java.util.Scanner;

public class Kalkulator {

        public static void main(String[] args) {
        	
        	double l1;
        	double l2;
        	double wynik;
        	char znak;
        	
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Podaj pierwsza liczbe:");

            l1 = scanner.nextDouble();

            System.out.println("Podaj druga liczbe:");

            l2 = scanner.nextDouble();

            System.out.println("Podaj znak dzialania:");
            System.out.println("+ dodawanie");
            System.out.println("- odejmowanie");
            System.out.println("* mnozenie");
            System.out.println("/ dzielenie");
            System.out.println("% dzielenie modulo");
            System.out.println("x zakoncz program");

            znak = scanner.next().charAt(0);
            
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
            		System.out.println("Blad: dzielenie przez zero");
            		break;
            	}
            	
            case '%':
            	wynik = l1 % l2;
            	System.out.println(l1 + " % " + l2 + " = " + wynik);
                break;
                
            case 'x':
            	break;
            	
            default:
                System.out.println("Nieprawidlowy znak");
                break;
                
            }
            scanner.close();
        }
}
         
