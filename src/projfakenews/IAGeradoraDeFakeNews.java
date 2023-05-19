/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfakenews;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Representa um gerador de fake news controlado por inteligência artificial.
 * É responsável por disseminar fake news entre as pessoas.
 * @author vluca
 */
public class IAGeradoraDeFakeNews {
    private final int x;
    private final int y;
    private final int cor;
    
    /**
     * Cria uma nova instância de IAGeradoraDeFakeNews.
     * Define as coordenadas e a cor da instância.
     */
    public IAGeradoraDeFakeNews(){
        x = 30;
        y = 17;
        cor = 6;
    }
    /**
     * Obtém a coordenada X da posição da IAGeradoraDeFakeNews no mapa.
     * @return A coordenada X da posição.
     */
    public int getX() {
        return x;
    }
    /**
     * Obtém a coordenada Y da posição da IAGeradoraDeFakeNews no mapa.
     * @return A coordenada Y da posição.
     */
    public int getY() {
        return y;
    }
    /**
     * Obtém a cor da IAGeradoraDeFakeNews.
     * @return A cor da IAGeradoraDeFakeNews.
     */
    public int getCor() {
        return cor;
    }
    /**
     * Dissemina fake news entre as pessoas.
     * @param pessoa A lista de pessoas para disseminar as fake news.
     * @param contatos A lista de contatos para verificar se uma pessoa deve receber a fake news.
     */
    public void DisseminaFakeNews( ArrayList<Pessoa> pessoa , ArrayList<String> contatos ){
        for( int t = 0 ; t < pessoa.size(); t++){
            for( int j = 0 ; j < contatos.size(); j++){
                if( Objects.equals(pessoa.get(t).getWhatsappID() , contatos.get(j)) && pessoa.get(t) instanceof PessoaBemInformada &&! pessoa.get(t).isImune()){
                        pessoa.set(t, pessoa.get(t).Transforma() );
                    }   }
            }
    }
    
}
