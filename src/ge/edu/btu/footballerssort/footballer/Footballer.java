package ge.edu.btu.footballerssort.footballer;

public class Footballer {

    private String name;

    private int number;

    private int goals;

    private int assists;

    public Footballer(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public void increaseGoals() {
        goals++;
    }

    public void increaseAssists() {
        assists++;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", goals=" + goals +
                ", assists=" + assists +
                '}';
    }
}
