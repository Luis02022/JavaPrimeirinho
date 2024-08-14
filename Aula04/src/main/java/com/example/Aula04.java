package com.example;

/**
 * Hello world!
 *
 */
public class Aula04 
{
    public static void main( String[] args )
    {
        //Declaração de variáveis 
        String nome_usuario = "Marta";
        int senha_usuario = 123;
    
        //Comparação de Strings e Inteiros 
        boolean resultado_nome = nome_usuario.equals("Carlos");
        boolean resultado_senha = (senha_usuario == 123);


        System.out.println("O nome do usuário está correto?" + resultado_nome);
        System.out.println("A senha do usuário está correta?" + resultado_senha);
    }
}
