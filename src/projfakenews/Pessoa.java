/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfakenews;

/**
 *Classe que representa uma pessoa.
 * Implementa a interface IMovable para permitir o movimento da pessoa.
 * @author vluca
 */

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author vluca
 */
public class Pessoa implements IMovable{

    /**
     *
     */
    public Random numAleatorio = new Random();
    
    // colocar whats id, setar valor aleatorio de x e y, 
    private int x, y, cor, velocidade = 1;
    
    private boolean Imune;

    /**
     *
     * @return
     */
    public boolean isImune() {
        return Imune;
    }

    /**
     *
     * @param Imune
     */
    public void setImune(boolean Imune) {
        this.Imune = Imune;
    }
    
    private String whatsappID;
    
    private ArrayList<String> AgendaContatos = new ArrayList<>();
   
    /**
     * Construtor padrão que inicializa uma pessoa com um ID de WhatsApp aleatório e posições X e Y aleatórias.
     */
    public Pessoa(){
        whatsappID = Integer.toString(numAleatorio.nextInt(100000000,999999999));
        setX(numAleatorio.nextInt(30));
        setY(numAleatorio.nextInt(60));
    }
    
    /**
     * Retorna a própria instância da pessoa.
     * Usado para polimorfismo em subclasses.
     * @return a própria instância da pessoa
     */
    public Pessoa Transforma(){
        return this;
    }
    /**
     * Adiciona um novo ID de contato à agenda de contatos da pessoa, se ainda não estiver presente.
     * @param ID o ID do contato a ser adicionado
     */
    public void AdicionarContato(String ID){
        for(int i = 0; i < AgendaContatos.size(); i++ ){
            if(Objects.equals(ID, AgendaContatos.get(i))){
                return;
            }
        }
        AgendaContatos.add(ID);
    }
    /**
     * Define o ID do WhatsApp da pessoa.
     * @param whatsappID o ID do WhatsApp da pessoa
     */
    public void setWhatsappID(String whatsappID) {
        this.whatsappID = whatsappID;
    }
    /**
     * Define a agenda de contatos da pessoa.
     * @param AgendaContatos a agenda de contatos da pessoa
    */
    public void setAgendaContatos(ArrayList<String> AgendaContatos) {
        this.AgendaContatos = AgendaContatos;
    }
    /**
     * Retorna a agenda de contatos da pessoa.
     * @return a agenda de contatos da pessoa
    */
    public ArrayList<String> getAgendaContatos() {
        return AgendaContatos;
    }
    /**
     * Retorna o ID do WhatsApp da pessoa.
     * @return o ID do WhatsApp da pessoa
     */
    public String getWhatsappID(){
        return whatsappID;
    }
    /**
     * Retorna a posição X da pessoa no mundo.
     * @return a posição X da pessoa
    */
    public int getX() {
        return x;
    }
    /**
     * 
     * Define a posição X da pessoa no mundo.
     * @param x a posição X da pessoa
    */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }
    /**
     * Retorna a posição Y da pessoa no mundo.
     * @param y
    */
    public void setY(int y) {
        this.y = y;
    }
    /**
     * Define a posição Y da pessoa no mundo.
     * @return 
    */
    public int getCor() {
        return cor;
    }
    /**
     * Retorna a cor da pessoa.
     * @param cor
    */
    public void setCor(int cor) {
        this.cor = cor;
    }
    /**
     * Getter para o atributo velocidade.
     * @return O valor do atributo velocidade
    */
    public int getVelocidade() {
        return velocidade;
    }
    /**
     * Setter para o atributo velocidade.
     * @param velocidade Novo valor para o atributo velocidade
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    /**
     * Método para realizar o movimento da pessoa.
     * A pessoa se move aleatoriamente para cima, baixo, esquerda ou direita.
     * A velocidade da pessoa determina a quantidade de unidades de mundo que ela se move por turno.
     * As coordenadas x e y da pessoa são atualizadas de acordo com o movimento.
     * Caso a pessoa atinja os limites do mundo simulado, ela volta para o início do mundo.
     */
    @Override
    public void mover(){
        int move = numAleatorio.nextInt(4);
        switch(move){
            case 0: // esquerda
                y -= getVelocidade();
                if(y < 0){
                    y += 60;
                } else if ( y > 59){
                    // volta para o início do mundo
                    y -= 60;
                } break;
            case 1: // direita
                y += getVelocidade();
                if(y < 0){
                    y += 60;
                } else if ( y > 59){
                    y -= 60;
                } break;
            case 2: // baixo
                x += getVelocidade();
                if(x < 0){
                    x += 30;
                } else if ( x > 29){
                    x -= 30;
                } break;
            case 3: // cima
                x -= getVelocidade();
                if(x < 0){
                    x += 30;
                } else if ( x > 29){
                    x -= 30;
                } break;
            default:
                break;
        }   
    }
}
