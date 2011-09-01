package net.ciderpunk.MapEngine;
import java.awt.*;
import javax.swing.ImageIcon;


public class TileSet{

	int iTileWidth;
	int iTileHeight;
	int iCols;
	int iRows;
	Image oImage;
	Tile[] aTiles;
	
	
	public TileSet(String strPath, int tileWidth, int tileHeight){
		iTileWidth = tileWidth;
		iTileHeight = tileHeight;
		oImage = new ImageIcon(strPath).getImage();
		iCols = oImage.getWidth(null) / iTileWidth;
		iRows = oImage.getHeight(null) / iTileHeight;
		aTiles = new Tile[iCols * iRows];
		
	}
	
	
	
}
