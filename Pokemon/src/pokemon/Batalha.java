/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author ice
 */
public class Batalha {

    private Pokemon p1 = new Pokemon();
    private Pokemon p2 = new Pokemon();
    private Treinador t1 = new Treinador();
    private Treinador t2 = new Treinador();
     
    public Batalha(Treinador t1 , Treinador t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    
    public void comecarBatalha(){
        
        while(t1.getVidaTotal() > 0 &&  t2.getVidaTotal()>0)
        {
            pokemonAtual();
            round(); 
        }
        
    }
    
    public void pokemonAtual(){
        for(int i = 0 ; i < t1.time.pokemons.size() ; i++){
            if(t1.time.pokemons.get(i).healthPoints > 0){ // Ve se o Pokemon tem vida maior que 0, se não tiver muda para o proximo.
                p1 = t1.time.pokemons.get(i);
                break;
            }    
        }
        
        for(int i = 0 ; i < t2.time.pokemons.size() ; i++){
            if(t2.time.pokemons.get(i).healthPoints > 0){ // Ve se o Pokemon tem vida maior que 0, se não tiver muda para o proximo.
                p2 = t2.time.pokemons.get(i);
                break;
            }    
        }
        
    }
    
    public void checaVantagem(){
     
        boolean flag = false;
        for(int i=0; i<p1.vantagens.length ; i++){
            if(p1.vantagens[i] == p2.tipo){
                p1.danoAtual = p1.danoAtual* (1.1f);
                flag = true;
                break;
            }
        }
        
        if(flag == false){
            for(int i=0; i<p2.vantagens.length ; i++){
               if(p2.vantagens[i] == p1.tipo){
                    p1.danoAtual = p1.danoAtual* (1.1f);
                    break;
                }
           }
        }
    }    
    
    public void round(){
        checaVantagem();
        ataque(1);
        ataque(2);
        
    }
    
    public void ataque(int numTreinador){
        // Ter os botoes com as habilidadades
        // Selecionar o que apertar
        // Se aperta o botao de cima choice = 0
        // Se aperta o do meio choice = 1
        // Se aperta o ultimo choice = 2
        
        int choice = -1;
        float dano = 0;
        
        if(numTreinador == 1){
            if(p1.manaPoints[choice] >= t1.mana){
               dano = p1.calculaAtaque(choice);
               p2.healthPoints = p2.healthPoints - dano;
               t2.setVidaTotal(t2.getVidaTotal() - dano);
               t1.mana = t1.mana - p1.manaPoints[choice];
            }
            // Adicionar uma exception para se nao tiver mana suficiente
        }    
        
        else{
             if(p2.manaPoints[choice] >= t2.mana){
               dano = p2.calculaAtaque(choice);
               p1.healthPoints = p1.healthPoints - dano;
               t1.setVidaTotal(t1.getVidaTotal() - dano);
               t2.mana = t2.mana - p2.manaPoints[choice];
            }
            // Adicionar uma exception para se nao tiver mana suficiente
            
        }
             
    }   
      
}
    
    
             

