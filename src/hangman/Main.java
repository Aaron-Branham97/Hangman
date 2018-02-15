/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main {

    public static void main(String[] args) {
		HangmanGUI content = new HangmanGUI("inconceivable");		
		JFrame window = new JFrame("Hangman");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(content);
		window.setPreferredSize(new Dimension(400,400));
		window.pack();
		window.setVisible(true);
		
    }
}
