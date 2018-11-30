/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
      	
    public int escolheAtaque(){
        //qual ataque vc quer utilizar?
        //cin
        int choice=-1;
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Qual ataque vc quer utilizar? 1- 75mp, 2- 50mp, 3- 25mp, 4-Passar a vez");
        int ler = reader.nextInt();
        choice=choice+ler;
        if(choice==0||choice==1||choice==2||choice==3){
        return choice;
        }
        else{
            System.out.println("Insira um ataque válido");
            return -1;
        }
    }
    
}
