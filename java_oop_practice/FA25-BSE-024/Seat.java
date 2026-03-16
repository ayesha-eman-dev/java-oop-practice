public class Seat {
    String seatID;
    SeatType seatType;
    String row;
    boolean isAvailable;
    static int counter=0;
    public Seat(SeatType type, String row)
     {   seatID =row+String.format("%02d",counter++);
         this.seatType=type;
         this.row=row;
         this.isAvailable=true;
     }

    public String getSeatID() {
        return seatID;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public String getRow() {
        return row;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %f %b", seatID, seatType, row, seatType.price,isAvailable);
    }}
    enum SeatType{
         VIP(20),Premium(15),Regular(10);
         double price;
         SeatType(double price)
         {
             this.price=price;
         }}
