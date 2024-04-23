package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapa;

public class LivroImpresso extends Livro{
    private TipoCapa tipoCapa;

    public LivroImpresso(){
        System.out.println("Construindo um livro");
        tipoCapa = TipoCapa.CORREX;
    }

    public void setTipoCapa(TipoCapa tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    public TipoCapa getTipoCapa() {
        return tipoCapa;
    }

    @Override
    protected void detalhar() {
        System.out.println(tipoCapa);
        System.out.println();
    }
}
