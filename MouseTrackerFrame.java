import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame
{
   private final JPanel mousePanel; // Painel onde o evento de mouse ocorre
   private final JLabel statusBar; // Apresenta a informação do evento

   // O construtor MouseTrackerFrame ajusta a GUI e registra os "handlers" dos eventos de mouse
   public MouseTrackerFrame() {
      super("Demonstrando eventos de mouse");

      mousePanel = new JPanel(); 
      mousePanel.setBackground(Color.WHITE); 
      add(mousePanel, BorderLayout.CENTER); // adiciona o painel em JFrame

      statusBar = new JLabel("Mouse fora do JPanel"); 
      add(statusBar, BorderLayout.SOUTH); // adiciona label ao JFrame

      // criação e registro "listener" para eventos de mouse e movimento de mouse
      MouseHandler handler = new MouseHandler(); 
      mousePanel.addMouseListener(handler); 
      mousePanel.addMouseMotionListener(handler); 
   } 

   private class MouseHandler implements MouseListener, MouseMotionListener {

   // 1. manipulador (handler) de eventos MouseListener

      // 1.1 manipula evento quando, após pressionado, o mouse é liberado
      @Override
      public void mouseClicked(MouseEvent event) {
         statusBar.setText(String.format("Clicado em [%d, %d]", 
            event.getX(), event.getY()));
      } 

      // 1.2 manipula evento quando o mouse é pressionado
      @Override
      public void mousePressed(MouseEvent event){
         statusBar.setText(String.format("Pressionado em [%d, %d]", 
            event.getX(), event.getY()));
      }

      // 1.3 manipula evento quando o mouse é liberado 
      @Override
      public void mouseReleased(MouseEvent event){
         statusBar.setText(String.format("Liberado em [%d, %d]", 
            event.getX(), event.getY()));
      }

      // 1.4 manipula evento quando o mouse entra na área
      @Override
      public void mouseEntered(MouseEvent event){
         statusBar.setText(String.format("Mouse entrou em [%d, %d]", 
         event.getX(), event.getY()));
         mousePanel.setBackground(Color.GREEN);
      }

      // 1.5 manipula evento quando o mouse sai da área
      @Override
      public void mouseExited(MouseEvent event) {
         statusBar.setText("Mouse fora do JPanel");
         mousePanel.setBackground(Color.WHITE);
      }

   // 2. manipulador de eventos MouseMotionListener
      
      // 2.1 manipula evento quando o usuário arrasta o mouse com botão pressionado
      @Override
      public void mouseDragged(MouseEvent event){
      statusBar.setText(String.format("Arrastado em [%d, %d]", 
      event.getX(), event.getY()));
      } 

      // 2.2 manipula evento quando o usuário move o mouse
      @Override
      public void mouseMoved(MouseEvent event){
      statusBar.setText(String.format("Moveu-se em [%d, %d]", 
      event.getX(), event.getY()));
      } 

   } // Fim da classe aninhada
} // Fim da classe principal