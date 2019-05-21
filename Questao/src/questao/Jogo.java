/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao;

import javax.swing.JOptionPane;

/**
 *
 * @author 20171BSI0162
 */
public class Jogo {
    
    Pontos pontos = new Pontos();
    
    void iniciaJogo(){
        String opcao = JOptionPane.showInputDialog("1-SOMA\n2-MULT\n3-SUB\n0-SAIR");
        int opcaoInt= Integer.parseInt(opcao);
        
        while(opcaoInt>0 && opcaoInt<4){

            switch(opcaoInt){
                case 1:
                    Soma newquestion = new Soma();
                    newquestion.FazPergunta();
                    newquestion.FazConta();
                    pontos.verificarQuestao(newquestion);
                    break;
                case 2:
                    Mult new_question = new Mult();
                    new_question.FazPergunta();
                    new_question.FazConta();
                    pontos.verificarQuestao(new_question);
                    break;
                case 3:
                    Sub novaquestion = new Sub();
                    novaquestion.FazPergunta();
                    novaquestion.FazConta();
                    pontos.verificarQuestao(novaquestion);
                    break;
                    
            }
            opcao = JOptionPane.showInputDialog("1-SOMA\n2-MULT\n3-SUB\n0-SAIR");
            opcaoInt= Integer.parseInt(opcao);
        }
        pontos.exibirPontuacao();
    }
}

