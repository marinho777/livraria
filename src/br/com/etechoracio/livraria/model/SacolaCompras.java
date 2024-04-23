package br.com.etechoracio.livraria.model;

public class SacolaCompras {
    public void adicionar(LivroImpresso livroImpresso){
        System.out.println("Adicionado " + livroImpresso);
    }
    public void adicionar(Kindle kindle){
        System.out.println("Adicionado " + kindle);
    }
}
