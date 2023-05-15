/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfakenews;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author vluca
 */
public class IAGeradoraDeFakeNews {
    private final int x;
    private final int y;
    private final int cor;
    
    
    public IAGeradoraDeFakeNews(){
        x = 30;
        y = 17;
        cor = 6;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getCor() {
        return cor;
    }
    
    public void DisseminaFakeNews( ArrayList<Pessoa> pessoa , ArrayList<String> contatos ){
        for( int t = 0 ; t < pessoa.size(); t++){
            for( int j = 0 ; j < contatos.size(); j++){
                if( Objects.equals(pessoa.get(t).getWhatsappID() , contatos.get(j)) && pessoa.get(t) instanceof PessoaBemInformada &&! pessoa.get(t).isImune()){
                        pessoa.set(t, pessoa.get(t).Transforma() );
                    }   }
            }
    }
    
}
