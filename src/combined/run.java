/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combined;

import java.awt.Component;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import minesweeper.*;
import tictactoe.*;
import kelly8282.flappybird.*;


/**
 *
 * @author elainewang
 */
public class run extends JFrame{
    public run(){
        //elaine
        super("Main");
        
        setSize(600, 300);
        mainScreen screen = new mainScreen();
        ((Component) screen).setFocusable(true);
        add(screen);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void hide()
    {
    	setVisible(false);
    }
    public static void show()
    {
    	setVisible(true);
    }
    
    public static void main(String args[]) throws FileNotFoundException {
        run Run = new run();
        /*
        System.out.println("Starting Flappy Bird - 1.1 by Kelly");
        FlappyBird flappyBird = new FlappyBird();
        
        new InitialScreen();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Game().setVisible(true);
            }
        });
        
        */
    }
}
