package dominios;

public abstract class Conta implements IConta {

    private static final int AGENCIA_BANCARIA = 1;
    private static int SEQUENCE = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_BANCARIA;
        this.numero = SEQUENCE++;
        this.cliente = cliente;
        this.saldo = 0; // Inicializa o saldo como zero
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println(String.format("Depósito de %.2f realizado com sucesso.", valor));
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println(String.format("Saque de %.2f realizado com sucesso.", valor));
            } else {
                System.out.println("Saldo insuficiente para efetuar o saque.");
            }
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void printInfo() {
        System.out.println(String.format("Titular: %s", this.cliente.getName()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
