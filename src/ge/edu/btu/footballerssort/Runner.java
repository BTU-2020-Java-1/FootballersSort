package ge.edu.btu.footballerssort;

import ge.edu.btu.footballerssort.footballer.Footballer;
import ge.edu.btu.footballerssort.league.FootballersSortType;
import ge.edu.btu.footballerssort.league.League;

import java.util.List;

public class Runner {

    private static Footballer footballer1 = new Footballer("Footballer 1", 10);
    private static Footballer footballer2 = new Footballer("Footballer 2", 1);
    private static Footballer footballer3 = new Footballer("Footballer 3", 7);
    private static Footballer footballer4 = new Footballer("Footballer 4", 11);
    private static Footballer footballer5 = new Footballer("Footballer 5", 99);
    private static Footballer footballer6 = new Footballer("Footballer 6", 2);
    private static Footballer footballer7 = new Footballer("Footballer 7", 5);
    private static Footballer footballer8 = new Footballer("Footballer 8", 17);

    private static League league = new League("League");

    public static void main(String[] args) {
        addFootballersInLeague();
        increaseGoalsAndAssists();

        List<Footballer> sortedBytNumbers = league.getSortedFootballers(FootballersSortType.BY_NUMBER);
        System.out.println("ნომრებით დალაგებულილი:");
        printFootballersList(sortedBytNumbers);

        List<Footballer> sortedByGoals = league.getSortedFootballers(FootballersSortType.BY_GOALS);
        System.out.println("გოლებით დალაგებულილი:");
        printFootballersList(sortedByGoals);

        List<Footballer> sortedByAssists = league.getSortedFootballers(FootballersSortType.BY_ASSISTS);
        System.out.println("გადაცემებით დალაგებულილი:");
        printFootballersList(sortedByAssists);
    }

    private static void printFootballersList(List<Footballer> footballers) {
        for (Footballer footballer : footballers) {
            System.out.println(footballer);
        }
    }

    private static void addFootballersInLeague() {
        league.addFootballer(footballer1);
        league.addFootballer(footballer2);
        league.addFootballer(footballer3);
        league.addFootballer(footballer4);
        league.addFootballer(footballer5);
        league.addFootballer(footballer6);
        league.addFootballer(footballer7);
        league.addFootballer(footballer8);
    }

    private static void increaseGoalsAndAssists() {
        footballer6.increaseAssists();
        footballer2.increaseGoals();
        footballer3.increaseAssists();
        footballer4.increaseGoals();
        footballer7.increaseAssists();
        footballer1.increaseGoals();
        footballer5.increaseAssists();
        footballer7.increaseAssists();
        footballer5.increaseGoals();
        footballer6.increaseAssists();
        footballer5.increaseAssists();
        footballer1.increaseAssists();
        footballer5.increaseGoals();
        footballer7.increaseGoals();
        footballer8.increaseAssists();
        footballer8.increaseGoals();
        footballer6.increaseAssists();
        footballer8.increaseAssists();
    }
}
