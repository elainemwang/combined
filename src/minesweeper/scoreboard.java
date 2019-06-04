/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minesweeper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author elainewang
 */
public class scoreboard extends javax.swing.JPanel {

    String[] names = new String[5];
    int[] scores = new int[5];
    /** Creates new form scoreboard */
    public scoreboard() throws FileNotFoundException {
        initComponents();
        File scs = new File("/Users/elainewang/Desktop/NetbeansProjects/minesweeper/src/minesweeper/scores.txt"); 
        File nms = new File("/Users/elainewang/Desktop/NetbeansProjects/minesweeper/src/minesweeper/names.txt");
        Scanner sc = new Scanner(scs);
        Scanner nm = new Scanner(nms);
        for(int i = 0; i < names.length; i++){
            names[i] = nm.nextLine();
            scores[i] = sc.nextInt();
        }
        name1lbl.setText(names[0]);
        score1lbl.setText(scores[0]+"");
        name2lbl.setText(names[1]);
        score2lbl.setText(scores[1]+"");
        name3lbl.setText(names[2]);
        score3lbl.setText(scores[2]+"");
        name4lbl.setText(names[3]);
        score4lbl.setText(scores[3]+"");
        name5lbl.setText(names[4]);
        score5lbl.setText(scores[4]+"");
        
    }
    public void update() throws FileNotFoundException{
        File scs = new File("/Users/elainewang/Desktop/NetbeansProjects/minesweeper/src/minesweeper/scores.txt"); 
        File nms = new File("/Users/elainewang/Desktop/NetbeansProjects/minesweeper/src/minesweeper/names.txt");
        Scanner sc = new Scanner(scs);
        Scanner nm = new Scanner(nms);
        for(int i = 0; i < names.length; i++){
            names[i] = nm.nextLine();
            scores[i] = sc.nextInt();
        }
        name1lbl.setText(names[0]);
        score1lbl.setText(scores[0]+"");
        name2lbl.setText(names[1]);
        score2lbl.setText(scores[1]+"");
        name3lbl.setText(names[2]);
        score3lbl.setText(scores[2]+"");
        name4lbl.setText(names[3]);
        score4lbl.setText(scores[3]+"");
        name5lbl.setText(names[4]);
        score5lbl.setText(scores[4]+"");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfsLbl = new javax.swing.JLabel();
        score1lbl = new javax.swing.JLabel();
        score2lbl = new javax.swing.JLabel();
        score3lbl = new javax.swing.JLabel();
        score4lbl = new javax.swing.JLabel();
        score5lbl = new javax.swing.JLabel();
        name1lbl = new javax.swing.JLabel();
        name2lbl = new javax.swing.JLabel();
        name3lbl = new javax.swing.JLabel();
        name4lbl = new javax.swing.JLabel();
        name5lbl = new javax.swing.JLabel();

        tfsLbl.setText("Top five scores");

        score1lbl.setText("jLabel2");

        score2lbl.setText("jLabel3");

        score3lbl.setText("jLabel4");

        score4lbl.setText("jLabel5");

        score5lbl.setText("jLabel6");

        name1lbl.setText("jLabel1");

        name2lbl.setText("jLabel2");

        name3lbl.setText("jLabel3");

        name4lbl.setText("jLabel4");

        name5lbl.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(tfsLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name1lbl)
                    .addComponent(name2lbl)
                    .addComponent(name3lbl)
                    .addComponent(name4lbl)
                    .addComponent(name5lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(score5lbl)
                    .addComponent(score4lbl)
                    .addComponent(score3lbl)
                    .addComponent(score2lbl)
                    .addComponent(score1lbl))
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tfsLbl)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score1lbl)
                    .addComponent(name1lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score2lbl)
                    .addComponent(name2lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score3lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name3lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score4lbl)
                    .addComponent(name4lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score5lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name5lbl))
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel name1lbl;
    private javax.swing.JLabel name2lbl;
    private javax.swing.JLabel name3lbl;
    private javax.swing.JLabel name4lbl;
    private javax.swing.JLabel name5lbl;
    private javax.swing.JLabel score1lbl;
    private javax.swing.JLabel score2lbl;
    private javax.swing.JLabel score3lbl;
    private javax.swing.JLabel score4lbl;
    private javax.swing.JLabel score5lbl;
    private javax.swing.JLabel tfsLbl;
    // End of variables declaration//GEN-END:variables

}
