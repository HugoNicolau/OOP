public class Main {
    public static void main(String[] args) {
        Fisica pessoaFisica = new Fisica("Joao Silva", "joaosilva@gmail.com", "123.456.789-01");
        Juridica empresa = new Juridica("SoftSoft", "softsoft@empresa.com", "00.123.456/0001-78");

        System.out.println("---Informações pessoa física---");
        pessoaFisica.exibirInformacoes();

        System.out.println("\n--- Informações Pessoa Jurídica ---");
        empresa.exibirInformacoes();

        // Criando contas bancárias
        ContaBancaria contaJoao = new ContaBancaria(pessoaFisica);
        ContaBancaria contaEmpresa = new ContaBancaria(empresa);

        // Realizando operações nas contas
        System.out.println("\n--- Operações Conta João ---");
        contaJoao.depositar(500.00);
        contaJoao.sacar(100.00);
        contaJoao.exibirSaldo();
        contaJoao.sacar(600.00); // Tentativa de saque com saldo insuficiente
        contaJoao.exibirInformacoesConta();

        System.out.println("\n--- Operações Conta Empresa ---");
        contaEmpresa.depositar(1000.00);
        contaEmpresa.depositar(250.00);
        contaEmpresa.exibirSaldo();
        contaEmpresa.sacar(750.00);
        contaEmpresa.exibirInformacoesConta();
    }
    
}
