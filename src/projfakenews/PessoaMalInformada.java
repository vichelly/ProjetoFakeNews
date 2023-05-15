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
public class PessoaMalInformada extends Pessoa{
    
    public PessoaMalInformada(int x, int y, String whatsappID, ArrayList<String> AgendaContatos){
        setWhatsappID(whatsappID);
        setX(x);
        setY(y);
        setAgendaContatos(AgendaContatos);
        setCor(5);
        setImune(false);
    }
    
    @Override
    public Pessoa Transforma(){
        return new PessoaBemInformada(getX(), getY(), getWhatsappID(), getAgendaContatos());
    }

    public PessoaMalInformada(){
        setCor(5);
    }
}
