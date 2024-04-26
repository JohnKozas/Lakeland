public class Customer {
    private String passengerName;
    private String email;
    private int phoneNumber;
    private String loyaltyScheme;
    private  int customerId;
    static int Numberofcustomers = 0;

    public Customer(String passengerName, String email, int phoneNumber, String loyaltyScheme){
        Numberofcustomers = Numberofcustomers + 1;
        customerId = Numberofcustomers;
        this.passengerName = passengerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.loyaltyScheme = loyaltyScheme;
    }

    public void getValues(){
        System.out.println(passengerName);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(loyaltyScheme);
        System.out.println(customerId);
    }
//  This method "getPassengerName" is made for the Ticket issuing process, this is called in the ticket object
    public String getPassengerName(){
        return passengerName;
    }

//    Methods of the customer, hence the actions the customer can do

    public void checkIn(){
        System.out.println("Customer "+passengerName+" check in by himself or with an employee");
    }
    public void payment(){
        System.out.println("Customer  "+passengerName+" made a payment by himself or with an employee");
    }
}
