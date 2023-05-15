package projfakenews;

import java.util.ArrayList;
import java.util.Date;

public class ProjFakeNews {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoa = new ArrayList<>();
        Mundo m = new Mundo();
        Date tempo_inicio = new Date();
        
        for(int i = 0; i < 40; i++){
            pessoa.add(new PessoaBemInformada());
        }
        
        while(true){
            
            m.refazMundo();
            
            for(int i = 0; i < pessoa.size(); i++){
                pessoa.get(i).mover();
            }
            m.colocaMapa(pessoa);
            
//            m.atualizaMundo();
            Date current_time = new Date();
            
            int NumeroDePessoasBem = 0;
            int NumeroDePessoasMal = 0;
            
            for(int c = 0; c < pessoa.size(); c++){
                if( pessoa.get(c) instanceof PessoaBemInformada ){
                    NumeroDePessoasBem ++;
                }
                else{
                    NumeroDePessoasMal++;
                }
            }
            /**
             * a cada interação atualiza-se o tempo 
             */
            System.out.println("=========================================================================");
            System.out.println("Tempo de Simulação: "
                            + (current_time.getTime()
                            - tempo_inicio.getTime()) / 1000);
            System.out.printf("\033[44m \033[0m ");
            System.out.printf("Número de pessoas bem informadas: %d",NumeroDePessoasBem);
            System.out.printf("    ");
            System.out.printf("\033[43m \033[0m ");
            System.out.printf("Número de pessoas mal informadas: %d",NumeroDePessoasMal);
            System.out.printf("\n");
            System.out.printf("Número total de pessoas: 40");
            System.out.printf("\n");
            System.out.println("=========================================================================");
            
            m.desenhaMundo();
            
            try{
                Thread.sleep(300);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
