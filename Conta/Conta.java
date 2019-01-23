package Conta;

class Conta {
	private String Nome_cliente;
	private int Num_conta;
	private int Agencia;
	private int senha;
	private long Telefone;
	private double Saldo;
	
	public String getNome_cliente() {
		return Nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		Nome_cliente = nome_cliente;
	}

	public int getNum_conta() {
		return Num_conta;
	}

	public void setNum_conta(int num_conta) {
		Num_conta = num_conta;
	}

	public int getAgencia() {
		return Agencia;
	}

	public void setAgencia(int agencia) {
		Agencia = agencia;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public long getTelefone() {
		return Telefone;
	}

	public void setTelefone(long telefone) {
		Telefone = telefone;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public Conta(String nome_cliente, int numero, int agencia, int senha, long telefone, double deposito){
		setNome_cliente(nome_cliente);
		setNum_conta(numero);
		setAgencia(agencia);
		setSenha(senha);
		setTelefone(telefone);
		setSaldo(deposito);
		if (deposito<=0)
			throw new RuntimeException("Erro");
	}
	
	public void alterar_senha(int senha){
		if (getSenha()!=senha)
			setSenha(senha);
	}
	
	void sacar(double valor) {
		if (valor<=this.Saldo)
			setSaldo(this.Saldo-valor);
	}
	double depositar(float valor) {
		this.Saldo+=valor;
		return this.Saldo;
	}
}