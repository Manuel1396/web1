/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class Calculadora {
    double z;
    String m= null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora C=new Calculadora();
        C.menu();

    }
    
private void menu(){
    m="1 sumar\n2 Resta\n3 Multiplicar\n4 Dividir";
       imprimir (m);     
    int n = scanner ();
    switch(n){
        case 1: z = sumar();
        
            break;
        case 2: z = restar();
        
            break;
        case 3: z = multiplicar();
        
            break;
        case 4: z = dividir();
    
            break;
    }
    imprimir("el resultado es" +z);
}

private int scanner(){
    Scanner S=new Scanner(System.in);
    int i = S.nextInt();
    return i;
}

private int sumar(){
    imprimir("digite el primer numero");
    int x = scanner();
    imprimir("digite el segundo numero");
    int y = scanner();
    int r = x+y;
    return r; 
}

private int restar(){
    imprimir("digite el primer numero");
    int x = scanner();
    imprimir("digite el segundo numero");
    int y = scanner();
    int r = x-y;
    return r;
}

private int multiplicar(){
    imprimir("digite el primer numero");
    int x = scanner();
    imprimir("digite el segundo numero");
    int y = scanner();
    int r = x*y;
    return r;
}

private double dividir(){
    imprimir("digite el primer numero");
    int x = scanner();
    imprimir("digite el segundo numero");
    int y = scanner();
    int r = x/y;
    return r;
}

private void imprimir(String r) {
    System.out.println(r);
}
}

