package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapa;

public class Livro {
    private double preco, taxaentrega, subtotal;
   private String titulo, genero, idioma, autor, edicao, cip;
    private TipoCapa tipoCapa;

    Editora editora;
     void exibir(){
         System.out.println();
         System.out.println("Titulo: " + titulo);
         System.out.println("Genero: " + genero);
         System.out.println("Idioma: " + idioma);
         System.out.println("Autor: " + autor);
         System.out.println("Edicao: " + edicao);
         System.out.println("Tipo de Capa: " + tipoCapa);
         System.out.println("CIP: " + cip);
         System.out.println("Preço do livro: " + formatarValor(preco));
         System.out.println("Taxa de Entrega: " + formatarValor(taxaentrega));
         System.out.println("Subtotal: " + formatarValor(subtotal));
         System.out.println("nome editora: " + editora.getNome());
         System.out.println("site editora: " + editora.getSite());

    }
    double taxaEntrega(){
         return preco * 0.05;
    }
    String formatarValor(double temp){
         return String.format("R$ %.2f", temp);
    }

s
    double desconto(double desconto){
         if(!(desconto > 0.2)) {
             return preco * (desconto / 100);
         }else{
             System.out.println("DESCONTO INVALIDO");
         }
    }
    void cobrarCapa(){
         if(tipoCapa == TipoCapa.DURA){
             subtotal += 5;
         }else if(tipoCapa == TipoCapa.PERSONALIZADA){
             subtotal += 10;
         }else if(tipoCapa == TipoCapa.CORREX){
             subtotal += 20;
         }
    }

    public void setTipoCapa(TipoCapa tipoCapa) {
        this.tipoCapa = tipoCapa;
        cobrarCapa();
    }

    public void setPreco(double preco) {
        this.preco = preco;
        taxaentrega += taxaEntrega();
        subtotal += (preco-desconto(15)) + taxaEntrega();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTaxaentrega(double taxaentrega) {
        this.taxaentrega = taxaentrega;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

    public String getTitulo() {
        return titulo.toUpperCase();
    }
}