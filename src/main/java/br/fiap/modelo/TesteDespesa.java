package br.fiap.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteDespesa {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();

        Despesa despesa = new Despesa();
        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        despesa.setId(100L);
        despesa.setDescricao("Viagem de helicóptero para Paraty");
        despesa.setValor(65000.00);
        despesa.setCategoria(new Categoria(1L, ""));
        despesa.setDate(LocalDate.parse("25/08/2025", mascara));
        dao.inserir(despesa);


    }
}
