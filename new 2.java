
import javax.swing.JOptionPane;

public class AreaR {
public static void main (String[] args){
	
	String firstNumber=
			JOptionPane.showInputDialog("Adicione a Largura");
	String secondNumber=
			JOptionPane.showInputDialog("Adicione a Altura");
	
	int largura = Integer.parseInt(firstNumber);
	int altura = Integer.parseInt(secondNumber);
	
		int resul = largura * altura;
		
		if (largura == altura){
			JOptionPane.showMessageDialog (null, "é um quadrado" + resul,"Resultado",JOptionPane.PLAIN_MESSAGE);
			
			
		}else{JOptionPane.showMessageDialog (null, "O tamanho é:  " + resul, "Resultado",JOptionPane.PLAIN_MESSAGE);}
}
}
 