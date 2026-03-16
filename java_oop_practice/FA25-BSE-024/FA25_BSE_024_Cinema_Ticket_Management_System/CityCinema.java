public class CityCinema {
    String cinemaName;
    CinemaScreen []screens;
    String city;
    String address;
    CityCinema(String cinemaName,int screenCount,String address,String city) {
        this.cinemaName = cinemaName;
        this.address=address;
        this.city = city;
        screens = new CinemaScreen[screenCount];
        for (int i = 0; i < screens.length; i++){
            Movie m = new Movie(" Movie " + (i + 1), " Action ", 120, " 7:00 PM ");
            screens[i] = new CinemaScreen(" cinema "+(i+1), " screen "+(i+1), ScreenType.TWO_D ,m);

    }}
    public String toString(){
        StringBuilder s1 =new StringBuilder();
        s1.append("Branch: ").append(cinemaName);
        s1.append(" City: ").append(city);
        s1.append(" Address: ").append(address);

        for (int i = 0; i < screens.length; i++)
            s1.append(screens[i].toString());
        return s1.toString();
    }
    }
