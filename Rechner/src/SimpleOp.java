/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class SimpleOp {
    
    public static double plus(double op1, double op2)
    {
        return op1+op2;
    }

    public static double minus(double op1, double op2)
    {
        return op1-op2;
    }

    public static double multi(double op1, double op2)
    {
        return op1*op2;
    }

    public static double divi(double op1, double op2)
    {
    if(op2 == 0)
        {
            System.err.println("Ungültiger Wert. Division durch 0 nicht erlaubt");
        return 0;
        }
    else
        {
            return op1/op2;
        }
    }

}
