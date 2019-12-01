package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Footballplayer Avi = new Footballplayer("Avi");
        baseballplayer Dani = new baseballplayer("Dani");
        Soccerplayer Lior = new Soccerplayer("Beckham");

        Footballplayer Amit = new Footballplayer("Amit");
        baseballplayer Elad = new baseballplayer("Elad");
        Soccerplayer Osher = new Soccerplayer("Osher");


        Team<Footballplayer> FootballMaccabiTLV = new Team<>("Maccabi Tel Aviv");
        Team<baseballplayer> BaseballBeitar = new Team<>("Beitar jerusalem");
        Team<Soccerplayer> Soccerbatyam = new Team<>("Maccabi bat yam");

        FootballMaccabiTLV.addPlayer(Avi);
        FootballMaccabiTLV.addPlayer(Amit);

        BaseballBeitar.addPlayer(Dani);
        BaseballBeitar.addPlayer(Elad);

        Soccerbatyam.addPlayer(Lior);
        Soccerbatyam.addPlayer(Osher);

        System.out.println(FootballMaccabiTLV.numPlayers());
        System.out.println(BaseballBeitar.numPlayers());
        System.out.println(Soccerbatyam.numPlayers());

        Soccerbatyam.addPlayer(Osher);

        Team<baseballplayer> BaseballHaifa = new Team<>("Maccabi Haifa");

        BaseballBeitar.matchResult(BaseballHaifa,4,3 );
        BaseballBeitar.matchResult(BaseballHaifa,2,2 );

        System.out.println(BaseballBeitar.getName() + " :" + BaseballBeitar.ranking());
        System.out.println(BaseballHaifa.getName() + " :" + BaseballHaifa.ranking());


    }
}
