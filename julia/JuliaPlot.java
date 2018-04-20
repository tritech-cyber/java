//code by CW Coleman
//save as JuliaPlot.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JuliaPlot extends JFrame {
   public JuliaPlot()
   {
      super( "Julia Set" );
      setSize(400,430);
      setVisible( true );
   }
   public void paint( Graphics g ){
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		    // only change code below this line
        int x, y, h, k, t;
        int iRed, iGreen, iBlue, aiRed, aiGreen, aiBlue;//integer RGB
        x = 0;  y = 0; h = 0; k = 0; t = 0;


        for (x = 0;x <400;x++){
          for (y = 0; y < 430;y++){
              iRed = 155; iGreen = 255; iBlue = 155;
              g.setColor(new Color(iRed,iGreen,iBlue));
              g.drawLine(x,y,x,y);

          }

      }//end for
      // only change code above this line
      // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


  }

// execute application
  public static void main( String args[] ){
    JuliaPlot myobject = new JuliaPlot();//change this
  	   	// adapter to handle only windowClosing event
        myobject.addWindowListener(
  			   new WindowAdapter() {
				      public void windowClosing( WindowEvent event )
				          {System.exit( 0 );}
                }  // end WindowAdapter
        ); // end call to addWindowListener
   }//end main
 }// end class Painter
