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
 */
public class MeioComunicacaoConfiavel {
    private final int x;
    private final int y;
    private final int cor;
    private Timer timer;
    
    
    public MeioComunicacaoConfiavel(){
        x = 47;
        y = 2;
        cor = 2;
        timer = new Timer();
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
    
    public void ImuneAFakeNews( ArrayList<Pessoa> pessoa , int index ){
        int segundos = 30;

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
