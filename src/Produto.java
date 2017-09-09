import java.util.ArrayList;

public class Produto {
	double preco;
	String quantidade;
	int quantidade1;
	ArrayList<String> salgados = new ArrayList();
	ArrayList<String> doces = new ArrayList();
	
	
	
	public Produto(){
		System.out.println("Carregando...");
		salgados.add("-");
		salgados.add("Coxinha");
		salgados.add("Pao de Queijo");
		salgados.add("Pastel de Carne");
		salgados.add("Pastel de Frango");
		doces.add("-");
		doces.add("Bolo");
		doces.add("Brigadeiro");
	}
	
	public double AdicionarPedido(int tipo,int pedido){
			System.out.println("Anotando Pedido...");
			return 0.0;
		}
		
	}

