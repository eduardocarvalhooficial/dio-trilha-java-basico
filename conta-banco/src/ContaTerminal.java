public class ContaTerminal {

    private int numeroConta;
    private String numeroAgencia;
    private Cliente cliente;
    private double saldoConta;

    public ContaTerminal(int numeroConta, String numeroAgencia, Cliente cliente, double saldoConta){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.cliente = cliente;
        this.saldoConta = saldoConta;
        
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    
    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

   
    public void exibirMensagemDeBoasVindas() {
        String saldoFormatado = String.format("%.2f", saldoConta);

        System.out.println("Olá " + cliente.getNome() + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " 
        + saldoFormatado + "R$ já está disponível para saque.");
    }

    
    
    
    
}
