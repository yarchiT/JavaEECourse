import java.util.List;

public class Coach implements Sportsman {

    private List<Sportsman> sportsmen;
    public Coach(){}

    public void setSportsmen(List<Sportsman> sportsmen){
        this.sportsmen = sportsmen;
    }

    @Override
    public void prepare() {
        System.out.println("Daaamn! I need to train those nerds:\n");
        for (Sportsman sportsman: sportsmen) {
            sportsman.prepare();
            System.out.println("");
        }
    }
}
