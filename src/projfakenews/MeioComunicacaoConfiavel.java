/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfakenews;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author vluca
 *  Representa um meio de comunicação confiável
 */
public class MeioComunicacaoConfiavel {
    private final int x;
    private final int y;
    private final int cor;
    private Timer timer;
   
    /**
     * Cria uma instância de MeioComunicacaoConfiavel.
     * Define as coordenadas (x, y) e a cor do meio de comunicação.
     * Inicializa o timer para ser usado posteriormente.
     */
    
    public MeioComunicacaoConfiavel(){
        x = 47;
        y = 2;
        cor = 2;
        timer = new Timer();
    }
   
    /**
     * Obtém a coordenada x do meio de comunicação.
     * 
     * @return O valor da coordenada x.
     */
    public int getX() {
        return x;
    }
    /**
     * Obtém a coordenada y do meio de comunicação.
     * 
     * @return O valor da coordenada y.
     */
    public int getY() {
        return y;
    }
    /**
     * Obtém a cor do meio de comunicação.
     * 
     * @return O valor da cor.
     */
    public int getCor() {
        return cor;
    }
   
    /**
     * Torna uma pessoa imune às fake news por um determinado período de tempo.
     * 
     * @param pessoa A lista de pessoas.
     * @param index O índice da pessoa imune.
     */
    public void ImuneAFakeNews( ArrayList<Pessoa> pessoa , int index ){
        int segundos = 30;
        // Transforma a pessoa mal informada em pessoa imune, se aplicável
         if ((pessoa.get(index) instanceof PessoaMalInformada)) {
                    pessoa.set(index, pessoa.get(index).Transforma());
                }
         pessoa.get(index).setImune(true);
                 
        TimerTask tarefa = new TimerTask() {
            int contador = segundos;

            @Override
            public void run() {
                if (contador > 0) {
                    contador--;
                } else {
                    timer.cancel(); // Termina a execução do timer
                    pessoa.get(index).setImune(false);
                }
            }
        };

        // Inicia o timer para a contagem de 30 segundos
        timer.schedule(tarefa, 0, 1000);

       
    }
}
