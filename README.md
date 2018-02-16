# Hangman


##Introduction Welcome to Hangman! The project was made for a Java Programming class Individual Project. 



##Installation Click here to download the zip folder that contains the program files. If that does not work, click the "Clone or download" button and select the option "Download Zip". Next, find the zip folder in your downloads folder. Unzip the folder to a convenient location. To run this project you can run the jar file in the main folder.  

<p align="center">
  <img src="Pictures/OpeningBoard.PNG" width="350"/>
</p>

##Instructions The goal of this game is to guess the mystery word. Each turn the player chooses a letter to guess that they think is in the word. After each guess that tile will be disabled to prevent double guessing of a word. If the letter is in the mystery word, the placement in the mystery word will be revealed bellow. Default the mystery word to the user is "*****" depending on the number of letters of the word. If the chosen letter is not, the number of misses will be incremeted. Be careful, because 6 missed letters will result in a loss! 

The default word is "inconceivable" for this game. To change the word, go into the Main.java file and change the String inputed into the HangmanGUI constructor on line 11. 

##Example Gameplay

<p align="center">
  <img src="Pictures/firstTurn.PNG" width="350"/>
</p>

In this example, The Player guesses the letter "G". "G" is not in the mystery word, so the Missed letter counter is incremeted. The "G" is also now disable to prevent another "G" guess.

<p align="center">
  <img src="Pictures/2Turn.PNG" width="350"/>
</p>

Player O places his/her token in the Bottom-Left tile on the grid.

<p align="center">
  <img src="Pictures/XSecondTurn.PNG" width="350"/>
</p>

Player X places his/her token in the Top-Middle tile on the grid. Player X now has 2 in a row!

<p align="center">
  <img src="Pictures/OSecondTurn.PNG" width="350"/>
</p>

Player O places his/her token in the Top-Right tile on the grid to keep Player X from winning next turn, and it also means that Player O just needs the Middle-Middle tile to get 3 in a row!

<p align="center">
  <img src="Pictures/XThirdTurn.PNG" width="350"/>
</p>

Player X then places his/her token in the Middle-Middle tile to keep O from winning and to garreentee his win! He will either get the win with the middle vertical three in a row or the diagnal from the Top-Left to Bottom-Right.

<p align="center">
  <img src="Pictures/OThirdTurn.PNG" width="350"/>
</p>

Player O places his/her token in the Bottom-Right tile to keep stop the diagnal win for Player X.

<p align="center">
  <img src="Pictures/XFourthTurn.PNG" width="350"/>
</p>

Player X places his/her token in the Bottom-Middle tile to get the middle vertical three in a row win condition.

##Acknowledgements

The professor of my Software Engineering course provided the project structure with what classes did what. I wrote the game logic and the GUI.
