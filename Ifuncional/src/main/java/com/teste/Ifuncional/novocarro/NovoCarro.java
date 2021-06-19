package com.teste.Ifuncional.novocarro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class NovoCarro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String marca;

    @NotBlank
    private String nome;

    @NotNull
    private BigDecimal valor;

    @NotBlank
    private String modelo;

    @Deprecated
    public NovoCarro() {
    }

    public NovoCarro(String marca, String nome, BigDecimal valor, String modelo) {
        this.marca = marca;
        this.nome = nome;
        this.valor = valor;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
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
        return "NovoCarro{" +
                "id=" + id +
                ", Marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
