package br.fiap2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class teste01 {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno(1234567, "Ana Maria", "pe"));
        lista.add(new Aluno(1111111, "Ana Maria", "pe"));
        lista.add(new Aluno(5557999, "Danilo", "pe"));
        lista.add(new Aluno(2342343, "Carlos", "cu"));
        lista.add(new Aluno(8888888, "Bia", "da"));

        lista.forEach(aluno -> System.out.println(aluno));

        lista.sort(Comparator.comparing(Aluno::getNome));
        System.out.println();

        lista.forEach(aluno -> System.out.println(aluno));

        lista.sort(Comparator.comparing(Aluno::getNome).reversed());
        System.out.println();

        lista.forEach(aluno -> System.out.println(aluno));

        lista.sort(Comparator.comparing(Aluno::getNome).thenComparing(Aluno::getRm));
        System.out.println();

        lista.forEach(aluno -> System.out.println(aluno));
    }
}
