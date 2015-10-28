/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
import java.util.Scanner;

public class Rechner {
    
    public static void main(String[] args)
    {
        Rechner r = new Rechner();
        r.menu();
    }
    private double erg; //Für spätere Eirweiterungen reserviert
    private double z1;
    private double z2;
    private SimpleOp operator;
    private Scanner eing;
    
    private void menu()
    {
        operator = new SimpleOp();
        int eingabe;
        eing=new Scanner(System.in);
        do
        {
            System.out.println("Herzlich willkommen\nBitte wälen Sie die Art der Operation");
            System.out.println("************************************************************");
            System.out.println("1.)Addition\n2.)Subtraktion\n3.)Multiplikation\n4.)Division");
            System.out.println("************************************************************");
            System.out.println("0.)Programm beenden");
            System.out.print(">");
            eingabe=eing.nextInt();
            switch(eingabe)
            {
                case 0:
                {
                    System.out.println("Programm beendet");
                    break;
                }
                case 1:
                {
                    eingabe();
                    System.out.println("Das Ergebnis ist: "+(erg=operator.plus(z1, z2))+"\n");
                    break;
                }
                case 2:
                {
                    eingabe();
                    System.out.println("Das Ergebnis ist: "+(erg=operator.minus(z1, z2))+"\n");
                    break;
                }
                case 3:
                {
                    eingabe();
                    System.out.println("Das Ergebnis ist: "+(erg=operator.multi(z1, z2))+"\n");
                    break;
                }
                case 4:
                {
                    eingabe();
                    System.out.println("Das Ergebnis ist: "+(erg=operator.divi(z1, z2))+"\n");
                    break;
                }
                default:
                {
                    System.err.println("Bitte nur gültige Werte eigeben");
                    break;
                }
                    
            }
        }
        while(eingabe != 0);
    }
    
    private void eingabe()
    {
        eing=new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl ein");
        this.z1=eing.nextDouble();
        System.out.println("Bitte geben Sie die zweite Zahl ein");
        this.z2=eing.nextDouble();
    }
    
}
