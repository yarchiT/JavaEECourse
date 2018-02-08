public class Footballer implements Sportsman{
    private Boots myBoots;
    private String fieldPosition = "Defender";

    public void prepare(){
        System.out.println("Yo! I'm shitty football player.\n" +
                " I play as a "+ fieldPosition);
        myBoots.wear();
    }
}
