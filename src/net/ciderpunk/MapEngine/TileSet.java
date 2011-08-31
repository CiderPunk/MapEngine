package net.ciderpunk.MapEngine;
import java.awt.*;
import javax.swing.ImageIcon;


public class TileSet{

	int iTileWidth;
	int iTileHeight;
	Image oImage;
	
	public TileSet(String strPath, int tileWidth, int tileHeight){
		iTileWidth = tileWidth;
		iTileHeight = tileHeight;
		
		oImage = new ImageIcon(strPath).getImage();
		
	}
	
	
	
}
