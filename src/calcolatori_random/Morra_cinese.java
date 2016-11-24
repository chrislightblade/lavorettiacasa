/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatori_random;

import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author Administrator
 */
public class Morra_cinese {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int a = (int) (3 * random.nextDouble());
        a += 1;
        if(a == 1)
            JOptionPane.showMessageDialog(null , "Carta");
        if(a == 2)
            JOptionPane.showMessageDialog(null , "Forbice");
        if(a == 3)
            JOptionPane.showMessageDialog(null , "Sasso");
                    
    }
    
}
