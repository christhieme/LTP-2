import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener 
{
   private String line1 = ""; // primeira linha da textarea
   private String line2 = ""; // segunda linha da textarea
   private String line3 = ""; // terceira linha da textarea
   private JTextArea textArea; // textarea para apresentar saída

   // Construtor do KeyDemoFrame
   public KeyDemoFrame(){
      super("Demonstrando eventos de teclado");

      textArea = new JTextArea(10, 15); // Ajusta JTextArea
      textArea.setText("Pressione qualquer tecla...");
      textArea.setEnabled(false);
      textArea.setDisabledTextColor(Color.BLACK);
      add(textArea); // adiciona textarea ao JFrame

      addKeyListener(this); // permite "frame" processar eventos de teclado
   } 

   // manipulação da pressão em qualquer tecla
   @Override
   public void keyPressed(KeyEvent event){
      line1 = String.format("Tecla pressionada: %s", 
      KeyEvent.getKeyText(event.getKeyCode())); // apresenta a tecla pressionada
      setLines2and3(event); // ajusta linhas 2 e 3 da saída
   }

   // manipulação da liberação em qualquer tecla
   @Override
   public void keyReleased(KeyEvent event){
      line1 = String.format("Tecla liberada: %s",
         KeyEvent.getKeyText(event.getKeyCode())); // apresenta tecla liberada
      setLines2and3(event); // ajusta linhas 2 e 3
   }

   // manipulação da pressão em qualquer teclas de ação
   @Override
   public void keyTyped(KeyEvent event){
      line1 = String.format("Tecla pressionada: %s", event.getKeyChar());
      setLines2and3(event); // ajusta linhas 2 e 3 da saída
   }

   // método para ajustar linhas 2 e 3
   private void setLines2and3(KeyEvent event){
      line2 = String.format("Esta tecla %s é uma tecla de ação", 
         (event.isActionKey() ? "" : "não "));

      String temp = KeyEvent.getKeyModifiersText(event.getModifiers());

      line3 = String.format("Tecla modificadora pressionada: %s", 
         (temp.equals("") ? "nenhuma" : temp)); // saída de modificadores

      textArea.setText(String.format("%s\n%s\n%s\n", 
         line1, line2, line3)); // saída de 3 linhas
   }
} // Fim da classe