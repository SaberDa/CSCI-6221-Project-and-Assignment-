package moudle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Players implements Comparable<Players> {
    private String id;
    private String name;
    private List<Card> poker;
    private Card max;

    public Players(String id, String name) {
        this.id = id;
        this.name = name;
        this.setPoker(new ArrayList<Card>());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getPoker() {
        return poker;
    }

    public void setPoker(List<Card> poker) {

        this.poker = poker;
        Collections.sort(this.poker);
        for (Card card : this.poker) {
            this.setMax(card);
            break;
        }
    }

    public void setCards(int numberOfCards, int counter){

    }

    public Card getMax() { return max;}

    public void setMax(Card max) { this.max = max; }

    public String toString() {
        return "Player's ID is " + this.id + "\t" + "Player's name is " + this.name;
    }

    public String showCard() {
        String msg = "";
        for (Card card:this.poker) {
            msg += card.toString() + " ";
        }
        return this.toString() + "\t\n" + "Player's cards are " + msg;
    }


    @Override
    public int compareTo(Players o) {
        return this.max.compareTo(o.getMax());
    }
}