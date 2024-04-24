public class Customer {
    private String passengerName;
    private String email;
    private int phoneNumber;
    private String loyaltyScheme;

    public Customer(String passengerName, String email, int phoneNumber, String loyaltyScheme){
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
    }
}
