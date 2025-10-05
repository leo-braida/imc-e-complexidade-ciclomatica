package org.ex1imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PessoaTest {
    private Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }


    @Test
    void deveTestarAlturaInvalida() {
        try {
            pessoa.setAltura(0d);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("A altura deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void deveTestarAlturaValida() {
        pessoa.setAltura(10d);
        assertEquals(10d, pessoa.getAltura());
    }

    @Test
    void deveTestarPesoInvalido() {
        try {
            pessoa.setPeso(0d);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("O peso deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void deveTestarPesoValido() {
        pessoa.setPeso(10d);
        assertEquals(10d, pessoa.getPeso());
    }

    @Test
    void deveTestarSexoInvalido() {
        try {
            pessoa.setSexo("pessoa");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("O sexo deve ser feminino ou masculino.", e.getMessage());
        }
    }

    @Test
    void deveTestarSexoFeminino() {
        pessoa.setSexo("feminino");
        assertEquals("feminino", pessoa.getSexo());
    }

    @Test
    void deveTestarSexoMasculino() {
        pessoa.setSexo("masculino");
        assertEquals("masculino", pessoa.getSexo());
    }

    @Test
    void deveTestarNomeVazio() {
        try {
            pessoa.setNome("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("O nome não pode ser nulo.", e.getMessage());
        }
    }

    @Test
    void deveTestarNomeNull() {
        try {
            pessoa.setNome(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("O nome não pode ser nulo.", e.getMessage());
        }
    }

    @Test
    void deveTestarNomeValido() {
        pessoa.setNome("Beatriz Ponce");
        assertEquals("Beatriz Ponce", pessoa.getNome());
    }

    @Test
    void deveTestarIMCFemininoAbaixoDoPeso() {
        pessoa.setSexo("feminino");
        pessoa.setAltura(1d);
        pessoa.setPeso(19d);
        assertEquals("Abaixo do peso.", pessoa.getIMC());
    }

    @Test
    void deveTestarIMCFemininoPesoIdeal() {
        pessoa.setSexo("feminino");
        pessoa.setAltura(1d);
        pessoa.setPeso(25.7);
        assertEquals("Peso ideal.", pessoa.getIMC());
    }

    @Test
    void deveTestarIMCFemininoMarginalmenteAcimaDoPeso() {
        pessoa.setSexo("feminino");
        pessoa.setAltura(1d);
        pessoa.setPeso(27.2);
        assertEquals("Marginalmente acima do peso.", pessoa.getIMC());
    }

    @Test
    void deveTestarIMCFemininoAcimaDoPesoIdeal() {
        pessoa.setSexo("feminino");
        pessoa.setAltura(1d);
        pessoa.setPeso(32.2);
        assertEquals("Acima do peso ideal.", pessoa.getIMC());
    }

    @Test
    void deveTestarIMCFemininoObeso() {
        pessoa.setSexo("feminino");
        pessoa.setAltura(1d);
        pessoa.setPeso(32.3);
        assertEquals("Obeso.", pessoa.getIMC());
    }

    @Test
    void deveTestarIMCMasculinoAbaixoDoPeso() {
        pessoa.setSexo("masculino");
        pessoa.setAltura(1d);
        pessoa.setPeso(20.6);
        assertEquals("Abaixo do peso.", pessoa.getIMC());
    }

    @Test
    void deveTestarIMCMasculinoPesoIdeal() {
        pessoa.setSexo("masculino");
        pessoa.setAltura(1d);
        pessoa.setPeso(26.3);
        assertEquals("Peso ideal.", pessoa.getIMC());
    }

    @Test
    void deveTestarIMCMasculinoMarginalmenteAcimaDoPeso() {
        pessoa.setSexo("masculino");
        pessoa.setAltura(1d);
        pessoa.setPeso(27.7);
        assertEquals("Marginalmente acima do peso.", pessoa.getIMC());
    }

    @Test
    void deveTestarIMCMasculinoAcimaDoPesoIdeal() {
        pessoa.setSexo("masculino");
        pessoa.setAltura(1d);
        pessoa.setPeso(31d);
        assertEquals("Acima do peso ideal.", pessoa.getIMC());
    }

    @Test
    void deveTestarIMCMasculinoObeso() {
        pessoa.setSexo("masculino");
        pessoa.setAltura(1d);
        pessoa.setPeso(31.1);
        assertEquals("Obeso.", pessoa.getIMC());
    }
}