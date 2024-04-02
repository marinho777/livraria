package br.com.etechoracio.livraria.test;

import br.com.etechoracio.livraria.enums.TipoCapa;

import br.com.etechoracio.livraria.model.Livro;
import br.com.etechoracio.livraria.model.Editora;
import br.com.etechoracio.livraria.model.Kindle;



public class CriaLivro {
    public static void main(String[] args) {

        Livro testeLivro = new Livro();
        testeLivro.setGenero("Sexo");
        testeLivro.setAutor("correx");
        testeLivro.setIdioma("eslovaco");
        testeLivro.setTitulo("pedabliu");
        testeLivro.setEdicao("567");

        Editora editora1 = new Editora();
        editora1.setNome("sla");
        editora1.setSite("google.com");

        testeLivro.setPreco(70.50);


        testeLivro.setTipoCapa(TipoCapa.NORMAL);


        Kindle livro2 = new Kindle();
        testeLivro.setGenero("Sexo");
        testeLivro.setAutor("correx");
        testeLivro.setIdioma("eslovaco");
        testeLivro.setTitulo("pedabliu");
        testeLivro.setEdicao("567");

    }
}
