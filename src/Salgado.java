import javax.swing.JOptionPane;

public class Salgado extends Produto {
	double valorcoxinha = 2.0;
	double valorpaodequeixo = 1.50;
	double valorpastelcarne = 2.25;
	double valorpastelfrango = 2.25;
	
	
	public double AdicionarPedido(int tipo,int pedido){
		if (tipo == 1) {
			super.AdicionarPedido(tipo, pedido);
			double resultado;
			System.out.println("Pedido: " + salgados.get(pedido));
			quantidade = JOptionPane.showInputDialog("Quantas unidades?");
			quantidade1 = Integer.parseInt(quantidade);
			System.out.println("Quantidade: " + quantidade1);
			resultado = CalculaValor(pedido,quantidade1);
			return resultado;
		}
		return pedido; 
	
	}

	private double CalculaValor(int pedido, int quantidade1) {
		double valortotal = 0;
		if (pedido == 1){
			valortotal = valorcoxinha * quantidade1;
		}else if (pedido == 2){
			valortotal = valorpaodequeixo * quantidade1;
		}else if (pedido == 3){
			valortotal = valorpastelcarne * quantidade1;
		}else if (pedido == 4){
			valortotal = valorpastelfrango * quantidade1;
		}
		return valortotal;
	}
}
