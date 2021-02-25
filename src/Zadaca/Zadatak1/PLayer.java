package Zadaca.Zadatak1;

public class PLayer {

    private int id;
    private String name;
    private int score;

    public PLayer(){

    }

    public PLayer(String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public PLayer setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PLayer setName(String name) {
        this.name = name;
        return this;
    }

    public int getScore() {
        return score;
    }

    public PLayer setScore(int score) {
        this.score = score;
        return this;
    }

    @Override
    public String toString() {
        return "PLayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    /*@Override
    public int compareTo(PLayer o) {
        return name.compareTo(o.getName());
    }*/
}
