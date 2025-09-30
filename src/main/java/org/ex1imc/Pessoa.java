package org.ex1imc;

public class Pessoa {

    private String nome;
    private String sexo;
    private Double peso;
    private Double altura;

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("O altura deve ser maior que zero");
        }
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero");
        }
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (!sexo.equals("feminino") && !sexo.equals("masculino")) {
            throw new IllegalArgumentException("O sexo deve ser feminino ou masculino.");
        }
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMC(){
        Double imc = peso/Math.pow(altura, 2);

        if (sexo.equals("feminino")) {
            if (imc < 19.1) {
                return "Abaixo do peso.";
            }
            else if (imc < 25.8) {
                return "Peso ideal.";
            }
            else if (imc < 27.3) {
                return "Marginalmente acima do peso.";
            }
            else if (imc < 32.3) {
                return "Acima do peso ideal.";
            }
            return "Obeso.";
        }

        else {
            if (imc < 20.7) {
                return "Abaixo do peso.";
            }
            else if (imc < 26.4) {
                return "Peso ideal.";
            }
            else if (imc < 27.8) {
                return "Marginalmente acima do peso.";
            }
            else if (imc < 31.1) {
                return "Acima do peso ideal.";
            }
            return "Obeso.";
        }
    }
}