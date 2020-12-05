package br.edu.iftm.rpg;

public class Jogador {
    //atributos
    private String nome;
    private String raca;
    private String classe;
    private int nivel;
    private int vida;
    private int dano;

    //construtor
    public Jogador(String nome, String raca, String classe, int nivel, int vida, int dano){
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = vida;
        this.dano = dano;
    }
    //metodos específicos
    public void atacar(Inimigo inimigo){
        System.out.format("O %s atacou o %s e causou %d de dano.\n", nome, inimigo.getNome(), dano);
        inimigo.perderVida(dano);
    }
    public void perderVida(int pontos){
        System.out.format("O %s perdeu %d pontos de vida.\n", nome, pontos);
        vida = vida - pontos;
        if(vida <= 0){
            System.out.format("O %s morreu.\n", nome);
        }
    }
    public void statusFicha(){
        System.out.println("--- Ficha de Personagem ---");
        System.out.format("-- Nome : %s\n", nome);
        System.out.format("-- Raça : %s\n", raca);
        System.out.format("-- Classe : %s\n", classe);
        System.out.format("-- Nível : %s\n", nivel);
        System.out.format("-- PV atual: %d\n", vida);
        System.out.format("-- Ataque: %d\n", dano);
    }
    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}