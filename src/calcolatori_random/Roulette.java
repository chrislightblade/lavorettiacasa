/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatori_random;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Roulette {

    public static void main(String[] args) {

        Random random = new Random();
        int a, r_or_b = 0;
        int portafoglio;
        int cifra_scommessa;
        int i = 1;
        boolean scommessa = false;
        int control = 0;
        int vittoria = 0, perdita = 0;
       
        for(int j = 1; j <= 1000; j++){//for per contare in quante volte rischi di perdere e capire se vale la pena in RL
            portafoglio = 100;
        while (portafoglio < 200) {
            cifra_scommessa = 1;//cifra iniziale da scommettere
            portafoglio = portafoglio - cifra_scommessa;//tolgo dal portafoglio la cifra scommessa
            //System.out.println(portafoglio);
            if ((r_or_b % 2) == 0) {//se esce rosso
                while (scommessa == false) {//fintanto che non ho vinto la puntata
                    a = (int) (101 * random.nextDouble());//random
                    a += 1;
                    if (a <= 50) {//se rosso
                        //System.out.println("rosso");
                        scommessa = true;//uscirò dal while in cui scommetto sul rosso
                        portafoglio = portafoglio + (cifra_scommessa * 2);//vinco il doppio della cifra puntata                        
                        //System.out.println("al ciclo " + i + " hai vinto " + cifra_scommessa + " avendo ora " + portafoglio);
                    }
                    if (a > 50 && a <= 100) {//se nero
                        //System.out.println("nero");
                        cifra_scommessa = cifra_scommessa * 2;//raddoppio la scommessa
                        portafoglio = portafoglio - cifra_scommessa;//sottraggo al portafoglio la cifra scommessa
                        if (portafoglio < 0) {//hai perso
                            break;
                        }
                    }
                    if (a == 101) {//se verde
                        //System.out.println("verde");
                        cifra_scommessa = cifra_scommessa * 2;//raddoppio la scommessa
                        portafoglio = portafoglio - cifra_scommessa;//sottraggo al portafoglio la cifra scommessa
                        if (portafoglio < 0) {
                            break;
                        }
                    }
                }//while rosso
            } else {
                while (scommessa == false) {//fintanto che non ho vinto la puntata
                    a = (int) (101 * random.nextDouble());//random
                    a += 1;
                    if (a <= 50) {//se rosso
                        //System.out.println("rosso");
                        cifra_scommessa = cifra_scommessa * 2;//raddoppio la scommessa
                        portafoglio = portafoglio - cifra_scommessa;//sottraggo al portafoglio la cifra scommessa
                        if (portafoglio < 0) {
                            break;
                        }
                    }
                    if (a > 50 && a <= 100) {//se nero
                        //System.out.println("nero");
                        scommessa = true;//uscirò dal while in cui scommetto sul rosso
                        portafoglio = portafoglio + (cifra_scommessa * 2);//vinco il doppio della cifra puntata
                        //System.out.println("al ciclo " + i + " hai vinto " + cifra_scommessa + " avendo ora " + portafoglio);
                    }
                    if (a == 101) {//se verde
                        //System.out.println("verde");
                        cifra_scommessa = cifra_scommessa * 2;//raddoppio la scommessa
                        portafoglio = portafoglio - cifra_scommessa;//sottraggo al portafoglio la cifra scommessa
                        if (portafoglio < 0) {
                            break;
                        }
                    }
                }//while nero
            }
            r_or_b++;//scommetto su un colore nuovo
            scommessa = false;//ritorno a scommettere
            i++;
            if (portafoglio < 0) {
                break;
            }
        }//while maggiore
        if (portafoglio < 0) {//hai perso e te lo dice
            //System.out.println("hai perso in " + i + " cicli ");
            perdita++;

        } else {// hai vinto e te lo dice
            //System.out.println("hai effettuato " + i + " cicli di scommesse per arrivare a " + portafoglio);
            vittoria++;
        }
    }//for
        System.out.println("vittorie: " + vittoria + "\nsconfitte: " + perdita);
    }
}
