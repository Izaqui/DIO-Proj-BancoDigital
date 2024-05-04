package dominios;

public interface IConta {

    /**
     * Realiza um saque na conta.
     *
     * @param valor o valor a ser sacado
     */
    void sacar(double valor);

    /**
     * Realiza um depósito na conta.
     *
     * @param valor o valor a ser depositado
     */
    void depositar(double valor);

    /**
     * Transfere um valor de uma conta para outra.
     *
     * @param valor         o valor a ser transferido
     * @param contaDestino  a conta de destino para a transferência
     */
    void transferir(double valor, IConta contaDestino);
}
