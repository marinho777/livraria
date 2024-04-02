package br.com.etechoracio.livraria.test;

import br.com.etechoracio.livraria.model.Livro;

public class TestaReferencia {
    public static void main(String[] args) {
        Livro livroA = new Livro();
        livroA.setTitulo("AAAAAA");
        System.out.println(livroA.getTitulo());

        Livro livroB = livroA;
        System.out.println(livroB.getTitulo());

        livroB.setTitulo("drogas");
        System.out.println(livroB.getTitulo());

        System.out.println(livroA.getTitulo());


        System.out.println(livroA);
        System.out.println(livroB);
    }
}
