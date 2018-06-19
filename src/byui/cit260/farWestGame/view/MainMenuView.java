package byui.cit260.farWestGame.view;

import byui.cit260.farWestGame.control.GameControl;
import farwestgamev2.FarWestGameV2;

/**
 *
 * @author Agustin
 */
public class MainMenuView {
    
    String menu="N - Start new game\n"
                + "R - Restart existing game\n"
                + "H - Get help on how to play the game\n"
                + "E - Exit";
    
    public void displayMainMenuView() {
        boolean endOfView = false;
        do {
            String inputs = MenuManager.getInputs(menu,null);
            if (inputs.length() < 1 || inputs.toUpperCase().equals("Q")) {
                endOfView = true;
                continue;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);
    }

    private boolean doAction(String inputs) {
        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "N":
                startNewGame();
                break;
            case "R":
                restartGame();
                break;
            case "H":
                getHelp();
                break;
            case "E":
                return true;
            default:
                System.out.println("Invalid menu item.");
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(FarWestGameV2.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView(); 
        helpMenuView.displayHelpMenuView();
    }
}
