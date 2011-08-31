package net.ciderpunk.MapEd;

import java.awt.*;
import java.awt.image.BufferStrategy;

import javax.swing.*;

public class Screen extends Canvas  implements Runnable
{
	
	JFrame oFrame;
	
	
  public Screen()
  {
		oFrame = new JFrame();
		oFrame.setSize(400, 400);
		oFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oFrame.getContentPane().add(this);                    // Here we add it to the frame
		oFrame.setVisible(true);
		oFrame.setIgnoreRepaint(true);
		oFrame.setResizable(false);
		this.createBufferStrategy(2);
  }
  
  
	//updates display
	public void Update(){
		BufferStrategy oBS = this.getBufferStrategy();
		if (!oBS.contentsLost()){
			oBS.show();
		}
	}
  
	
	public void run() {

		
	}
  
  
  

}