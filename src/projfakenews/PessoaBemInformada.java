/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfakenews;

import java.util.ArrayList;

/**
 *
 * @author vluca
 */
public class PessoaBemInformada extends Pessoa{
    public PessoaBemInformada(int x, int y, String whatsappID, ArrayList<String> AgendaContatos){
        setWhatsappID(whatsappID);
        setX(x);
        setY(y);
        setAgendaContatos(AgendaContatos);
        setCor(3);
        setImune(false);
    }
    
    @Override
    public Pessoa Transforma(){
        return new PessoaMalInformada(getX(), getY(), getWhatsappID(), getAgendaContatos());
    }
    public PessoaBemInformada(){
        setCor(3);
    }
}

