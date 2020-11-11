package ge.edu.btu.footballerssort.league;

import ge.edu.btu.footballerssort.footballer.Footballer;
import ge.edu.btu.footballerssort.comparators.CompareByGoalsDesc;
import ge.edu.btu.footballerssort.comparators.CompareByNumberAsc;
import ge.edu.btu.footballerssort.comparators.CompareBytAssistsDesc;

import java.util.ArrayList;
import java.util.List;

public class League implements ILeague {

    private String name;

    private List<Footballer> footballers = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    @Override
    public void addFootballer(Footballer footballer) {
        footballers.add(footballer);
    }

    @Override
    public List<Footballer> getSortedFootballers(FootballersSortType type) {
        List<Footballer> tmpFootballers = new ArrayList<>(footballers);
        switch (type) {
            case BY_NUMBER:
                tmpFootballers.sort(new CompareByNumberAsc());
                break;
            case BY_GOALS:
                tmpFootballers.sort(new CompareByGoalsDesc());
                break;
            case BY_ASSISTS:
                tmpFootballers.sort(new CompareBytAssistsDesc());
                break;
        }
        return tmpFootballers;
    }
}
