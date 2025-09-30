package org.ex1imc;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setAltura(1.0);
        p1.setPeso(150.0);
        p1.setSexo("masculino");
        System.out.println(p1.getIMC());

        Pessoa p2 = new Pessoa();
        p2.setAltura(1.0);
        p2.setPeso(150.0);
        p2.setSexo("feminino");
        System.out.println(p2.getIMC());
    }
}
