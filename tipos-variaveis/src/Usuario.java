public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada?" + smartTv.ligada);
        System.out.println("Qual canal?" + smartTv.canal);
        System.out.println("Volume atual?" + smartTv.volume);
        System.out.println("Canal atual?" + smartTv.canal);


    
    smartTv.ligar ();
    System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

    smartTv.desligar ();
    System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

    smartTv.diminuirVolume();
    System.out.println("Volume da TV ? " + smartTv.volume);

    smartTv.mudarCanal(10);
    System.out.println("Qual canal está a TV ? " + smartTv.canal);
    }
}

