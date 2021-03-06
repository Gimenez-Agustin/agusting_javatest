package byui.cit260.farWestGame.view;

import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public abstract class View implements ViewInterface{
        
    public View(){}
    
    @Override
    public String getInputs(String menu) {
        String inputs = "";
        System.out.println(menu);
        boolean valid = false;
        while (valid == false) {
            Scanner scanner = new Scanner(System.in);
//            if(prompt==null){
//                System.out.println("Select option: ");
//            }else{
//                System.out.println(prompt);
//            }            
            inputs = scanner.nextLine().trim();
            if (inputs.length() < 1) {
                System.out.println("You must enter a non-blank value");
            }
            valid = true;

        }
        return inputs;
    }
    
    @Override
     public void display(String menu) {
        boolean endOfView = false;
        do {
            String inputs = getInputs(menu);
            if (inputs.length() < 1 || inputs.toUpperCase().equals("Q")) {
                endOfView = true;
                continue;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);
    }
     
}
