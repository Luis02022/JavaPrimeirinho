package com.example;

/**
 * Hello world!
 *
 */
public class Aula 
{
    public static void main( String[] args ){
        
      String nome = "Marta";
      String sobrenome = "Silveira";
        
//Exibindo a quantidades de caracteres 
System.out.println("Tamanho do nome:" + nome.length());
System.out.println("Tamanho do sobrenome: " + sobrenome.length());

//Contatenando nome + sobrenome 
String nome_completo = nome.concat(" ").concat(sobrenome);

//Exibindo nome completo usando métodos Strings - Maiúsculas
System.out.println("Cocatenação Maiúscula: " + nome_completo.toUpperCase());

//Exibindo nome completo usando métodos Strings - Minúsculas 
System.out.println("Concatenação Minúscula: " + nome_completo.toLowerCase());



    }
}
