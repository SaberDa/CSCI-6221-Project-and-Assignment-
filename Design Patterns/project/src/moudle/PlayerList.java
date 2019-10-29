package moudle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerList{
    public static List<Players> playerList = new ArrayList<Players>();
    public static int sum;
    public static List<String> rules = new ArrayList<String>();


    public PlayerList() {

    }

    public static void setRule(String rule) {
        rules.add(rule);
    }

    public static String getRules() {
        String str = "";
        for (String s:rules) {
            str += s + "\t\n";
        }
        return str;
    }

    public static void printRules() {
        show(getRules());
    }

    public static boolean addPlayer(Players player) {
        show("Add a new player: " + player.toString());
        show("----------------------------------------------");
        sum++;
        return playerList.add(player);
    }

    public static void shuffleCardToPlayer() {
        for (Players player:playerList) {
            player.setPoker(CardList.getPoker());
        }
    }

    public static void showCard() {
        for (Players player:playerList) {
            show(player.showCard());
            show("----------------------------------------------");
        }
    }

    public static void showWinner() {
        Collections.sort(playerList);
        Players p = playerList.get(0);
//        show(p.showCard());
        show("The winner is ："+p.getName());
    }

    public static int size() {
        return sum;
    }

    public static void show(Object obj) {
        System.out.println(obj.toString());
    }

    public static void clear() {
        playerList.clear();
        sum = 0;
    }
}