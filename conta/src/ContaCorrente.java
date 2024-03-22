public class ContaCorrente {

    private double saldo;
    private int nmrConta;
    private String nomeTitular;

    public ContaCorrente(int nmrConta, String nomeTitular) {
        this.saldo = 0.0;
        this.nmrConta = nmrConta;
        this.nomeTitular = nomeTitular;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("deposito feito");
        } else {
            System.out.println("deposito invalido");
        }
    }

    public boolean saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("saque feito");
            return true;
        } else {
            System.out.println("saque invalido");
            return false;
        }
    }

    public double verificarSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return nmrConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void saldo() {
        System.out.println("saldo atual R$:" + saldo);

        deposito(500.0);
        System.out.println("saldo atual R$:" + saldo);

        saque(200.0);
        System.out.println("saldo atual R$:" + saldo);

        saque(400.0);
    }
}
