package xyz.mrshawn.ezcap.screencap;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HighlightSelection implements MouseListener {

	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
	}

	public void mouseReleased(MouseEvent e) {
		x2 = e.getY();
		y2 = e.getY();
	}

	/*
	Currently unused methods
	 */

	public void mouseClicked(MouseEvent e) { }

	public void mouseEntered(MouseEvent e) { }

	public void mouseExited(MouseEvent e) { }
}
