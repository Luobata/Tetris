package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class LayerBackGround extends Layer {

	  private static  Image IMG_BG=new ImageIcon("graphics/background/aaa.jpg").getImage();
	
	public LayerBackGround(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(IMG_BG,0,0,1162,654,null);
		
	}

}
