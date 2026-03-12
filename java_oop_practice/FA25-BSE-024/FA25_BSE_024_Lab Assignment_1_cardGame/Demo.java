public class Demo{
public static void main(String[] args){
Deck deck=new Deck();
deck.shuffle();
System.out.println();
String names[]={"Shahid", "Hassan", "Abu bakar"};
Game game1=new Game(names,deck);
game1.playGame(5);
}
}