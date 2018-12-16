package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirday {
	public static void main(String[] args) {
		String BDay = JOptionPane.showInputDialog(null, "what is your B-Day");
		if (BDay.equals("12/16")) {
			JOptionPane.showMessageDialog(null, "welp I guess you survived today");
		} else {
			JOptionPane.showMessageDialog(null, "oof that sucks I guess you just arent a good human, ROFL LMAO XD");
		}

	}

}
