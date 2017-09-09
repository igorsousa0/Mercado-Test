import javax.swing.JOptionPane;

public class Doce extends Produto{
	double valorbolo = 10.0;
	double valorbrigadeiro = 0.50;
	
	public double AdicionarPedido(int tipo,int pedido){
		super.AdicionarPedido(tipo, pedido);
		double resultado;
		System.out.println("Pedido: " + doces.get(pedido));
		quantidade = JOptionPane.showInputDialog("Quantas unidades?");
		quantidade1 = Integer.parseInt(quantidade);
		System.out.println("Quantidade: " + quantidade1);
		resultado = CalculaValor(pedido,quantidade1);
		return resultado;
		}
	private double CalculaValor(int pedido, int quantidade1) {
		double valortotal = 0;
		if (pedido == 1){
			valortotal = valorbolo * quantidade1;
		}else if (pedido == 2){
			valortotal = valorbrigadeiro * quantidade1;
		}
		return valortotal;
	}
	}

