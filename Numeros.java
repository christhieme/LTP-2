/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;


/**
 *
 * @author 207700
 */
public class Numeros {

public static void main (String[] args){
    

Scanner tkh = new Scanner( System.in);

int num1;
int num2;
int result;

System.out.println("Digite um numero");

num1 = tkh.nextInt();
System.out.println("Digite o proximo numero");

num2 = tkh.nextInt();

result = num1+num2;

System.out.println("Resultado é"+ result);
}
    
}
