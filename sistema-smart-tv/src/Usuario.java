public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv tv = new SmartTv();

        System.out.println("TV ligada? " + tv.isLigada());
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());

        tv.setLigada(true);

        System.out.println("TV ligada? "  + tv.isLigada());

        tv.aumentarVolume();

        System.out.println(tv.getVolume());

        tv.setVolume(15);

        System.out.println(tv.getVolume());

        tv.mudarCanal(11);

        System.out.println(tv.getCanal());
    
    }
}
