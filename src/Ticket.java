public class Ticket {

    private int ticketId;
    private String passengerName;
    private int flightDate;
    private String arrivalAirportId;
    private String departureAirportId;
    private String flightId;
    private Float ticketCost;
    private Float discount;
    private String ticketBasis;
    private static int id=0;
    private Customer cst;
// +loyaltyPointsAdded

// The following constructor takes the object "cst" so that the string "passengerName" gets the name of the object customer
    public Ticket(int ticketId, Customer cst, int flightDate, String arrivalAirportId, String departureAirportId, String flightId, Float ticketCost, Float discount, String ticketBasis){

        id=id+1;
//       Here the method getPassengerName() gets the name of the object Customer
        this.passengerName=cst.getPassengerName();
        this.ticketId=id;
        this.flightDate=flightDate;
        this.arrivalAirportId=arrivalAirportId;
        this.departureAirportId=departureAirportId;
        this.flightId=flightId;
        this.ticketCost=ticketCost;
        this.discount=discount;
        this.ticketBasis=ticketBasis;
        this.cst=cst;;
    }

    public void getValues(){
        System.out.println("Ticket id is: "+ticketId);
        System.out.println("Passenger name is: "+passengerName);
        System.out.println("Flight date is: "+flightDate);
        System.out.println("Arrival Airport is: "+arrivalAirportId);
        System.out.println("Departure Airport is: "+departureAirportId);
        System.out.println("Flight Id is: "+flightId);
        System.out.println("Ticket Cost is: "+ticketCost);
        System.out.println("discount is: "+discount);
        System.out.println("ticketBasis is: "+ticketBasis);
        System.out.println("The customer that owns the ticket is the following:");
        cst.getValues();
        System.out.println();
    }
}
