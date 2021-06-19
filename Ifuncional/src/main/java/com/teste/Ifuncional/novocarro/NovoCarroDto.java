package com.teste.Ifuncional.novocarro;

import java.math.BigDecimal;

public class NovoCarroDto {

    private Long id;
    private String marca;
    private String nome;
    private BigDecimal valor;
    private String modelo;

    public NovoCarroDto(NovoCarro carro) {
        this.marca = carro.getMarca();
        this.nome = carro.getNome();
        this.valor = carro.getValor();
        this.modelo = carro.getModelo();
    }

    public String getMarca() {
        return marca;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "NovoCarroDto{" +
                "Marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
