package ge.edu.btu.footballerssort.comparators;

import ge.edu.btu.footballerssort.footballer.Footballer;

import java.util.Comparator;

public class CompareByGoalsDesc implements Comparator<Footballer> {

    @Override
    public int compare(Footballer o1, Footballer o2) {
        return Integer.compare(o2.getGoals(), o1.getGoals());
    }
}
