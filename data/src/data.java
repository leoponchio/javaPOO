import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        new data();
    }

    private int dia;
    private String mes;
    private int ano;

    public data() {
        Scanner ler = new Scanner(System.in);

        System.out.print("digite o dia: ");
        dia = ler.nextInt();

        ler.nextLine();

        System.out.print("digite o mês: ");
        mes = ler.nextLine();

        System.out.print("digite o ano: ");
        ano = ler.nextInt();

        if (!isValid()) {
            throw new IllegalArgumentException("data indisponivel");
        }

        System.out.println("data: " + this);
    }

    public void setDia(int dia) {
        this.dia = dia;
        if (!isValid()) {
            throw new IllegalArgumentException("data indisponivel");
        }
    }
    public int getDia() {
        return dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
        if (!isValid()) {
            throw new IllegalArgumentException("data indisponivel");
        }
    }
    public String getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
        if (!isValid()) {
            throw  new IllegalArgumentException("data indisponivel");
        }
    }
    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    private boolean isValid() {
        if (dia < 1 || dia > 31) {
            return false;
        }

        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        boolean mesValido = false;
        for (String m : meses) {
            if (m.equalsIgnoreCase(mes)) {
                mesValido = true;
                break;
            }
        }
        if (!mesValido) {
            return false;
        }

        if (ano < 0) {
            return false;
        }

        if ((mes.equalsIgnoreCase("abril") || mes.equalsIgnoreCase("junho") ||
                mes.equalsIgnoreCase("setembro") || mes.equalsIgnoreCase("novembro")) && dia > 30) {
            return false;
        }

        if (mes.equalsIgnoreCase("fevereiro")) {
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                if (dia > 29) {
                    return false;
                }
            } else {
                if (dia > 28) {
                    return false;
                }
            }
        }

        return true;
    }
}
