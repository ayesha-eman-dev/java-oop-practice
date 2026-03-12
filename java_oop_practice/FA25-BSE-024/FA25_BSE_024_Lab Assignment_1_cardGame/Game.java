public class Game {

int winner=0;
 Deck deck;
Player player[];

Game(String names[], Deck deck){
this.deck=deck;
 player = new Player[names.length];
 for(int i=0;i<names.length;i++)
 player[i] = new Player(names[i]);
    }

public int getValue(Card card){
     String rank=card.getRANK();
  if(rank.equals("Ace"))
   return 14;
  if(rank.equals("King"))
   return 13;
  if(rank.equals("Queen"))
  return 12;
    if(rank.equals("Jack"))
  return 11;
  if(rank.equals("10")) 
  return 10;
   if(rank.equals("9"))
  return 9;
  if(rank.equals("8"))
  return 8;
    if(rank.equals("7"))
   return 7;
  if(rank.equals("6"))
  return 6;
   if(rank.equals("5")) 
  return 5;
    if(rank.equals("4")) 
  return 4;
    if(rank.equals("3")) 
  return 3;
return 2;
}
public void playRound() {
  for (Player p : player) {
  Card hand =  deck.drawCard() ;
  p.receiveCard(hand); 
  System.out.println(p.name + " drew: "+hand);
}
int highest=getValue(player[0].hand);
int winner=0;
for (int i=1;i<player.length;i++){
int value=getValue(player[i].hand);
if (value>highest){
  highest=value;
  winner=i;
}
}
player[winner].score++;
System.out.println("winner is: " + player[winner].name);
}

public void playGame(int rounds){
for(int i=0;i<rounds;i++){
playRound();
}

System.out.println("Final scores: ");
int maxScore;
maxScore=player[0].score;
for(Player p:player){
System.out.println(p.name+": "+p.score);
  if (p.score>maxScore)
maxScore=p.score;
}
System.out.println("Winner: ");
for(Player p:player){
if(p.score==maxScore)
System.out.println(p.name+" ");
} 
} 

 public String toString(){
 StringBuilder playersDetails = new StringBuilder();
for(int i=0;i<player.length;i++){
 playersDetails.append(player[i] + "\n");
    }
 return playersDetails.toString();
}
}
