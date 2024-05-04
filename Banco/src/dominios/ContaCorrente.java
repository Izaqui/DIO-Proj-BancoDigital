package dominios;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
	public void printInfo() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.printInfo();
	}

    @Override
    public void transferir(double valor, IConta contaDestino) {
        // TODO Auto-generated method stub
        
    }
}
