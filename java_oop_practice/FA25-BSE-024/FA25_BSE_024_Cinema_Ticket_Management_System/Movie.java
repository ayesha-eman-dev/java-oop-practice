public class Movie {
    String title;
    String genre;
    int duration;
    String showTime;
    public Movie(String title,String genre,int duration,String showTime){
    this.title=title;
    this.genre=genre;
    this.duration=duration;
    this.showTime=showTime;
    }


    public String toString (){
        return String.format("%s %s %d %s",title,genre,duration,showTime);
    }
}
enum ScreenType{
    TWO_D,THREE_D,IMAX}

