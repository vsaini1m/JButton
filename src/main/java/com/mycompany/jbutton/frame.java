/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jbutton;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author kaal
 */

public class frame extends JFrame{
    JButton btn=new JButton("Click Me");
    public frame(){
   
    super("JBUTTON");
    setVisible(true);
    setSize(400,400);
        setResizable(false);
    
        setLayout(new FlowLayout());
        add(btn);
    }
}