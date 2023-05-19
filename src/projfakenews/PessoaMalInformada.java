/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfakenews;

import java.util.ArrayList;

/**
 *Classe que representa uma pessoa mal informada.
 * Herda da classe Pessoa.
 * @author vluca
 */
public class PessoaMalInformada extends Pessoa{
    /**
     * Construtor que inicializa uma pessoa mal informada com a posição, ID do WhatsApp e agenda de contatos fornecidos.
     * @param x a posição X da pessoa no mundo
     * @param y a posição Y da pessoa no mundo
     * @param whatsappID o ID do WhatsApp da pessoa
     * @param AgendaContatos
    */
    public PessoaMalInformada(int x, int y, String whatsappID, ArrayList<String> AgendaContatos){
        setWhatsappID(whatsappID);
        setX(x);
        setY(y);
        setAgendaContatos(AgendaContatos);
        setCor(5);
        setImune(false);
    }
    /**
     * Retorna uma nova instância de PessoaBemInformada com as mesmas informações da pessoa mal informada atual.
     * @return uma nova instância de PessoaBemInformada
     */
    @Override
    public Pessoa Transforma(){
        return new PessoaBemInformada(getX(), getY(), getWhatsappID(), getAgendaContatos());
    }
/**
 * Construtor padrão que inicializa uma pessoa mal informada sem informações específicas.
 * A cor é definida como 5.
*/
    public PessoaMalInformada(){
        setCor(5);
    }
}
