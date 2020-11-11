package ge.edu.btu.footballerssort.league;

import ge.edu.btu.footballerssort.footballer.Footballer;

import java.util.List;

public interface ILeague {

    void addFootballer(Footballer footballer);

    List<Footballer> getSortedFootballers(FootballersSortType type);
}
