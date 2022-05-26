package dz7;

import java.util.Arrays;
import java.util.Random;

public class RugbyTeams {
    public static void main(String[] args) {
        int countOfPlayers = 25;
        int minAge = 18;
        int maxAge = 40;
        teamOutput(countOfPlayers, minAge, maxAge, "first team");
        teamOutput(countOfPlayers, minAge, maxAge, "second team");

    }

    private static void teamOutput(int countOfPlayers, int minAge, int maxAge, String teamName) {
        int[] arrayTeam = createTeam(minAge, maxAge, countOfPlayers);
        System.out.println("Players age of " + teamName +": "+ Arrays.toString(arrayTeam));
        middleTeamAge(teamName, arrayTeam);
    }

    private static void middleTeamAge(String teamName, int[] arrayTeam) {
        int sum = 0;
        for (int player : arrayTeam){
            sum+=player;
        }
        int middle = sum / arrayTeam.length;
        System.out.println("Medium age of team: " + middle);
    }

    private static int[] createTeam(int minAge, int maxAge, int countOfPlayers) {
        Random random = new Random();
        int[] playersAge = new int[countOfPlayers];
        for (int i = 0; i < playersAge.length; i++) {
            int age = minAge + random.nextInt(maxAge - minAge + 1);
            playersAge[i] = age;
        }
        return playersAge;
    }
}
