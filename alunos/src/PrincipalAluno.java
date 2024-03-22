public class PrincipalAluno {

    public static void main(String[] args) {

        aluno aluno1 = new aluno("leo ponchio", 123);
        aluno1.setNotas(new double[]{8.5, 8.0, 9.0});

        aluno aluno2 = new aluno("gilberto", 1234);
        aluno2.setNotas(new double[]{3.0, 5.5, 00.0});

        aluno aluno3 = new aluno("joão pedro", 12345);
        aluno3.setNotas(new double[]{5.0, 6.0, 6.0});


        aluno1.infoAlunos();
        aluno2.infoAlunos();
        aluno3.infoAlunos();
    }
}
