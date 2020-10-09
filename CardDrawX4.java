package simeon;

import java.util.Random;

public class CardDrawX4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] CardType = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Qeen", "King", "Ace"};
        String[] CardSuit = {" of Spades", " of Diamonds", " of Hearts", " of Clubs"};
        Random rand = new Random();
        String[] Card = new String[4];
        for(int i = 0; i < 4; i++){
            String current;
            boolean isAvailable = true;
            do{
                int CT = rand.nextInt(13);
                int CS = rand.nextInt(4);
                current = CardType[CT] + CardSuit[CS];
                for(int j = 0; j < i; j++){
                 if(Card[j].equals(current)){
                     isAvailable = false;
                  }
                }
            }while(!isAvailable);
            Card[i] = current;

        }

        for(int i = 0; i < 4; i++){
            System.out.println(Card[i]);
        }
    }

}