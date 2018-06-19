/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.PlayerControl;
import farwestgamev2.FarWestGameV2;

/**
 *
 * @author Giovanni Castelazo
 */
public class StartProgramView {

    String menu = "      _      _______ _    _ ______   _____ _____ ____  _   _ ______ ______ _____    _______ _____            _____ _           _    \n"
            + "   /\\| |/\\  |__   __| |  | |  ____| |  __ \\_   _/ __ \\| \\ | |  ____|  ____|  __ \\  |__   __|  __ \\     /\\   |_   _| |       /\\| |/\\ \n"
            + "   \\ ` ' /     | |  | |__| | |__    | |__) || || |  | |  \\| | |__  | |__  | |__) |    | |  | |__) |   /  \\    | | | |       \\ ` ' / \n"
            + "  |_     _|    | |  |  __  |  __|   |  ___/ | || |  | | . ` |  __| |  __| |  _  /     | |  |  _  /   / /\\ \\   | | | |      |_     _|\n"
            + "   / , . \\     | |  | |  | | |____  | |    _| || |__| | |\\  | |____| |____| | \\ \\     | |  | | \\ \\  / ____ \\ _| |_| |____   / , . \\ \n"
            + "   \\/|_|\\/     |_|  |_|  |_|______| |_|   |_____\\____/|_| \\_|______|______|_|  \\_\\    |_|  |_|  \\_\\/_/    \\_\\_____|______|  \\/|_|\\/ \n"
            + "                                                                                                                                    \n"
            + "                                                                                                                                    "
            + "\n"
            + "***************************************************************"
            + "\nWelcome to the Pioneer Trail game!"
            + "\nIn this game, you will be a pioneer family"
            + "\nwho leads a wagon train preparing to go west."
            + "\nYou have suffered constant religious persecution"
            + "\nand wish to find freedom and a new life in a better place."
            + "\nYou have heard of a place called Zion in the mountains"
            + "\nthat offers such freedom and are eager to start your journey."
            + "\n"
            + "\nGood luck in your Journey!\n"
            + "***************************************************************\n";

    String prompt = "Please enter your name";

    public StartProgramView() {

    }

    public void displayStartProgramView() {
        boolean endOfView = false;
        do {
            String inputs = MenuManager.getInputs(menu,prompt);
            if (inputs.length() < 1 || inputs.toUpperCase().equals("Q")) {
                endOfView = true;
                continue;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);
    }

    private boolean doAction(String inputs) {
        String playerName = inputs;
        FarWestGameV2.setPlayer(PlayerControl.savePlayer(playerName));
        if (FarWestGameV2.getPlayer() == null) {
            System.out.println("Could not create the player.+\n"
                    + "Enter a different name.");
            return false;
        } else {
            System.out.println("=================================================\n"
                    + "Welcome to the game " + FarWestGameV2.getPlayer().getName() + "\n"
                    + "We hope you have a lot of fun!\n"
                    + "=================================================");
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.displayMainMenuView();
            return true;
        }
    }

}
