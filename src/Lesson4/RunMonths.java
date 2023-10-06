package Lesson4;

public class RunMonths {
    public static void main(String[] args) {
        Months months;
        System.out.println(Months.April.getSeasons());
        System.out.println(Months.December.getSeasons());
    }
}


enum Months {
    January(Lesson4.Seasons.Winter),
    February(Lesson4.Seasons.Winter),
    March(Lesson4.Seasons.Spring),
    April(Lesson4.Seasons.Spring),
    May(Lesson4.Seasons.Spring),
    June(Lesson4.Seasons.Summer),
    July(Lesson4.Seasons.Summer),
    August(Lesson4.Seasons.Summer),
    September(Lesson4.Seasons.Autumn),
    October(Lesson4.Seasons.Autumn),
    November(Lesson4.Seasons.Autumn),
    December(Lesson4.Seasons.Winter);
    private final Seasons seasons;

    Months(Seasons seasons) {
        this.seasons = seasons;
    }

    public Seasons getSeasons() {
        return seasons;
    }
}