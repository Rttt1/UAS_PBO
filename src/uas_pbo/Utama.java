
package uas_pbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Utama {
    public static void main (String[] args) {
        JFrame frame = new JFrame ("TUGAS UAS OOP");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setLayout (new FlowLayout());
        
        JButton klik = new JButton ("Run");
        frame.add (klik);
                
        klik.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                Data Data = new Data ("Adidarma Mahendra", 312110509, 22);
                Data.getInfo();
                Prog Prog = new Prog("Teknik Informatika", 3);
                Prog.setData(Data);
            
                System.out.println ("Program Studi : "+Prog.getNama());
                System.out.println ("Semester : "+Prog.getSem());
            }
        });
    
        frame.setVisible(true);
    }
}
