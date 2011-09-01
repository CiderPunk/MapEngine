package net.ciderpunk.MapEngine;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {
	
	TileSolidity iSolid = TileSolidity.None;
	int iWidth;
	int iHeight;
	int iX;
	int iY;
	Image oImage;
	
	public Tile(Image img, int width, int height, int x, int y){
		oImage = img;
		iWidth = width;
		iHeight = height;
		iX = x;
		iY = y;
	}
	
	
	public void draw(Graphics g, int x, int y){
		g.drawImage(oImage, x,y, x+iWidth, y+iWidth, iX,iY,iX+iWidth,iY+iWidth,null);
	}
	
}
