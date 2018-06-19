package byui.cit260.farWestGame.control;

import byui.cit260.farWestGame.model.Player;

/**
 *
 * @author agustin
 */
public class GameControl {
    
    public static void createNewGame(Player player){
        System.out.println("Start game called");        
    }
    
    public static void exploreLocation(int hours) {
        int total = DiceControl.rollDices(3);
        switch (hours) {
            case 1:
                if (total > 10) {
                    System.out.println("You have found something");
                } else {
                    System.out.println("You did not find anything and got wounded");
                }
                break;
            case 2:
                if (total > 6) {
                    System.out.println("You have found something");
                } else {
                    System.out.println("You did not find anything and got wounded");
                }
                break;
            case 3:
                if (total > 2) {
                    System.out.println("You have found something");
                } else {
                    System.out.println("You did not find anything and got wounded");
                }
                break;
            default:
                System.out.println("There was an error, please try again");
        }

    }
}
