package app; 

public class PrimeiraClasse{
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.nome = "Amábili";
        a1.idade = 18;

        Aluno a2 = new Aluno();
        a2.nome = "Gabriel";
        a2.idade = 21;

        System.out.println("[A1]");
        System.out.println("nome =" + a1.nome);
        System.out.println("idade =" + a1.idade);

        System.out.println("[A2]");
        System.out.println("nome =" + a2.nome);
        System.out.println("idade =" + a2.idade);

        System.out.println("[CHAMADA DE MÉTODO]");
        System.out.println("A1 =" + a1.getDados());
        System.out.println("A2 =" + a2.getDados());

        Aluno a3 = new Aluno("Maria", 35);
        System.out.println("[CHAMADA DE MÉTODO]");
        System.out.println("A3 =" + a3.getDados());

        Cliente c1 = new Cliente();
        c1.setNome("Teste");
        System.out.println("[CHAMADA DE GET]");
        System.out.println(c1.getNome());
    }
}