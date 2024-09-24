package controle_fluxo;

public class SistemaMedida {
    public static void main(String[] args) {
        /* Bloco de código para retornar o tamanho de etiqueta */
        // String sigla = "M";

        // if(sigla == "P")
        //     System.out.println("Pequeno");
        
        // else if(sigla == "M")
        //     System.out.println("Medio");

        // else if(sigla == "G")
        //     System.out.println("Grande");

        // else
        //     System.out.println("Tamanho desconhecido");

    /* Com Switch case */
        String sigla = "G";
        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Medio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Tamanho desconhecido");
                // default não precisa do break
        }
    }
}
