package ge.edu.btu.footballerssort.comparators;

import ge.edu.btu.footballerssort.footballer.Footballer;

import java.util.Comparator;

public class CompareByNumberAsc implements Comparator<Footballer> {

    @Override
    public int compare(Footballer o1, Footballer o2) {
        return Integer.compare(o1.getNumber(), o2.getNumber());
    }
}
