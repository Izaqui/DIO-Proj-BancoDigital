package dominios;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void printInfo() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.printInfo();
	}

    @Override
    public void transferir(double valor, IConta contaDestino) {
        // TODO Auto-generated method stub
        
    }
}