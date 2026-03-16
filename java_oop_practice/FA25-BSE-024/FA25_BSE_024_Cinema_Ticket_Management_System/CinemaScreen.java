public class CinemaScreen {
    String name;
    String id;
    Movie movie;
    ScreenType type;
    Seat [][]seats;
    char rowName='A';
    public CinemaScreen(String name, String id, ScreenType type, Movie movie) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.movie=movie;
        seats = new Seat[5][];
        seats[0] = new Seat[10];
        seats[1] = new Seat[11];
        seats[2] = new Seat[12];
        seats[3] = new Seat[15];
        seats[4] = new Seat[16];
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                SeatType seatType;
                if (i <= 1)
                    seatType = SeatType.Regular;
                else if (i == 2 || i == 3)
                    seatType = SeatType.Premium;
                else
                    seatType = SeatType.VIP;
                seats[i][j] = new Seat(seatType, "" + rowName);
            }
            rowName++;
        }
    }

    public String toString () {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nScreen: ").append(name)
                .append(" Type: ").append(type)
                .append("\nMovie: ").append(movie)
                .append("\nSeats:\n");
        for(int i = 0; i < seats.length; i++) {
            stringBuilder.append("\n");
            for (int j = 0; j < seats[i].length; j++) {
                stringBuilder.append(seats[i][j]).append(" | ");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
