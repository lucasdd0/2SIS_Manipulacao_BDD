package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.CategoriaDAO;

public class Main {
    public static void main(String[] args) {
        CategoriaDAO dao = new CategoriaDAO();
        Categoria categoria = new Categoria(7L, "Festa");
        dao.inserir(categoria);
    }
}
