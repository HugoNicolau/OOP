public class ContaBancaria {
    private double saldo;
    private final Pessoa titular;

    public ContaBancaria(Pessoa titular) {
        this.saldo = 0.0;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public Pessoa getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado na conta de " + titular.getNome() + ".");
            System.out.println("Novo saldo: R$" + this.saldo + ".");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && valor < this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta de " + titular.getNome() + ".");
            System.out.println("Novo saldo: R$" + this.saldo + ".");
        } else if (valor <= 0) {
            System.out.println("Valor inválido de saque.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: R$" + this.saldo);
    }

    public void exibirInformacoesConta() {
        System.out.println("--- Informações ---");
        System.out.println("Titular:");
        titular.exibirInformacoes();
        System.out.println("Saldo R$: " + saldo);
        System.out.println("---------------------");
    }

}
