
public abstract class veiculo implements funcoesVeiculos{
	private boolean status;
	private int qtdPneus;
	private int ano;
	private int kmRodados;
	private int consumoKm;
	private String placa;
	private String cor;
	private double capacidadeTanque;
	private double quantidadeTanque;
	private double kmPneus;
	private double velocidade;
	private double velocidadeMaxima;
	
	public veiculo(int consumoKm, int qtdPneus, int ano, int kmRodados, String placa, String cor, double capacidadeTanque, double quantidadeTanque, double kmPneus, double velocidadeMaxima) {
		this.status = false;
		this.velocidade = 0;
		this.kmPneus = kmPneus;
		this.consumoKm = consumoKm;
		this.qtdPneus = qtdPneus;
		this.ano = ano;
		this.kmRodados = kmRodados;
		this.placa = placa;
		this.cor = cor;
		this.capacidadeTanque = capacidadeTanque;
		this.quantidadeTanque = quantidadeTanque;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getKmPneus() {
		return kmPneus;
	}

	public void setKmPneus(double kmPneus) {
		this.kmPneus = kmPneus;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getConsumoKm() {
		return consumoKm;
	}

	public void setConsumoKm(int consumoKm) {
		this.consumoKm = consumoKm;
	}

	public int getQtdPneus() {
		return qtdPneus;
	}

	public void setQtdPneus(int qtdPneus) {
		this.qtdPneus = qtdPneus;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(int kmRodados) {
		this.kmRodados = kmRodados;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public double getQuantidadeTanque() {
		return quantidadeTanque;
	}

	public void setQuantidadeTanque(double quantidadeTanque) {
		this.quantidadeTanque = quantidadeTanque;
	}
	
}
