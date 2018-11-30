package pokemon;

import java.util.ArrayList;

public class Pokemon {
	
        public String nome;
	public String nomeTipo;
        public int tipo; // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
	public String[] habilidades = new String[3];
        public float[] multiHabilidades = {2,1.5f,1};
	public int[] manaPoints = {75,50,25};
	public float healthPoints;
	public float danoAtual = 100;
        public float dano;

  
       
        // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        public int[] vantagens; 
        public int[] fraquesas;
        
        public float calculaAtaque(int index){
            dano = danoAtual;
            dano = dano * multiHabilidades[index];
            return dano;
        }
        



}
