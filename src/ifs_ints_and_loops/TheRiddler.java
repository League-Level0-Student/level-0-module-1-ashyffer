package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
int riddle = 0;
		// 1. Make a variable to hold the score
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer;
 answer = JOptionPane.showInputDialog(null, "IT IS GREATER THAN GOD; IT IS MORE EVIL THAN THE DEVIL; THE POOR HAVE IT; THE RICH NEED IT; AND IF YOU EAT IT, YOU WILL DIE. WHAT IS IT?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equals("Bender")){
	
	JOptionPane.showMessageDialog(null, "correct");


}
		// 5. Otherwise, say "wrong" and tell them the answer
else { JOptionPane.showMessageDialog(null, "wrong! suck it!");
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}}

