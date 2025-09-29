package org.ex1imc;

public class Main {
    public static void main(String[] args) {
        System.out.println(getIMC(60.0,1.60,"masculino"));
        System.out.println(getIMC(60.0,1.60,"feminino"));
    }

    public static String getIMC(Double peso, Double altura, String sexo){
        Double imc = peso/ Math.pow(altura, 2);

        if (sexo.equals("feminino")) {
            if (imc < 19.1) {
                return "Abaixo do peso.";
            }
            if (imc < 25.8) {
                return "Peso ideal.";
            }
            if (imc < 27.3) {
                return "Marginalmente acima do peso.";
            }
            if (imc < 32.3) {
                return "Acima do peso ideal.";
            }
            return "Obeso."; // depois pesquisa como escrever isso mais bonitinho
        }

        if (sexo.equals("masculino")) {
            if (imc < 20.7) {
                return "Abaixo do peso.";
            }
            if (imc < 26.4) {
                return "Peso ideal.";
            }
            if (imc < 27.8) {
                return "Marginalmente acima do peso.";
            }
            if (imc < 31.1) {
                return "Acima do peso ideal.";
            }
            return "Obeso."; // depois pesquisa como escrever isso mais bonitinho
        }

        return "Sexo deve ser 'feminino' ou 'masculino'";
    }
}