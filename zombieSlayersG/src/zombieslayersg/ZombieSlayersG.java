/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieslayersg;

import buyi.cit260.zombieSlayers.model.Player;

/**
 *
 * @author Chicho
 */
public class ZombieSlayersG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Player playerOne = new Player();
       
       playerOne.setName("Chicho");
       playerOne.setHp(10);
       playerOne.setStr(1);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
    }
    
}
