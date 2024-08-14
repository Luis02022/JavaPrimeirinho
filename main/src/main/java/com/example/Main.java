package com.example;

public class Main {
    public static void main(String[] args) {
        Clientes cliente = new Clientes("Luis", "18", "1400.56", Sexo.MASCULINO);


        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Salário: " + cliente.getSalario());
        System.out.println("Sexo: " + cliente.getSexo());

    }
}