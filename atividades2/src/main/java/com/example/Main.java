package com.example;

public class Main {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario(1, "Luis", 1500.56, Setor.VENDAS, Sexo.MASCULINO, 18);

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Sexo: " + funcionario.getSexo());
        System.out.println("Setor: " + funcionario.getSetor());




    }
}