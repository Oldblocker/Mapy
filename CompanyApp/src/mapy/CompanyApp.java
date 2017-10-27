/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapy;

import java.util.Scanner;

/**
 *
 * @author Luke
 */
public class CompanyApp 
{
    private static final int OPCJA1 = 1;
    private static final int OPCJA2 = 2;
    private static final int OPCJA3 = 3;
    static Company c = new Company();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int opcja = 0;
        String inputImie;
        String inputNazwisko;
        double inputWynagrodzenie;
        Employee e;
        try(Scanner sc = new Scanner(System.in)) {
        while(opcja != 3)
        {
            System.out.println("1. Wprowadź nowego pracownika.");
            System.out.println("2. Odczytaj informacje o pracowniku.");
            System.out.println("3. Wyjdź z programu.");
            opcja = sc.nextInt();
            sc.nextLine();
            
            switch(opcja)
            {
                case 1:
                    System.out.println("Wprowadź imię pracownika: ");
                    inputImie = sc.nextLine();
                    System.out.println("Wprowadź nazwisko pracownika: ");
                    inputNazwisko = sc.nextLine();
                    System.out.println("Wprowadź wynagrodzenie: ");
                    inputWynagrodzenie = sc.nextDouble();
                    e = new Employee(inputImie, inputNazwisko, inputWynagrodzenie);
                    c.add(e);
                    opcja = 0;
                    break;
                case 2:
                    System.out.println("Wprowadź imię i nazwisko pracownika");
                    inputImie = sc.nextLine();
                    inputNazwisko = sc.nextLine();
                    System.out.println(c.read(inputImie, inputNazwisko));
                    opcja = 0;
                    break;
                case 3:
                    return;
            }
        }
        }
    }
    
}
