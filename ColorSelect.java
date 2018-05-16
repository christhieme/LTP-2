import javax.swing.JFrame;

public class ColorSelect
{
   // execute application
   public static void main ( String[] args )
   {
      ColorSelectFrame colorSelectFrame = new ColorSelectFrame(); 
      colorSelectFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      colorSelectFrame.setSize( 300, 125 ); // set frame size
      colorSelectFrame.setVisible( true ); // display frame
   } // end main
} // end class ColorSelect