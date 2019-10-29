package moudle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardList extends Card{
    // Store the cards
    public static List<Card> cardList = new ArrayList<Card>(52);
    // Store the result of the deal
    public static List<ArrayList<Card>> poker;

    public static void generateCard() {
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 4; j++) {
                Card card = new Card(i, j);
                cardList.add(card);
            }
        }
    }

    public static void printCardList() {
        System.out.println("[");
        for (Card card:cardList) {
            System.out.println(card.toString() + "  ");
        }
        System.out.println("]");
    }

    public static void shuffleCard() {
        List<Card> sCard = new ArrayList<Card>(52);
        Card cCard;
        Random random = new Random();
        for (int i = 1; i <= 52; i++) {
            do {
                cCard = cardList.get(random.nextInt(52));
            } while (sCard.contains(cCard));
            sCard.add(cCard);
        }
        cardList.clear();
        cardList = sCard;
        printCardList();
    }

    public static List<ArrayList<Card>> dealCard(int playerNum, int playerCardNum) {
        try {
            if (playerNum <= 1) {
                throw new Exception("There are must at least 2 players");
            }
            if (playerNum * playerCardNum > 52) {
                throw new Exception("The number of cards exceeds the number of cards");
            }

             // Store player's cards
             poker = new ArrayList<ArrayList<Card>>(playerNum);

             // Generate a list of cards of one player
             for (int i = 0; i < playerNum; i++) {
                 ArrayList<Card> playerCardList = new ArrayList<Card>(playerCardNum);
                 poker.add(playerCardList);
             }
             // Dealing with each player
             for (int i = 0; i < playerCardNum; i++) {
                 for (int j = 0; j < playerNum; j++) {
                     ArrayList<Card> playerCardList = poker.get(j);
                     Card card = getCard();
                     playerCardList.add(card);
                 }
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return poker;
    }

    // Deal a card
    public static Card getCard() {
        return cardList.remove(0);
    }

    // Get a player's card
    public static ArrayList<Card> getPoker() {
        return poker.remove(0);
    }

    public static void clear() {
        cardList.clear();
        poker.clear();
        printCardList();
    }
}