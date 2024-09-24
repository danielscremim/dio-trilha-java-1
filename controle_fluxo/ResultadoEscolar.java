package controle_fluxo;

public class ResultadoEscolar {
    public static void main(String[] args) {
/* parte do código para explicar condicionais compostas */
    //     int nota = 9;

    //     if (nota >= 7)
    //     System.out.println("Aprovado");

    //     else
    //     System.out.println("Reprovado");
    // }

/* Parte do código para explicar condicionais encadeadas */
    // int nota = 9;

    //     if (nota >= 7)
    //     System.out.println("Aprovado");

    //     else if (nota >= 5 && nota < 7)
    //     System.out.println("Prova de recuperação");

    //     else
    //     System.out.println("Reprovado");
    // 
    int nota = 9;
    String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

    System.out.println(resultado);
    // outro exemplo abaixo
    //System.out.println("O aluno " + (nota >= 7 ? "Aprovado" : "Reprovado"));
    }
}
