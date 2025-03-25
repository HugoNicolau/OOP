class Fisica extends Pessoa {
    private String cpf;

    public Fisica(String nome, String email, String cpf) {
        super(nome, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("CPF: " + cpf);
    }
}