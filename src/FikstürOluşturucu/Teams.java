package FikstürOluşturucu;


import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Teams {
    public void start() {
        Scanner input = new Scanner(System.in);
        //Fikstüre katılacak takım sayısı girilir.
        System.out.println("Fikstürde kaç takım yer alacak giriniz:  ");
        int teamCount = input.nextInt();
        input.nextLine();

        ArrayList<String> teamNames = new ArrayList<>();//Takım isimlerinin tutulacağı liste.

        //Alınan takım isimkeri listeye eklenir.
        for (int i = 1; i <= teamCount; i++) {
            System.out.println("Fikstüre katılcak " + (i) + " .takım ismini giriniz: ");
            String teamName = input.nextLine();
            teamNames.add(teamName);
        }
        //Girilen takımlar.
        System.out.println("Girdiğiniz takımlar: ");
        for (String name : teamNames) {
            System.out.println(name);
        }

        if (teamCount % 2 != 0) {//Takım sayısı tekse takım listesine Bay takımını ekle.
            teamNames.add("Bay");
            teamCount++;
        }

        int numRounds = (teamCount - 1);//İki devreli lig
        int numMatchesRound = teamCount / 2;

        ArrayList<ArrayList<String>> firstHalfFixtures = new ArrayList<>();
        ArrayList<ArrayList<String>> secondHalfFixtures = new ArrayList<>();

        //İlk yarı eşleşmesi.
        for (int round = 0; round < numRounds; round++) {
            ArrayList<String> matches = new ArrayList<>();
            for (int i = 0; i < numMatchesRound; i++) {
                int homeIndex = (round + i) % (teamCount - 1);
                int awayIndex = (teamCount - 1 - i + round) % (teamCount - 1);

                if (i == 0) {//son takım sabit kalır ve döndürülmez.
                    awayIndex = teamCount - 1;
                }

                String home = teamNames.get(homeIndex);
                String away = teamNames.get(awayIndex);

                matches.add(home + " vs " + away);
            }
            firstHalfFixtures.add(matches);
            //İkinci yarı eşleşmesi.
            ArrayList<String> secondHalfMatches = new ArrayList<>();
            for (String match : matches) {
                String[] teams = match.split(" vs ");
                secondHalfMatches.add(teams[1] + " vs " + teams[0]);
            }
            secondHalfFixtures.add(secondHalfMatches);

        }
        //İlk yarıyı yazdırır.
        for (int round = 0; round < numRounds; round++) {
            System.out.println("Round " + (round + 1));
            for (String match : firstHalfFixtures.get(round)) {
                System.out.println(match);
            }
            System.out.println();
        }
        //İkinci yarıyı yazdırır.
        for (int round = 0; round < numRounds; round++) {
            System.out.println("Round " + (round + 1 + numRounds));
            for (String match : secondHalfFixtures.get(round)) {
                System.out.println(match);
            }
            System.out.println();
        }
        input.close();


    }
}