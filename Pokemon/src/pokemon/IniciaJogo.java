/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import classesPokemons.Pikachu;
import classesPokemons.Blastoise;
import classesPokemons.Bulbassauro;
import classesPokemons.Charizard;
import classesPokemons.Charmander;
import classesPokemons.Flareon;
import classesPokemons.Gyrados;
import classesPokemons.Jolteon;
import classesPokemons.Meowth;
import classesPokemons.Onix;
import classesPokemons.Squirtle;
import classesPokemons.Venossauro;
import classesPokemons.Vaporeon;
/**
 *
 * @author Arthur
 */
public class IniciaJogo {
            
         Pokemon p1;
         Pokemon p2;
         Pokemon p3;
         Pokemon p4;
         Pokemon p5;
         Pokemon p6;
         Pokemon p7;
         Pokemon p8;
         Pokemon p9;
         Pokemon p10;
         Pokemon p11;
         Pokemon p12; 
         Time t1;
         Time t2;
         Time t3;
         Time t4;
        
        public IniciaJogo(){
            p1 = new Pikachu();
            p2 = new Blastoise();
            p3 = new Bulbassauro();
            p4 = new Charizard();
            p5 = new Charmander();
            p6 = new Flareon();
            p7 = new Gyrados();
            p8 = new Jolteon();
            p9 = new Onix();
            p10 = new Venossauro();
            p11 = new Vaporeon();
            p12 = new Squirtle();
            t1 = new Time(p5,p11,p10);
            t2 = new Time(p12,p6,p7);
            t3 = new Time(p3,p8,p2);
            t4 = new Time(p1,p4,p9);
        }    
            
        public void escolheTime(){ 
            
            Time escolhido1 = new Time();
            Time escolhido2 = new Time();
            
            // botao escolhe o time escohido1 = t1 ou t2 ou t3 ou t4
           
            Treinador a = new Treinador(t1);
            Treinador b = new Treinador(t2);
            Batalha bat = new Batalha(a,b);
            bat.comecarBatalha();           
		
	}
}
