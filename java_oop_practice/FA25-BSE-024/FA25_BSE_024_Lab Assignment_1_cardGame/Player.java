class Player{
    String name;
    int score;
    Card hand;

Player(String name){
this.name = name;
this.score=0;
this.hand=null;
}

public void receiveCard(Card card){
this.hand=card;
}

 public String toString(){
        return String.format("%s %d %s", name, score, hand);
    }
}
