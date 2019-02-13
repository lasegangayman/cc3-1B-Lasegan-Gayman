package RPG;

public class Character {
    
    public Character(){
        Dice_test d = new Dice_test();    
        Characters harlan = new Characters("Harlan the Notorious ", d.roll(), d.roll(), d.roll());
        Characters jeptha = new Characters("The Undefeated Jeptha ", d.roll(), d.roll(), d.roll());
        
        for(int i = 1; i <= 3; i++){   
            System.out.println("ROUND " + i + "!");
            
            
            System.out.println(harlan.getName() + " HP: " + harlan.getCurrentLife());
            System.out.println(jeptha.getName() + "HP: " + jeptha.getCurrentLife());
            
            int jAttack = harlan.attack(), mAttack = jeptha.attack();
            
           System.out.println(harlan.getName() + "attacks " + jeptha.getName() + " for " + jAttack + " damage!");
           System.out.println(jeptha.getName() + "attacks " + harlan.getName() + " for " + mAttack + " damage!");
            
            jeptha.wound(jAttack);
            harlan.wound(mAttack);
         
           System.out.println(" ");
            if((harlan.getCurrentLife() <= 0) && (jeptha.getCurrentLife() > 0)){
                
            System.out.print("\nFinal HP of " +harlan.getName() + " is: " + harlan.getCurrentLife() + "!");
            System.out.print("\nFinal HP of " + jeptha.getName() + "is: " + jeptha.getCurrentLife() + "!");
                System.out.println(" ");
                System.out.println(jeptha.getName() + " wins!" );
                break;
            }
            else if ((jeptha.getCurrentLife() <= 0) && (harlan.getCurrentLife() > 0)){
                
            System.out.print("\nFinal HP of " + harlan.getName() + " is: " + harlan.getCurrentLife() + "!");
            System.out.print("\nFinal HP of " + jeptha.getName() + " is: " +jeptha.getCurrentLife() + "!");
            System.out.println(" ");
                System.out.println(harlan.getName() + " wins!");
                break;
            }
            else if((harlan.getCurrentLife()<=0) && (jeptha.getCurrentLife()<=0) ){
                System.out.print("\nFinal HP of " + harlan.getName() + " is: " + harlan.getCurrentLife() + "!");
                System.out.print("\nFinal HP of " +jeptha.getName() + " is: " + jeptha.getCurrentLife() + "!");
                System.out.println(" ");
                System.out.println("Draw!");
                break;
            }
        }
   }

    int getIntelligence() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

}