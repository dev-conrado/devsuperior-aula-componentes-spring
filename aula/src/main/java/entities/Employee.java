package com.devsuperior.aula.entities;

public class Employee {

    private String name;
    private double grossSalary; // Nome do atributo atualizado

    public Employee() {
    }

    public Employee(String name, double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // O método QUE O ERRO PEDE está aqui:
    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
}