package main;

import listaligada.ListaLigada;

public class App {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adicionar(200);
        lista.adicionar(10);
        lista.adicionar(7);

        lista.exibir();
        System.out.println("removendo...");

        lista.remover(10);
        lista.exibir();
    }
}
