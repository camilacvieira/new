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
 *classe treinador calcula vida e escolheAtaque 
 * @author Arthur
 */
public class Treinador {
    private float vidaTotal;    

    /**
     *declara time de pokemons
     */
    public Time time = new Time();

    /**
     *energia para usar habilidade
     */
    public int mana = 100;
	
    /**
     *inicializa a funcao treinador
     * @param t
     */
    public Treinador(Time t) {
        this.time = t;
        vidaTotal = t.pokemons.get(0).healthPoints + t.pokemons.get(1).healthPoints + t.pokemons.get(2).healthPoints;
    }

    Treinador() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    /**
     *A vida total de todos pokemons somados
     */
    public void calculaVida(){
        vidaTotal = time.pokemons.get(0).healthPoints + time.pokemons.get(1).healthPoints + time.pokemons.get(2).healthPoints;
    }

    /**
     *retorna a vida total
     * @return
     */
    public float getVidaTotal() {
        return vidaTotal;
    }

    /**
     *determina a vida total
     * @param vidaTotal
     */
    public void setVidaTotal(float vidaTotal) {
        this.vidaTotal = vidaTotal;
    }
      	
    /**
     *funcao que determina qual ataque é usado e seu dano
     * @return
     */
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
