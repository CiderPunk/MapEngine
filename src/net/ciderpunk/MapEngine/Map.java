package net.ciderpunk.MapEngine;
import java.awt.*;

public class Map {
	TileSet oTileSet;
	int iWidth;
	int iHeight;
	Tile[][] aTiles;
	
	
	int[][] aMap = {
			{0,0,0,0,0,0,1,2,3,4,0,0,0,0,0},
			{0,0,0,0,0,0,1,2,3,4,0,0,0,0,0},
			{0,0,0,0,0,0,1,2,3,4,0,0,0,0,0},
			{0,0,0,1,0,0,1,2,3,4,0,0,0,0,0},
			{0,0,0,0,0,0,1,2,3,4,0,0,0,0,0},
			{0,0,0,0,1,0,1,2,3,4,0,0,0,0,0},
			{0,0,0,0,0,2,1,2,3,4,0,0,0,0,0},
			{0,0,0,0,0,0,1,2,3,4,0,0,0,0,0},
			{0,0,0,0,3,0,1,2,3,4,0,0,0,0,0},
			{0,0,0,1,0,0,1,2,3,4,0,0,0,0,0},
			{0,0,1,0,0,0,1,2,3,4,0,0,0,0,0},
			{0,0,0,0,0,0,1,2,3,4,0,0,0,0,0},
	};
	
	
	public void draw(Graphics g, int x, int y, int width, int height, int xoffs, int yoffs){	
		int startCol = xoffs / oTileSet.getTileWidth();
		int startRow = yoffs / oTileSet.getTileHeight();
		int startX = x - xoffs %  oTileSet.getTileWidth();
		int startY = y - yoffs %  oTileSet.getTileHeight();
		//clip to specified area
		g.setClip(x,y,width,height);
		
		for (int iy = startY, iCol = startCol; iy < height || iCol > aTiles.length; iy += oTileSet.getTileHeight(), iCol++){
			for (int ix = startX, iRow = startRow; ix < width || iRow > aTiles[iCol].length; iy += oTileSet.getTileHeight(), iCol++){
				Tile oTile = aTiles[ix][iy];
				if (oTile != null){
					oTile.draw(g, ix, iy);
				}
			}
		}
		
		//reset clipping
		g.setClip(null);
		
		
	}
	
	
	
	public Map(TileSet tileSet){
		oTileSet = tileSet;
		iHeight =aMap.length;
		iWidth = aMap[0].length;
		
		aTiles = new Tile[iWidth][iHeight];
		for(int iY = 0; iY < iHeight; iY++){
			for(int iX = 0;  iX < iWidth; iX++){
				int iTileId = aMap[iX][iY];
				aTiles[iX][iY] = oTileSet.getTile(iTileId); 
			}
		}
	}
	
	
}
