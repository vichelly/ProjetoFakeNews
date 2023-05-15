/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfakenews;

/**
 *
 * @author vluca
 */

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Pessoa implements IMovable{
    public Random numAleatorio = new Random();
    
    // colocar whats id, setar valor aleatorio de x e y, 
    private int x, y, cor, velocidade = 1;
    
    private boolean Imune;

    public boolean isImune() {
        return Imune;
    }

    public void setImune(boolean Imune) {
        this.Imune = Imune;
    }
    
    private String whatsappID;
    
    private ArrayList<String> AgendaContatos = new ArrayList<>();
    
    public Pessoa(){
        whatsappID = Integer.toString(numAleatorio.nextInt(100000000,999999999));
        setX(numAleatorio.nextInt(30));
        setY(numAleatorio.nextInt(60));
    }
    
    public Pessoa Transforma(){
        return this;
    }
    
    public void AdicionarContato(String ID){
        for(int i = 0; i < AgendaContatos.size(); i++ ){
            if(Objects.equals(ID, AgendaContatos.get(i))){
                return;
            }
        }
        AgendaContatos.add(ID);
    }

    public void setWhatsappID(String whatsappID) {
        this.whatsappID = whatsappID;
    }

    public void setAgendaContatos(ArrayList<String> AgendaContatos) {
        this.AgendaContatos = AgendaContatos;
    }

    public ArrayList<String> getAgendaContatos() {
        return AgendaContatos;
    }

    public String getWhatsappID(){
        return whatsappID;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
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
