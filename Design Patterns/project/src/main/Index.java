package main;

import java.util.Scanner;
import moudle.CardList;
import moudle.Players;
import moudle.PlayerList;


public class Index extends MainApp {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        show("  ####    ###    #####    ####           ####      ###    ###    ###  #####  ");
        show(" ##      ## ##   ##  ##   ##  ##        ##        ## ##   ## #  # ##  ##     ");
        show(" ##     ##   ##  #####    ##  ##        ##  ###  ##   ##  ##  ##  ##  #####  ");
        show(" ##     #######  ##  ##   ##  ##        ##   ##  #######  ##      ##  ##     ");
        show("  ####  ##   ##  ##   ##  ####           ####    ##   ##  ##      ##  #####  ");
        show("Are you READY?");
        show("Press 1 to ENTER game");
        show("Press 0 to EXIT game");
        int isStart = scanner.nextInt();
        if (isStart == 1) {
            show("There are game rules:");
            show("We have prepared four games for you.");
            show("1. Blackjack");
            show("2. Poker");
            show("Input the number of game you want to play");
            int game = scanner.nextInt();
            switch (game) {
                case 1:
                    show("You choose the first game -- Blackjack");
                    startGame(1);
                    break;
                case 2:
                    show("You choose the second game -- Poker");
                    startGame(2);
                    break;
            }
        } else {
            show("END");
        }
    }

    public static void startGame(int gameNum) {
        show("Please input number of players");
        int players = 2;
        int cardOfPlay = 2;
        try {
            players = scanner.nextInt();
            while (players < 2) {
                show("There are AT LEAST two platers");
                show("Please input the player number again");
                players = scanner.nextInt();
            }
//
//            show("Please input the card number of each players");
//            cardOfPlay = scanner.nextInt();
//            while (cardOfPlay * players > 52) {
//                show("The total cards are out of range");
//                show("Please input the card number again");
//                cardOfPlay = scanner.nextInt();
//            }

            show("Input the player's information");
            for (int i = 0; i < players; i++) {
                show("Player " + (i+1) + "'s name is");
                String name = scanner.next();
                Players p = new Players("00"+i, name);
                PlayerList.addPlayer(p);
            }
            
            switch (gameNum) {
                case 1:
                    cardOfPlay = 2;
                    playGame(players, cardOfPlay, "You selected Blackjack");
                    break;
                case 2:
                    cardOfPlay = 5;
                    playGame(players, cardOfPlay, "You selected Poker");

                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void playGame(int players, int cardOfPlay, String message) {
        show(message);
        CardList.generateCard();
        CardList.printCardList();
        show("Let's start");
        CardList.shuffleCard();
        CardList.printCardList();
        CardList.dealCard(players, cardOfPlay);
        PlayerList.shuffleCardToPlayer();
        PlayerList.showCard();
        PlayerList.showWinner();
    }

    public static void clearGame(){
        CardList.clear();
        PlayerList.clear();
    }

    public static void show(Object obj) {
        System.out.println(obj.toString());
    }
}