package br.edu.iftm.rpg;

public class Luta {
    //atributos
    private Inimigo inimigo;
    private Jogador jogador;

    //método específico da classe
    public void enfrentar(Inimigo inimigo, Jogador jogador){
        this.inimigo = inimigo;
        this.jogador = jogador;

        jogador.statusFicha();
        System.out.println("\n");
        jogador.atacar(inimigo);
        inimigo.atacar(jogador);
        jogador.atacar(inimigo);
        System.out.println("\n");


    }
}