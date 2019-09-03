import java.util.Scanner;

public class menu {
	Scanner sc = new Scanner(System.in);

	public menu(int opcao) {

		switch (opcao) {
		case 1:
			menuMoto();
			break;
		case 2:
			menuCarro();
			break;
		case 3:
			menuCaminhao();
			break;
		}
	}

	public boolean menuMoto() {
		System.out.println("Digite a cor da moto: ");
		String cor = sc.next();

		System.out.println("Digite o consumo da moto: ");
		int consumoKm = sc.nextInt();

		System.out.println("Digite o ano da moto: ");
		int ano = sc.nextInt();

		System.out.println("Digite a quantidade de km rodados: ");
		int kmRodados = sc.nextInt();

		System.out.println("Digite a placa: ");
		String placa = sc.next();

		System.out.println("Digite a capacidade do tanque: ");
		double capacidadeTanque = sc.nextDouble();

		System.out.println("Digite a quantidade disponivel no tanque: ");
		double quantidadeTanque = sc.nextDouble();

		System.out.println("Digite a kilometragem do pneu: ");
		double kmPneus = sc.nextDouble();

		System.out.println("Digite a velocidade Maxima: ");
		double velocidadeMaxima = sc.nextDouble();

		moto Moto = new moto(consumoKm, ano, kmRodados, placa, cor, capacidadeTanque, quantidadeTanque, kmPneus,
				velocidadeMaxima);

		int OpcaoDigitada = 0;
		while (true) {
			ChamarMenu();
			System.out.println("Digite a opcao desejada: ");
			OpcaoDigitada = sc.nextInt();
			switch (OpcaoDigitada) {
			case 1:
				Moto.Ligar();
				break;
			case 2:
				Moto.Desligar();
				break;
			case 3:
				Moto.Abastecer();
				break;
			case 4:
				System.out.println("A quantidade desejada: ");
				int Qtd = sc.nextInt();
				Moto.Abastecer(Qtd);
				break;
			case 5:
				Moto.TrocarPneu();
				break;
			case 6:
				Moto.Acelerar();
				break;
			case 7:
				Moto.Freiar();
				break;
			case 8:
				Moto.FreiadaBusca();
				break;
			case 9:
				Moto.ChecarPneu();
				break;
			case 10:
				Moto.Velocimetro();
				break;
			case 11:
				return true;
			}
		}
	}
	
	public void ChamarMenu() {
		System.out.println(" \n 1 - para ligar \n 2 - para desligar \n 3 - para abastecer "
				+ "\n 4 - para abastecer determinado valor \n 5 - para trocar o pneu \n 6 - para acelerar \n 7 - para freiar"
				+ "\n 8 - para freiar bruscamente \n 9 - para checar o pneu \n 10 - para ver o velocimetro \n 11 - para sair");		
	}

	public boolean menuCarro() {
		System.out.println("Digite a cor do carro: ");
		String cor = sc.next();

		System.out.println("Digite o consumo do carro: ");
		int consumoKm = sc.nextInt();

		System.out.println("Digite o ano do carro: ");
		int ano = sc.nextInt();

		System.out.println("Digite a quantidade de km rodados: ");
		int kmRodados = sc.nextInt();

		System.out.println("Digite a placa: ");
		String placa = sc.next();

		System.out.println("Digite a capacidade do tanque: ");
		double capacidadeTanque = sc.nextDouble();

		System.out.println("Digite a quantidade disponivel no tanque: ");
		double quantidadeTanque = sc.nextDouble();

		System.out.println("Digite a kilometragem do pneu: ");
		double kmPneus = sc.nextDouble();

		System.out.println("Digite a velocidade Maxima: ");
		double velocidadeMaxima = sc.nextDouble();

		carro Carro = new carro(consumoKm, ano, kmRodados, placa, cor, capacidadeTanque, quantidadeTanque, kmPneus,
				velocidadeMaxima);

		int OpcaoDigitada = 0;
		while (true) {
			ChamarMenu();
			System.out.println("Digite a opcao desejada: ");
			OpcaoDigitada = sc.nextInt();
			switch (OpcaoDigitada) {
			case 1:
				Carro.Ligar();
				break;
			case 2:
				Carro.Desligar();
				break;
			case 3:
				Carro.Abastecer();
				break;
			case 4:
				System.out.println("A quantidade desejada: ");
				int Qtd = sc.nextInt();
				Carro.Abastecer(Qtd);
				break;
			case 5:
				Carro.TrocarPneu();
				break;
			case 6:
				Carro.Acelerar();
				break;
			case 7:
				Carro.Freiar();
				break;
			case 8:
				Carro.FreiadaBusca();
				break;
			case 9:
				Carro.ChecarPneu();
				break;
			case 10:
				Carro.Velocimetro();
				break;
			case 11:
				return true;
			}
		}

	}

	public boolean menuCaminhao() {
		System.out.println("Digite a cor do caminhao: ");
		String cor = sc.next();

		System.out.println("Digite o consumo do caminhao: ");
		int consumoKm = sc.nextInt();

		System.out.println("Digite o ano do caminhao: ");
		int ano = sc.nextInt();

		System.out.println("Digite a quantidade de km rodados: ");
		int kmRodados = sc.nextInt();

		System.out.println("Digite a placa: ");
		String placa = sc.next();

		System.out.println("Digite a capacidade do tanque: ");
		double capacidadeTanque = sc.nextDouble();

		System.out.println("Digite a quantidade disponivel no tanque: ");
		double quantidadeTanque = sc.nextDouble();

		System.out.println("Digite a kilometragem do pneu: ");
		double kmPneus = sc.nextDouble();

		System.out.println("Digite a velocidade Maxima: ");
		double velocidadeMaxima = sc.nextDouble();

		System.out.println("Digite a capacidade carroceria: ");
		int capacidadeCarroceria = sc.nextInt();
		
		System.out.println("Digite a quantidade de pneus: ");
		int qtdPneus = sc.nextInt();
		
		caminhao Caminhao = new caminhao(consumoKm,qtdPneus, ano, kmRodados, placa, cor, capacidadeCarroceria, capacidadeTanque, quantidadeTanque, kmPneus,
				velocidadeMaxima);

		int OpcaoDigitada = 0;
		while (true) {
			ChamarMenu();
			System.out.println(" 12 - para carregar \n 13 - para descarregar");
			System.out.println("Digite a opcao desejada: ");
			OpcaoDigitada = sc.nextInt();
			switch (OpcaoDigitada) {
			case 1:
				Caminhao.Ligar();
				break;
			case 2:
				Caminhao.Desligar();
				break;
			case 3:
				Caminhao.Abastecer();
				break;
			case 4:
				System.out.println("A quantidade desejada: ");
				int Qtd = sc.nextInt();
				Caminhao.Abastecer(Qtd);
				break;
			case 5:
				Caminhao.TrocarPneu();
				break;
			case 6:
				Caminhao.Acelerar();
				break;
			case 7:
				Caminhao.Freiar();
				break;
			case 8:
				Caminhao.FreiadaBusca();
				break;
			case 9:
				Caminhao.ChecarPneu();
				break;
			case 10:
				Caminhao.Velocimetro();
				break;
			case 11:
				return true;
			case 12:
				System.out.println("Digite a quantidade a ser carregada: ");
				int QuantidadeC = sc.nextInt();
				Caminhao.CarregarCaminhao(QuantidadeC);
				break;
			case 13:
				Caminhao.Descarregar();
				break;
			}
		}
	}

}
