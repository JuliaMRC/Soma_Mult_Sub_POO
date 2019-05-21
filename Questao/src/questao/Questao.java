/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
/**
 *
 * @author 20171BSI0162
 */
public abstract class Questao {
    int operador1;
    int operador2;
    int resultado;
    int pontos;

    public Questao(){
        this.operador1 = ThreadLocalRandom.current().nextInt(0,100);
                
        this.operador2 = ThreadLocalRandom.current().nextInt(0,20);
    }
    
    public abstract boolean FazConta();
    
        public void DaResultado(){

            if (this.FazConta())
                JOptionPane.showMessageDialog(null,"Você acertou!");
            else
                JOptionPane.showMessageDialog(null,"Você errou!");   
        }
}
