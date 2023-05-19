/**
 * Classe principal do projeto Fake News.
 * @author Vitor Lucas Fujita Felício
*/
package projfakenews;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vitor Lucas Fujita Felício
 * RA: 22.122.077-5
 */
public class ProjFakeNews {
    /**
    * Método principal que inicia a simulação.
    * @param args os argumentos de linha de comando
    */
    public static void main(String[] args) {
        // Criação da lista de pessoas
        ArrayList<Pessoa> pessoa = new ArrayList<>();
        Mundo m = new Mundo();
        Date tempo_inicio = new Date();
        
        // Adiciona 40 pessoas bem informadas à lista
        for(int i = 0; i < 40; i++){
            pessoa.add(new PessoaBemInformada());
        }
        
        while(true){
            // Atualiza o mundo
            m.refazMundo();
            // Move cada pessoa na lista
            for(int i = 0; i < pessoa.size(); i++){
                pessoa.get(i).mover();
            }
            m.colocaMapa(pessoa);
            
            // Atualiza o mundo
            // m.atualizaMundo(); -> Comentado, não utilizado
            Date current_time = new Date();
            
            int NumeroDePessoasBem = 0;
            int NumeroDePessoasMal = 0;
            // Conta o número de pessoas bem e mal informadas
            for(int c = 0; c < pessoa.size(); c++){
                if( pessoa.get(c) instanceof PessoaBemInformada ){
                    NumeroDePessoasBem ++;
                }
                else{
                    NumeroDePessoasMal++;
                }
            }
            /**
            * Exibe informações sobre a simulação
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
            // Desenha o mundo            
            m.desenhaMundo();
            
            try{
                Thread.sleep(300);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
