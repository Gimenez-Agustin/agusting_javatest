package byui.cit260.farWestGame.view;

import java.util.Scanner;

/**
 *
 * @author Agustin
 */
public class MenuManager {
    
    
    public static String getInputs(String menu, String prompt) {
        String inputs = "";
        System.out.println(menu);
        boolean valid = false;
        while (valid == false) {
            Scanner scanner = new Scanner(System.in);
            if(prompt==null){
                System.out.println("Select option: ");
            }else{
                System.out.println(prompt);
            }            
            inputs = scanner.nextLine().trim();
            if (inputs.length() < 1) {
                System.out.println("You must enter a non-blank value");
            }
            valid = true;

        }
        return inputs;
    }
    
    
    
}
