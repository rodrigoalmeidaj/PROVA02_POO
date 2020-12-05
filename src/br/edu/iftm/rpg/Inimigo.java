package br.edu.iftm.rpg;

public class Inimigo {
    //atributos
    private String nome;
    private int vida;
    private int dano;

    //construtor
    public Inimigo (String nome, int vida, int dano){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }
    //metodos específicos
    public void atacar(Jogador jogador){
        System.out.format("O %s atacou o %s e causou %d de dano. \n", nome, jogador.getNome(), dano);
        jogador.perderVida(dano);
    }
    public void perderVida(int pontos){
        System.out.format("O %s perdeu %d pontos de vida.\n", nome, pontos);
        vida = vida - pontos;
        if(vida <= 0){
            System.out.format("O %s morreu.\n", nome);
        }
    }
    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}