package br.edu.iftm.teste;

import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;

public class RpgTeste {
    public static void main(String[] args) {
        //jogador
        Jogador jogador1 = new Jogador("Aragorn", "Humano", "Guerreiro", 20, 250, 80);
        //inimigos
        Inimigo inimigo1 = new Inimigo("Goblin", 100, 32);
        Inimigo inimigo2 = new Inimigo("Orc", 150, 45);
        //luta
        Luta luta = new Luta();
        //enfrentar
        System.out.println("Mestre: e então você se depara com 2 inimigos, um Orc e um Goblin.");
        System.out.println("Jogador: Vou atacar o goblin\n");
        luta.enfrentar(inimigo1, jogador1);
        System.out.println("Mestre: Ainda resta o Orc, e ele está FURIOSO");
        System.out.println("Jogador: Vou atacá-lo.\n");
        luta.enfrentar(inimigo2, jogador1);
        jogador1.statusFicha();
        
    }
    
}