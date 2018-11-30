/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arthur
 */
public class Treinador {
    private float vidaTotal;    
    public Time time = new Time();
    public int mana = 100;
	
    public Treinador(Time t) {
        this.time = t;
        vidaTotal = t.pokemons.get(0).healthPoints + t.pokemons.get(1).healthPoints + t.pokemons.get(2).healthPoints;
    }

    Treinador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    public void calculaVida(){
        vidaTotal = time.pokemons.get(0).healthPoints + time.pokemons.get(1).healthPoints + time.pokemons.get(2).healthPoints;
    }

    public float getVidaTotal() {
        return vidaTotal;
    }

    public void setVidaTotal(float vidaTotal) {
        this.vidaTotal = vidaTotal;
    }
      
    
}
