/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farwestgamev2;

import byui.cit260.farWestGame.model.Game;
import byui.cit260.farWestGame.model.Player;
import byui.cit260.farWestGame.view.StartProgramView;

/**
 *
 * @author Agustin
 */
public class FarWestGameV2 {
    
    private static Player player;
    private static Game game;
    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        FarWestGameV2.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        FarWestGameV2.game = game;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }
    
}
