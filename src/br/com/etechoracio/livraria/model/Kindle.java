package br.com.etechoracio.livraria.model;

public class Kindle extends Livro {
    private String marcaDagua;

    @Override //sobrepoe o outro metodo
    double desconto(double desconto){
        if(!(desconto > 0.2)) {
            super.desconto(this.desconto);
        }else{
            System.out.println("DESCONTO INVALIDO");
        }
    }

}
