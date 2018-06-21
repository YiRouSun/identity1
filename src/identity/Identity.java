/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package identity;

/**
 *
 * @author nisun5097
 */
public class Identity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Nciphermachine;
        double Decipheredpercentage;
        double Sciphermachine;
        double TotalSciphermachine;
        Sciphermachine = 1000;
        Nciphermachine = 2;
        Decipheredpercentage = 0.84;
        TotalSciphermachine = Nciphermachine * Decipheredpercentage * Sciphermachine;
        System.out.println(TotalSciphermachine);
        
        double Nmeetteamates;
        double Smeetmates;
        Smeetmates = 200;
        Nmeetteamates = 2;
        double TotalSmeetmates;
        TotalSmeetmates = Smeetmates * Nmeetteamates;
        System.out.println(TotalSmeetmates);
         
        double Sescape;
        double Nescape;
        Sescape = 150;
        Nescape = 2;
        double TotalSescape;
        TotalSescape = Sescape * Nescape;
        System.out.println(TotalSescape);
        
        double Nresureteammates;
        double Ssureteammates;
        Ssureteammates = 300;
        Nresureteammates = 1;
        double TotalSsureteammates;
        TotalSsureteammates = Nresureteammates * Ssureteammates;
        System.out.println(TotalSsureteammates);
        
        double Wholetotal;
        double Totalsciphermachine;
        double Totalsmeetmates;
        double Totalsescape;
        double Totalssureteammates;
        Wholetotal = TotalSciphermachine + TotalSmeetmates + TotalSescape + TotalSsureteammates + 2500;
        System.out.println(Wholetotal);
        
        double Numbersurvivorsescape = 3;
        if (Numbersurvivorsescape> 2)
        {
           System.out.println("You win the game.");
        }
        else 
        {
           System.out.println("You fail the game");
                }
    }
    
}
