package projfakenews;

import java.util.ArrayList;
import java.util.Objects;
/**
 * A classe Mundo representa um mundo virtual onde são geradas e destruídas fake news.
 */
public class Mundo {

    /**
     *
     */
    public int[][] mapa;
    private IAGeradoraDeFakeNews Fake; 
    private IADestruidoraDeFakeNews Destroy;
    private MeioComunicacaoConfiavel Imunity;
    /**
     * Construtor da classe Mundo. Inicializa o mundo chamando o método refazMundo().
     */
    public void Mundo(){
        refazMundo();
    }
    /**
     * Refaz o mundo, criando um novo mapa.
     */
    public void refazMundo(){
        
        mapa = new int[][]
        {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}  
        };
        /**
        * Constrói um novo mundo simulado, inicializando as instâncias das classes fake, destroy e imunity.
        */
        Fake = new IAGeradoraDeFakeNews();
        Destroy = new IADestruidoraDeFakeNews();
        Imunity = new MeioComunicacaoConfiavel();
         for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10 ; j++){
                mapa[Fake.getY()+i][Fake.getX()+j] = Fake.getCor();
                mapa[Destroy.getY()+i][Destroy.getX()+j] = Destroy.getCor();
                mapa[Imunity.getY()+i][Imunity.getX()+j] = Imunity.getCor();
            }}
    }
   
    /**
     * Gera o mundo simulado, preenchendo o mapa com as instâncias das classes fake, destroy e imunity.
     */
    public void desenhaMundo(){
        // Preenche o mapa com as instâncias das classes fake, destroy e imunity
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa[i].length; j++){
                switch(mapa[i][j]){
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("\033[47m \033[0m");
                        break;
                    case 2:
                        //roxo
                        System.out.print("\033[45m \033[0m");
                        break;
                    case 3:
                        //azul
                        System.out.print("\033[44m \033[0m");
                        break;
                    case 4:
                        // verde
                        System.out.print("\033[42m \033[0m");
                        break;
                    case 5:
                        // mal info
                        System.out.print("\033[43m \033[0m");
                        break;
                    case 6:
                        //vermelho
                        System.out.print("\033[41m \033[0m");
                        break;
                    default:
                        break;   
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
    /**
    * Coloca as pessoas no mapa e executa ações com base nas cores do mapa.
    * @param pessoa A lista de pessoas a serem colocadas no mapa.
    */
    public void colocaMapa(ArrayList<Pessoa> pessoa){
        int xAtual, yAtual;
        // Verifica a interação entre as pessoas e adiciona contatos com base nas posições no mapa
        for(int i = 0; i < pessoa.size(); i++){
            for(int j = 0; j < pessoa.size(); j++){
                if(pessoa.get(i).getX() == pessoa.get(j).getX() &&
                   pessoa.get(i).getY() == pessoa.get(j).getY()){
                   pessoa.get(i).AdicionarContato(pessoa.get(j).getWhatsappID());
                   pessoa.get(j).AdicionarContato(pessoa.get(i).getWhatsappID());
                } else if(pessoa.get(i).getX() == (pessoa.get(j).getX()-1) &&
                   pessoa.get(i).getY() == pessoa.get(j).getY()){
                   pessoa.get(i).AdicionarContato(pessoa.get(j).getWhatsappID());
                   pessoa.get(j).AdicionarContato(pessoa.get(i).getWhatsappID());
                } else if(pessoa.get(i).getX() == (pessoa.get(j).getX()+1) &&
                   pessoa.get(i).getY() == pessoa.get(j).getY()){
                   pessoa.get(i).AdicionarContato(pessoa.get(j).getWhatsappID());
                   pessoa.get(j).AdicionarContato(pessoa.get(i).getWhatsappID());
                } else if(pessoa.get(i).getX() == pessoa.get(j).getX() &&
                   pessoa.get(i).getY() == (pessoa.get(j).getY()-1)){
                   pessoa.get(i).AdicionarContato(pessoa.get(j).getWhatsappID());
                   pessoa.get(j).AdicionarContato(pessoa.get(i).getWhatsappID());
                } else if(pessoa.get(i).getX() == pessoa.get(j).getX() &&
                   pessoa.get(i).getY() == (pessoa.get(j).getY()+1)){
                   pessoa.get(i).AdicionarContato(pessoa.get(j).getWhatsappID());
                   pessoa.get(j).AdicionarContato(pessoa.get(i).getWhatsappID());
                }
            }
        
            // coloca pessoa no mapa com base nas cores
        for(int u = 0; u < pessoa.size(); u++){
            xAtual = pessoa.get(u).getX();
            yAtual = pessoa.get(u).getY();
            
            // caso elas fiquem em cima de um bloco com determinada cor certas funções são ativadas
            switch(mapa[xAtual][yAtual]){
                    case 6 -> {
                        Fake.DisseminaFakeNews(pessoa, pessoa.get(u).getAgendaContatos());
                    }
                    case 4 ->{
                        Destroy.DestroiFakeNews(pessoa, pessoa.get(u).getAgendaContatos());
                    }
                    case 2 ->{
                        Imunity.ImuneAFakeNews(pessoa, u);
                    }
                    default -> {
                    }   
                }
            
            mapa[xAtual][yAtual] = pessoa.get(u).getCor();
            
           }
        
        }
    }
}

