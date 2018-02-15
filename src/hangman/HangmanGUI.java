/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HangmanGUI extends JPanel implements ActionListener {
    
	private Hangman hangman;

    private JToggleButton[] letter;

    private JLabel currentWord;

    private JLabel currentMiss;
	
	private String Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
    public HangmanGUI(String word) {
        JPanel hangmanPanel = new JPanel();
		hangman = new Hangman();
	    hangman.setWord(word);
		letter = new JToggleButton[Letters.length()];
		setLayout(new GridLayout(14,2));  
		for(int i = 0; i < Letters.length(); i++) {
			letter[i] = new JToggleButton(String.valueOf(Letters.charAt(i)));
		    add(letter[i]);
		    letter[i].addActionListener(this);
		    
		}
	 
		currentWord = new JLabel(hangman.getGuessedWord());
		currentMiss = new JLabel("0 Miss(es)");
		add(currentWord);
		add(currentMiss);
		
	}

    public void actionPerformed(ActionEvent event) {
		for (int i = 0; i < Letters.length(); i++) {
			if (event.getSource() == letter[i]){
			    String s = "";
				s = letter[i].getText().toLowerCase();
				hangman.guess(s.charAt(0));
				currentWord.setText(hangman.getGuessedWord());
				letter[i].setEnabled(false);
				currentMiss.setText(String.valueOf(hangman.getNumMisses()) + " Miss(es)");
				}

		}
		if (Hangman.Result.LOSE == hangman.getResult()) {
			for (int i = 0; i < Letters.length(); i++) { 
				letter[i].setEnabled(false);
			}
		}
		if (Hangman.Result.WIN == hangman.getResult()) {
			for (int i = 0; i < Letters.length(); i++) { 
				letter[i].setEnabled(false);
			}
		}
		
    }
}
