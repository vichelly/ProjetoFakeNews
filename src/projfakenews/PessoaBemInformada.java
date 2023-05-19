/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfakenews;

import java.util.ArrayList;

/**
 *Classe que representa uma pessoa bem informada.
 * Herda da classe Pessoa.
 * @author vluca
 */
public class PessoaBemInformada extends Pessoa{
    /**
     * Construtor que inicializa uma pessoa bem informada com a posição, ID do WhatsApp e agenda de contatos fornecidos.
     * @param x a posição X da pessoa no mundo
     * @param y a posição Y da pessoa no mundo
     * @param whatsappID o ID do WhatsApp da pessoa
     * @param AgendaContatos
    */
    public PessoaBemInformada(int x, int y, String whatsappID, ArrayList<String> AgendaContatos){
        setWhatsappID(whatsappID);
        setX(x);
        setY(y);
        setAgendaContatos(AgendaContatos);
        setCor(3);
        setImune(false);
    }
    /**
     * Retorna uma nova instância de PessoaMalInformada com as mesmas informações da pessoa bem informada atual.
     * @return uma nova instância de PessoaMalInformada
     */
    @Override
    public Pessoa Transforma(){
        return new PessoaMalInformada(getX(), getY(), getWhatsappID(), getAgendaContatos());
    }
    /**
     * Construtor padrão que inicializa uma pessoa bem informada sem informações específicas.
     * A cor é definida como 3.
     */
    public PessoaBemInformada(){
        setCor(3);
    }
}

