/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import interfaceGrafica.Frame.Frame;

/**
 *
 * @author Caio
 */
public class Jogo {
    
    public Treinador t1;
    public Treinador t2;
    
    
    
    public Jogo(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
}
