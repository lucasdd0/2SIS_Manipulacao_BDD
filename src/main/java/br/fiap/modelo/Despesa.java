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

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
