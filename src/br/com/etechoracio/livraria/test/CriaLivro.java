package br.com.etechoracio.livraria.test;


import br.com.etechoracio.livraria.model.LivroImpresso;
import br.com.etechoracio.livraria.model.Editora;
import br.com.etechoracio.livraria.model.Kindle;
import br.com.etechoracio.livraria.model.SacolaCompras;



public class CriaLivro {
    public static void main(String[] args) {

        Editora editora1 = new Editora();
        editora1.setNome("sla");
        editora1.setSite("google.com");

        LivroImpresso livro1 = new LivroImpresso();

        Kindle livro2 = new Kindle();
        livro2.setGenero("Sexo");
        livro2.setAutor("correx");
        livro2.setTitulo("pedabliu");
        livro2.setIdioma("eslovaco");
        livro2.setEdicao("567");

        SacolaCompras sacola2304 = new SacolaCompras();
        sacola2304.adicionar(livro2);

    }
}
