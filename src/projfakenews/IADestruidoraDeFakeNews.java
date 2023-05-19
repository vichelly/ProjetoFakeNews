/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfakenews;

import java.util.ArrayList;
import java.util.Objects;

/**
 * A classe IADestruidoraDeFakeNews é responsável por destruir fake news 
 * disseminadas entre uma lista de contatos. Ela verifica se cada pessoa na lista de contatos
 * é mal informada e transforma em uma pessoa bem informada caso seja o caso.
 * 
 * Cada objeto da classe IADestruidoraDeFakeNews tem uma posição no plano cartesiano definida
 * pelos valores de x e y, e uma cor definida pelo valor de cor.
 * @author vluca
 */
public class IADestruidoraDeFakeNews {
    private final int x;
    private final int y;
    private final int cor;
    /**
     * Cria uma nova instância de IADestruidoraDeFakeNews.
     * Define as coordenadas e a cor da instância.
     */
    public IADestruidoraDeFakeNews(){
        x = 3;
        y = 2;
        cor = 4;
    }
    /**
     * Obtém a coordenada X da posição da IADestruidoraDeFakeNews no mapa.
     * @return A coordenada X da posição.
     */
    public int getX() {
        return x;
    }
    /**
     * Retorna a posição y do objeto IADestruidoraDeFakeNews no plano cartesiano.
     * 
     * @return a posição y do objeto
     */
    public int getY() {
        return y;
    }
    /**
     * Retorna a cor do objeto IADestruidoraDeFakeNews.
     * 
     * @return a cor do objeto
     */
    public int getCor() {
        return cor;
    }
   
    /**
     * Destrói fake news disseminadas entre uma lista de contatos. 
     * Verifica se cada pessoa na lista de contatos é mal informada e transforma em uma pessoa bem informada caso seja o caso.
     * 
     * @param pessoa a lista de pessoas para verificar e transformar
     * @param contatos a lista de contatos para verificar
     */
    public void DestroiFakeNews( ArrayList<Pessoa> pessoa , ArrayList<String> contatos ){
        for( int t = 0 ; t < pessoa.size(); t++){
            for( int j = 0 ; j < contatos.size(); j++){
                if( Objects.equals(pessoa.get(t).getWhatsappID() , contatos.get(j)) && pessoa.get(t) instanceof PessoaMalInformada ){
                        pessoa.set(t, pessoa.get(t).Transforma() );
                    }   }
            }
    }
}
