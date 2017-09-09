import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Pedido {
	public static void main(String[] args){
		String numerodopedido;
		int numerodopedido1;
		String tipodopedido;
		int tipodopedido1;
		String alternativa;
		int alternativa1 = 1;
		double resultado; 
		
		Produto pro = new Produto();
		Salgado sal = new Salgado();
		Doce d = new Doce();
	
		ArrayList<String> produtos = new ArrayList();
		produtos.add("-");
		produtos.add("Salgado");
		produtos.add("Doce");
		
		System.out.println("Bem Vindo!");
		while (alternativa1 != 0){ 
			JOptionPane.showMessageDialog(null, "Que tipo de pedido que voce deseja?");
			tipodopedido = JOptionPane.showInputDialog("Digite o valor correspondente:  1 - Salgado" +" / " + " 2 - Doce");
			tipodopedido1 = Integer.parseInt(tipodopedido);
			if (tipodopedido1 == 1){
				System.out.println("Tipo do Pedido: " + produtos.get(1));
				JOptionPane.showMessageDialog(null, "O que voce deseja?");
				numerodopedido = JOptionPane.showInputDialog("Digite a alternativa : 1 - Coxinha" + " / " + " 2 - Pao de Queijo" + " / " + " 3 - Pastel de Carne" + " / " + " 4 - Pastel de Frango");
				numerodopedido1 = Integer.parseInt(numerodopedido);
				resultado = sal.AdicionarPedido(tipodopedido1,numerodopedido1);
				JOptionPane.showMessageDialog(null, "Valor Total: " + resultado);
			}else if(tipodopedido1 == 2){
				produtos.add("Doce");
				System.out.println("Tipo do Pedido: " + produtos.get(2));
				JOptionPane.showMessageDialog(null, "O que voce deseja?");
				numerodopedido = JOptionPane.showInputDialog("Digite o Valor: 1 - Bolo" + " / " + " 2 - Brigadeiro");
				numerodopedido1 = Integer.parseInt(numerodopedido);
				resultado = d.AdicionarPedido(tipodopedido1,numerodopedido1);
				JOptionPane.showMessageDialog(null, "Valor Total: " + resultado);
			}else{
				System.out.println("Tipo Invalido");
				JOptionPane.showMessageDialog(null, "Deseja continuar com o pedido?");
				alternativa = JOptionPane.showInputDialog("Digite o valor correspondente: 1 - Sim" +" / " + " 0 - Nao");
				alternativa1 = Integer.parseInt(alternativa);
			}
			alternativa1 = 0;
		}
		}
	}

