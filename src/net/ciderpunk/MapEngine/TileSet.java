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
		for(int iY = 0; iY < iRows; iY++){
			for(int iX = 0;  iX < iCols; iX++){
				aTiles[(iY * iCols) + iX] = new Tile(oImage, iTileWidth, iTileHeight, iX*iTileWidth, iY * iTileHeight); 
			}
		}
	}
	

	
	public Tile getTile(int id){
		if (id == 0 || id > aTiles.length){
			return null;
		}
		return aTiles[id];
	} 
	
	
	//getters
	public int getTileWidth() {
		return iTileWidth;
	}

	public int getTileHeight() {
		return iTileHeight;
	}
	
	
	
	
}
