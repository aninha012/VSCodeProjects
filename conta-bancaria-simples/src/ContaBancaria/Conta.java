package ContaBancaria;

public class Conta {
    private int numConta;
    private String nomeCliente;
    private double saldo;
    private double limiteCredito;

    // Construtor
    public Conta(int numConta, String nomeCliente, double limiteCredito) {
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
        this.saldo = 0; // Inicializa o saldo como 0
        this.limiteCredito = limiteCredito;
    }

    // Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    // Método para creditar valor na conta
    public void creditar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Crédito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de crédito inválido.");
        }
    }

    // Método para debitar valor da conta
    public boolean debitar(double valor) {
        if (valor > 0 && valor <= saldo + limiteCredito) {
            saldo -= valor;
            System.out.println("Débito de R$ " + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para o débito.");
            return false;
        }
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Número da conta: " + numConta);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Limite de crédito: R$ " + limiteCredito);
        System.out.println();
    }
}
