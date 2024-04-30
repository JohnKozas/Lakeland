import java.awt.print.Book;

public class mainApp {
    public static void main(String[] args) {

        Ticket_Agent TicketAgent1 = new Ticket_Agent("Ticket Agent", "Bob", 693447772, "Bob@gmail.com", "Helpdesk");
        Ticket_Agent TicketAgent2 = new Ticket_Agent("Ticket Agent", "Martha", 693447772, "Martha@gmail.com", "Ticket Agent Manager");

        Reservation rs1 = TicketAgent1.makeReservation(2,3,4,5,6);
        Reservation rs2 = TicketAgent1.makeReservation(3,4,5,66,99);

        Booking bk1 = TicketAgent1.makeBooking(10, 32, 59, 34);
        Booking bk2 = TicketAgent1.makeBooking(11, 33, 54, 31);

        Customer cst1 = new Customer("Jack", "Jack@gmail.com", 693734788, "FFCN");
        Customer cst2 = new Customer("Nick", "Nick@gmail.com", 693934788, "ECN");
        Customer cst3 = new Customer("Josh", "Josh@gmail.com", 693847556, "FFCN");
//      Issuing tickets using Ticket_Agent's method "issueTicket"
        Ticket tk1 = TicketAgent2.issueTicket(34, cst3, 20240421, "Amsterdam", "Thessaloniki", "AMS0233", 140.4F, 10.2F, "YPA14");
        Ticket tk2 = TicketAgent1.issueTicket(36, cst2, 20240411, "Sofia", "Bristol", "SOF01115", 88.4F, 9.3F, "YPA7");
        Ticket tk3 = TicketAgent2.issueTicket(21, cst1, 20240421, "Rome", "London", "ROM0244", 81.4F, 9.3F, "YPA7");
//        bk1.getValues();
//        TicketAgent4.getValues();
//        rs2.getValues();
//        bk2.getValues();
        tk1.getValues();
        tk2.getValues();
        tk3.getValues();
//        cst2.getValues();
//        cst2.checkIn();
//        cst1.payment();
        System.out.println("Ticket agent 1 has done the following: "+TicketAgent1.Work);
        //      With this method we get how many employees has been instantiated
        Employee.Employees();
        
        System.out.println("Number of customers is: "+Customer.Numberofcustomers);

    }
}
