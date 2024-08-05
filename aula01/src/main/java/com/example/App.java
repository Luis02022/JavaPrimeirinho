package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String nome;
        float primeiraNota, segundaNota, terceiraNota, media;
        


        Scanner tecl = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:" );
        nome = tecl.next();

        System.out.println("Digite a primeira nota:");
        primeiraNota = tecl.nextFloat();

        System.out.println("Digite a segunda nota:");
        segundaNota = tecl.nextFloat();

        System.out.println("Digite a terceira nota:");
        terceiraNota = tecl.nextFloat();

        media = (primeiraNota + segundaNota + terceiraNota) / 3;

        if (media >= 7){
            System.out.println("A média do usuário é " + media + "\nSituação acadêmica: Aprovado");
        }
        else if(media > 5 || media > 6.9){    
            System.out.println("A média do usuário é " + media + "\nVerificação suplementar");
        }        
        else{
            System.out.println("A média do usuário é "+media+"\nSituação acadêmica: Reprovado");
        }


    }
}
