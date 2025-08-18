package br.fiap.modelo;

import java.time.LocalDate;

public class Despesa {
    private Double valor;
    private LocalDate date;
    private Long id;
    private String descricao;
    private Categoria categoria;

    public Long getId() {
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
