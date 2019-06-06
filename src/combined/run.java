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

    
}
