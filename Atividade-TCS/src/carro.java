
public class carro extends veiculo {
	double precoGasolina = 4.48;

	@Override
	public void Velocimetro() {
		System.out.println("-------------------------------------------");
		System.out.println("\n Velocidade: " + getVelocidade() + "\n Consumo por km: " + getConsumoKm()
				+ "\n Quantidade de pneus: " + getQtdPneus() + "\n Ano: " + getAno() + "\n Km rodados: "
				+ getKmRodados() + "\n Placa: " + getPlaca() + "\n Cor: " + getCor() + "\n Capacidade Tanque: "
				+ getCapacidadeTanque() + "\n Km dos pneus: " + getKmPneus() + "\n Velocidade Maxima: "
				+ getVelocidadeMaxima() + "\n QuantidadeTanque: " + getQuantidadeTanque());
		System.out.println("-------------------------------------------");
	}

	public carro(int consumoKm, int ano, int kmRodados, String placa, String cor, double capacidadeTanque,
			double quantidadeTanque, double kmPneus, double velocidadeMaxima) {
		super(consumoKm, 4, ano, kmRodados, placa, cor, capacidadeTanque, quantidadeTanque, kmPneus,
				velocidadeMaxima);
	}

	@Override
	public void Ligar() {
		if (isStatus()) {
			System.out.println("Carro ja esta ligado!");
		} else {
			setStatus(true);
			System.out.println("Carro ligado!");
		}
	}

	@Override
	public void Desligar() {
		if (isStatus()) {
			setStatus(false);
			System.out.println("Carro desligado!");
		} else {
			System.out.println("Carro ja esta desligado!");
		}

	}

	@Override
	public void Abastecer() {
		if (getVelocidade() == 0) {
			if (isStatus()) {
				setStatus(false);
				System.out.println("Carro foi desligado para Abastecer!");
			}
			double capacidadeAnterior = getQuantidadeTanque();
			while (getCapacidadeTanque() > getQuantidadeTanque()) {
				setQuantidadeTanque(getQuantidadeTanque() + 1);
				System.out.println("Abastecendo: " + getQuantidadeTanque());
			}

			System.out.println("Carro Abastecido, o total a pagar foi: "
					+ ((getCapacidadeTanque() - capacidadeAnterior) * precoGasolina));
		} else {
			System.out.println("Nao eh possivel abastecer com o carro andando");
		}
	}

	@Override
	public void Abastecer(int Quantidade) {
		if (getVelocidade() == 0) {
			if (isStatus()) {
				setStatus(false);
				System.out.println("Carro foi desligado para Abastecer!");
			}
			if (Quantidade < getQuantidadeTanque()) {
				setQuantidadeTanque(getQuantidadeTanque() + Quantidade);
				System.out.println("Carro Abastecido, o total a pagar foi: " + Quantidade * precoGasolina);
			} else {
				System.out.println("Nao eh possivel colocar essa quantidade no tanque!");
			}
		} else {
			System.out.println("Nao eh possivel abastecer com o carro andando");
		}
	}

	@Override
	public void TrocarPneu() {
		if (isStatus()) {
			setStatus(false);
			System.out.println("Carro desligado para trocar pneu!");
		}

		setKmPneus(0);
		System.out.println("Pneus trocados");
	}

	@Override
	public void Acelerar() {
		if (getVelocidade() < getVelocidadeMaxima() && getQuantidadeTanque() > 10 && isStatus()) {
			setVelocidade(getVelocidade() + 15);
			setQuantidadeTanque(getQuantidadeTanque() - (getConsumoKm() * 5));
			setKmPneus(getKmPneus() + 5);
			setKmRodados(getKmRodados() + 5);
			System.out.println("Acelerando!");
		} else {
			System.out.println("Nao foi possivel acelerar!");
		}
	}

	@Override
	public void ChecarPneu() {
		System.out.println("Os pneus estao com: " + getKmPneus());
	}

	@Override
	public void Freiar() {
		if (getVelocidade() > 0) {
			setVelocidade(getVelocidade() - 5);
			System.out.println("Freio!");
		} else {
			System.out.println("Nao foi possivel freiar!");
		}
	}

	@Override
	public void FreiadaBusca() {
		if (getVelocidade() > 0) {
			setVelocidade(0);
			System.out.println("Freiada brusca!");
		} else {
			System.out.println("Nao foi possivel freiar!");
		}
	}

	public double getPrecoGasolina() {
		return precoGasolina;
	}

	public void setPrecoGasolina(double precoGasolina) {
		this.precoGasolina = precoGasolina;
	}

}
