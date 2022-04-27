

import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
import java.awt.geom.*;

public class SierpinskiGasket extends JPanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 400;

    private final double SQ = Math.sqrt(3.0) / 6;

    private final int TOPX = 200, TOPY = 20;
    private final int LEFTX = 60, LEFTY = 300;
    private final int RIGHTX = 340, RIGHTY = 300;


/*
   //x is accross and y is down
   point 1 - Right  A
   point 2 - Left   B
   point 3 - Top    C
   point 4 draws back to point 1 to complete triangle

    private int[] xPos = {360, 40, 200, 360};
    private int[] yPos = {300, 300, 20, 300};
*/
    private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};
    int bicect;


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public SierpinskiGasket()
    {
        
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }
    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawCircle method.
    //-----------------------------------------------------------------
    @Override
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);
       
        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);
       
    }

  

   /** Draws a triangle  in the middle of the 3 x,y points provided
        finds the midpoints of triangles line segments
        uses midpoint to draw a triangle inside of the points provided

   @param array of 4 points a -> b -> c -> a

   */

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       int dxsquared = (int)Math.pow(xPos[0] - xPos[1],2);
       int dysquared = (int)Math.pow(yPos[0] - yPos[1],2);
       int distance = (int)Math.sqrt(dxsquared + dysquared);
       int ABMidx = ((xPos[0]+xPos[1])/2); 
        int ABMidy = ((yPos[0]+yPos[1])/2);
        int BCMidx = ((xPos[1]+xPos[2])/2); 
        int BCMidy = ((yPos[1]+yPos[2])/2);
        int CAMidx = ((xPos[2]+xPos[3])/2); 
        int CAMidy = ((yPos[2]+yPos[3])/2);
        int[] xPos1 = {ABMidx, BCMidx,CAMidx, ABMidx}; 
        int[] yPos1 = {ABMidy, BCMidy,CAMidy, ABMidy}; 
       
       page.setColor (Color.yellow);
       page.drawPolyline (xPos1, yPos1, xPos1.length);
       

        if (distance > 10)
        {
            //find midpoints and draw triangle
            int ABMidx2 = ((xPos1[0]+xPos1[1])/2); 
            int ABMidy2 = ((yPos1[0]+yPos1[1])/2);
            int BCMidx2 = ((xPos1[1]+xPos1[2])/2);
            int BCMidy2 = ((yPos1[1]+yPos1[2])/2);
            int CAMidx2 = ((xPos1[2]+xPos1[3])/2);
            int CAMidy2 = ((yPos1[2]+yPos1[3])/2);
            
            int topx = ((xPos[2]+BCMidx)/2); 
            int topy = ((yPos[2]+BCMidy)/2);
            int top2x = ((xPos[2]+CAMidx)/2); 
            int top2y = ((yPos[2]+CAMidy)/2);
            
            int leftx = ((xPos[1]+BCMidx)/2); 
            int lefty = ((yPos[1]+BCMidy)/2); 
            int left2x = ((xPos[1]+ABMidx)/2); 
            int left2y = ((yPos[1]+ABMidy)/2);
            
            int rightx = ((xPos[0]+ABMidx)/2); 
            int righty = ((yPos[0]+ABMidy)/2);
            int right2x = ((xPos[0]+CAMidx)/2); 
            int right2y = ((yPos[0]+CAMidy)/2);
           
            
            int[] topX = {topx, top2x, BCMidx2, topx}; 
            int[] topY = {topy, top2y, BCMidy2, topy}; 
            int[] leftX = {leftx, left2x, ABMidx2, leftx}; 
            int[] leftY = {lefty, left2y, ABMidy2, lefty}; 
            int[] rightX = {rightx, right2x, CAMidx2, rightx}; 
            int[] rightY = {righty, right2y, CAMidy2, righty}; 
            //draw the tri
            page.setColor (Color.yellow);
            page.drawPolyline (topX, topY, topX.length);
            page.drawPolyline (leftX, leftY, leftX.length);
            page.drawPolyline (rightX, rightY, rightX.length);
            
            
            //call the 3 new triangles
            Triangle(topX, topY,page);
            Triangle(leftX, leftY,page);
            Triangle(rightX, rightY,page);


        }



   }//end of Triangle

}
