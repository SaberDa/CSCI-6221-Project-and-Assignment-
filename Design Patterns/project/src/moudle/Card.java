package moudle;

public class Card implements Comparable<Card> {
    // The number of card, from 1 to 13
    private int number;
    // The type of card: ♠-4, ♥-3, ♣-2. ♦-1
    private int type;
    // Joker
    // private int redJoker = 53;
    // private int blackJoker = 54;

    public Card() {
        super();
    }

    public Card(int number, int type) {
        if (number == 1) {
            number = 14;
        }
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + number;
        result = prime * result + type;
        return result;
    }

    public boolean isEqual(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Card other = (Card)obj;
        if (number != other.type) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Card poker) {
        // First compare the number
        if (this.number > poker.number) {
            return -1;
        } else if (this.number < poker.number) {
            return 1;
        } else {
            // If they have same number, then compare the type
            if (this.type > poker.type) {
                return -1;
            } else if (this.type < poker.type) {
                return 1;
            }
        }
        return 0;
    }

    public String toString() {
        String str = "";
        switch(this.type) {
            case 1:
                str = "Diamond";
                break;
            case 2:
                str = "Club";
                break;
            case 3:
                str = "Heart";
                break;
            case 4: 
                str = "Spade";
                break;
        }
        String num = "";
        switch(this.number) {
            case 14:
                num = "A";
                break;
            case 11:
                num = "J";
                break;
            case 12:
                num = "Q";
                break;
            case 13:
                num = "K";
                break;
        }
        return str+num;
    }

}