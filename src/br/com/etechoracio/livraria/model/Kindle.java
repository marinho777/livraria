package br.com.etechoracio.livraria.model;

public class Kindle extends Livro {
    private String marcaDagua;

    @Override //sobrepoe o outro metodo
    double desconto(double desconto){
        if(!(desconto > 0.2)) {
            super.desconto(desconto);
        }else{
            System.out.println("DESCONTO INVALIDO");
        }
        return desconto;
    }

    @Override
    protected void detalhar() {
        System.out.println(marcaDagua);
    }
}
