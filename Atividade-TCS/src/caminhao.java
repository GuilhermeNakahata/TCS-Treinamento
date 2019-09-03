
public class caminhao extends veiculo {
	private int capacidadeCarroceria;
	private boolean carregado;
	double precoGasolina = 4.48;

	@Override
	public void Velocimetro() {
		System.out.println("-------------------------------------------");
		System.out.println("\n Velocidade: " + getVelocidade() + "\n Consumo por km: " + getConsumoKm()
				+ "\n Quantidade de pneus: " + getQtdPneus() + "\n Ano: " + getAno() + "\n Km rodados: "
				+ getKmRodados() + "\n Placa: " + getPlaca() + "\n Cor: " + getCor() + "\n Capacidade Carroceria: "
				+ getCapacidadeCarroceria() + "\n Capacidade Tanque: " + getCapacidadeTanque() + "\n Km dos pneus: "
				+ getKmPneus() + "\n Velocidade Maxima: " + getVelocidadeMaxima() + "\n Carregado: " + isCarregado()
				+ "\n QuantidadeTanque: " + getQuantidadeTanque());
		System.out.println("-------------------------------------------");
	}

	public caminhao(int consumoKm, int qtdPneus, int ano, int kmRodados, String placa, String cor,
			int capacidadeCarroceria, double capacidadeTanque, double quantidadeTanque, double kmPneus,
			double velocidadeMaxima) {
		super(consumoKm, qtdPneus, ano, kmRodados, placa, cor, capacidadeTanque, quantidadeTanque, kmPneus,
				velocidadeMaxima);
		this.capacidadeCarroceria = capacidadeCarroceria;
		this.carregado = false;
	}

	@Override
	public void Ligar() {
		if (isStatus()) {
			System.out.println("Caminhao ja esta ligado!");
		} else {
			setStatus(true);
			System.out.println("Caminhao ligado!");
		}
	}

	@Override
	public void Desligar() {
		if (isStatus()) {
			setStatus(false);
			System.out.println("Caminhao desligado!");
		} else {
			System.out.println("Caminhao ja esta desligado!");
		}

	}

	@Override
	public void Abastecer() {
		if (getVelocidade() == 0) {
			if (isStatus()) {
				setStatus(false);
				System.out.println("Caminhao foi desligado para Abastecer!");
			}
			double capacidadeAnterior = getQuantidadeTanque();
			while (getCapacidadeTanque() > getQuantidadeTanque()) {
				setQuantidadeTanque(getQuantidadeTanque() + 1);
				System.out.println("Abastecendo: " + getQuantidadeTanque());
			}

			System.out.println("Caminhao Abastecido, o total a pagar foi: "
					+ ((getCapacidadeTanque() - capacidadeAnterior) * precoGasolina));
		} else {
			System.out.println("Nao eh possivel abastecer com o caminhao andando");
		}
	}

	@Override
	public void Abastecer(int Quantidade) {
		if (getVelocidade() == 0) {
			if (isStatus()) {
				setStatus(false);
				System.out.println("Caminhao foi desligado para Abastecer!");
			}
			if (Quantidade < getQuantidadeTanque()) {
				setQuantidadeTanque(getQuantidadeTanque() + Quantidade);
				System.out.println("Caminhao Abastecido, o total a pagar foi: " + Quantidade * precoGasolina);
			} else {
				System.out.println("Nao eh possivel colocar essa quantidade no tanque!");
			}
		} else {
			System.out.println("Nao eh possivel abastecer com o caminhao andando");
		}
	}

	@Override
	public void TrocarPneu() {
		if (isStatus()) {
			setStatus(false);
			System.out.println("Caminhao desligado para trocar pneu!");
		}

		setKmPneus(0);
		System.out.println("Pneus trocados");
	}

	@Override
	public void Acelerar() {
		if (getVelocidade() < getVelocidadeMaxima() && getQuantidadeTanque() > 10 && isStatus()) {
			setVelocidade(getVelocidade() + 5);
			setQuantidadeTanque(getQuantidadeTanque() - getConsumoKm());
			setKmPneus(getKmPneus() + 1);
			setKmRodados(getKmRodados() + 1);
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

	public int getCapacidadeCarroceria() {
		return capacidadeCarroceria;
	}

	public void setCapacidadeCarroceria(int capacidadeCarroceria) {
		this.capacidadeCarroceria = capacidadeCarroceria;
	}

	public boolean isCarregado() {
		return carregado;
	}

	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}

	public double getPrecoGasolina() {
		return precoGasolina;
	}

	public void setPrecoGasolina(double precoGasolina) {
		this.precoGasolina = precoGasolina;
	}

	public void CarregarCaminhao(int Quantidade) {
		if (getVelocidade() == 0) {
			if (Quantidade < getCapacidadeCarroceria()) {
				setCarregado(true);
				System.out.println("Caminha carregado!");
			} else {
				System.out.println("Caminhao ja esta carregado!");
			}
		} else {
			System.out.println("Nao eh possivel carregar com o caminhao andando");
		}
	}

	public void Descarregar() {
		if (getVelocidade() == 0) {
			setCarregado(false);
			System.out.println("Caminhao descarregado!");
		} else {
			System.out.println("Nao eh possivel descarregar com o caminhao andando");
		}
	}

}
