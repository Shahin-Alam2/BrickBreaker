
package Jar;

import Jar.Gameplay;
import Jar.Gameplay;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        Gameplay gamePlay=new Gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
    
}
