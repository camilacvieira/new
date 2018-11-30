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
        System.out.println("Vamos começar!");
        while(t1.getVidaTotal()>0&&t2.getVidaTotal()>0)
        {
            pokemonAtual();
            round(); 
            //System.out.println("t1 vida "+t1.getVidaTotal());
            //System.out.println("t2 vida "+t2.getVidaTotal());
            //System.out.println("t1 mana "+t1.mana);
            //System.out.println("t2 mana "+t2.mana);
            
        }
            System.out.println("Total de vida: "+ "Jogador 1: "+ t1.getVidaTotal()+"Jogador 2: "+t2.getVidaTotal());            
}
    
    public void pokemonAtual(){
        for(int i = 0 ; i < t1.time.pokemons.size() ; i++){
            if(t1.time.pokemons.get(i).healthPoints > 0){ // Ve se o Pokemon tem vida maior que 0, se não tiver muda para o proximo.
                p1 = t1.time.pokemons.get(i);
                break;
            }
                           System.out.println("O Pokemon"+i+" morreu!, próximo");
        }
        
        for(int i = 0 ; i < t2.time.pokemons.size() ; i++){
            if(t2.time.pokemons.get(i).healthPoints > 0){ // Ve se o Pokemon tem vida maior que 0, se não tiver muda para o proximo.
                p2 = t2.time.pokemons.get(i);
                break;
            }
            System.out.println("O Pokemon"+i+"morreu!, próximo");
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
        //checaVantagem();
        System.out.println("Vai treinador 1: ");
        ataque(1);
        System.out.println("Vai treinador 2: ");
        ataque(2);
        System.out.println("Treinadores recuperem 20 de mana!");
        recuperaManaPoints(t1,t2);
    }
     
    public void ataque(int numTreinador){    
        int choice = -1;
        float dano = 0;
        
        if(numTreinador == 1){
            choice=t1.escolheAtaque();
            System.out.println("Vida do pokemon: "+p2.healthPoints);
            if(p1.manaPoints[choice] <= t1.mana){
               dano = p1.calculaAtaque(choice);
               p2.healthPoints = p2.healthPoints - dano;
               t2.setVidaTotal(t2.getVidaTotal() - dano);
               t1.mana = t1.mana - p1.manaPoints[choice];
               System.out.println("Dano feito: "+dano);
               System.out.println("Mana Restante: "+t2.mana);
               System.out.println("Vida pos ataque do pokemon: "+p2.healthPoints);
            }
            else{
                while(p2.manaPoints[choice]>t2.mana){
                     System.out.println("Mana insuficiente,vc tem "+t2.mana+"pontos de mana Jogue novamente");
                     choice=t2.escolheAtaque();
                }
                dano = p1.calculaAtaque(choice);
                p2.healthPoints = p2.healthPoints - dano;
                t2.setVidaTotal(t2.getVidaTotal() - dano);
                t1.mana = t1.mana - p1.manaPoints[choice];
                System.out.println("Dano feito: "+dano);
                System.out.println("Mana Restante: "+t2.mana);
                System.out.println("Vida pos ataque do pokemon: "+p2.healthPoints);
             }
        }    
        
        else{
            choice=t2.escolheAtaque();
            System.out.println("Vida do pokemon: "+p2.healthPoints);
             if(p2.manaPoints[choice] <= t2.mana){
               dano = p2.calculaAtaque(choice);
               p1.healthPoints = p1.healthPoints - dano;
               t1.setVidaTotal(t1.getVidaTotal() - dano);
               t2.mana = t2.mana - p2.manaPoints[choice];
               System.out.println("Dano feito: "+dano);
               System.out.println("Mana Restante: "+t2.mana);
               System.out.println("Vida pos ataque do pokemon: "+p2.healthPoints);
            }
             else{
                while(p2.manaPoints[choice]>t2.mana){
                     System.out.println("Mana insuficiente,vc tem "+t2.mana+"pontos de mana Jogue novamente");
                     choice=t2.escolheAtaque();
                }
                dano = p2.calculaAtaque(choice);
                p1.healthPoints = p1.healthPoints - dano;
                t1.setVidaTotal(t1.getVidaTotal() - dano);
                t2.mana = t2.mana - p2.manaPoints[choice];
                System.out.println("Dano feito: "+dano);
                System.out.println("Mana Restante: "+t2.mana);
                System.out.println("Vida pos ataque do pokemon: "+p2.healthPoints);
             }        
        }            
    }
    
    public void recuperaManaPoints(Treinador t1, Treinador t2){
        t1.mana=t1.mana+20;
        t2.mana=t2.mana+20;
    }      
}
    
    
             

