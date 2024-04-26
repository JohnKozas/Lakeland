public class Booking {

            static int Id=0;
            int bookingId;
            int ticketId;
            int customerId;
            int flightId;



            public Booking(int ticketId, int customerId, int flightId){
                Id=Id+1;
                bookingId=Id;
                this.ticketId=ticketId;
                this.customerId=customerId;
                this.flightId=flightId;
            }

            public void getValues(){
                System.out.println("Booking ID is: "+bookingId);
                System.out.println("Ticket ID is: "+ticketId);
                System.out.println("Customer ID is: "+customerId);
                System.out.println("Flight ID is: "+flightId);
                System.out.println();

            }

}


