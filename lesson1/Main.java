package hm2_1;

public class Main {
    public static void main(String[] args){

        Course c = new Course(10000,900,0.7,1.85);

        Sportsman one = new Sportsman("Александр",10500,800,0.75,1.9);
        Sportsman two = new Sportsman("Николай",12000,910,0.7,1.9);
        Sportsman three = new Sportsman("Леонид",10000,900,1,2);
        Sportsman four = new Sportsman("Павел",5000,300,1.5,3);

        Team team = new Team(one,two,three,four);
        c.doIt(team);

        team.showResults();

    }
}
