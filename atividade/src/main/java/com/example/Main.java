package com.example;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
       Clientes cliente = new Clientes("Luis", Sexo.MASCULINO);


       System.out.println("Nome: " + cliente.getNome());
       System.out.println("Sexo: " + cliente.setSexo());
       





    }
}
