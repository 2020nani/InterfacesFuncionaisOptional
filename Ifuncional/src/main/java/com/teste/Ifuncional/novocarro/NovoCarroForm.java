package com.teste.Ifuncional.novocarro;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

public class NovoCarroForm {

    @NotBlank
    private String marca;

    @NotBlank
    private String nome;

    @NotNull
    private BigDecimal valor;

    @NotBlank
    private String modelo;

    public NovoCarroForm(String marca, String nome, BigDecimal valor, String modelo) {
        this.marca= marca;
        this.nome = nome;
        this.valor = valor;
        this.modelo = modelo;
    }

    public NovoCarro converte() {
        return new NovoCarro(marca, nome, valor, modelo);
    }
}
