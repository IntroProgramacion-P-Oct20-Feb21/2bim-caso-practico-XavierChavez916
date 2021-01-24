/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int k;
        int residuo;
        
        System.out.println("Ingrese un numero");
        k = entrada.nextInt();
        
        residuo = extraerMod(k);
        
        System.out.printf("%s",proceso(residuo, k));
        
        
    }
    
    public static int extraerMod(int k1){
        int residuo;
        residuo = k1 % 10;
        
        return residuo;
    }
    
    public static String proceso(int residuo, int k1){
        
        String cadena="";
        int j=0;
        while(k1 > 0){
            residuo =  extraerMod(k1);
            cadena = String.format("%s%s * 10 elevado a la potencia %s\n",cadena,residuo, j);
            j = j + 1;
            k1 = k1 / 10;
                    
        }
        
        return cadena;
    }
}