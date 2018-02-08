public class HockeyPlayer implements Sportsman {
    private String fieldPosition = "Defender";

    public HockeyPlayer(String position){
        this.fieldPosition = position;
    }


    @Override
    public void prepare() {
        System.out.println("Sup! \n " +
                "HOCKEY IS MY LIFE");
    }
}
