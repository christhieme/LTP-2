import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ColorSelectFrame extends JFrame 
{
   private JButton okJButton;
   private JButton cancelJButton;
   private JCheckBox backgroundJCheckBox;
   private JCheckBox foregroundJCheckBox;
   private JComboBox colorJComboBox;
   private JPanel panel;
   private JPanel panel2;

   // constructor creates components and adds them to applet
   public ColorSelectFrame()
   {
      super( "ColorSelect" );

      setLayout( new BorderLayout() );

      colorJComboBox = new JComboBox(); // create combobox
      colorJComboBox.addItem( "RED" ); // add red item
      add( colorJComboBox, BorderLayout.NORTH ); // put in north region

      panel = new JPanel(); // create a panel
      backgroundJCheckBox = new JCheckBox( "Background" ); // background
      foregroundJCheckBox = new JCheckBox( "Foreground" ); // foreground
      panel.add( backgroundJCheckBox ); // add background checkbox
      panel.add( foregroundJCheckBox ); // add foreground checkbox
      add( panel, BorderLayout.CENTER ); // add panel to center region

      okJButton = new JButton( "Ok" ); // create Ok button
      cancelJButton = new JButton( "Cancel" ); // create cancel button
      panel2 = new JPanel(); // create panel to hold buttons
      panel2.add( okJButton ); // add ok button to panel
      panel2.add( cancelJButton ); // add cancel button to panel
      add( panel2, BorderLayout.SOUTH ); // add panel to south region
   } // end ColorSelectFrame constructor
} // end class ColorSelectFrame