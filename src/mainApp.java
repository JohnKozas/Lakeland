import java.awt.print.Book;

public class mainApp {
    public static void main(String[] args) {
//        Employee TicketAgent1 = new Employee("Ticket Agent", "John", 692034532, "John@gmail.com");
//        Employee TicketAgent2 = new Employee("Ticket Agent", "Maria", 696748624, "Maria@gmail.com");
//        Employee TicketAgent3 = new Employee("Sales Agent", "Takis", 697777772, "Takis@gmail.com");
//      Ticket agents are being instantiated as objects from the class Ticket_Agent
        Ticket_Agent TicketAgent4 = new Ticket_Agent("Ticket Agent", "Makis", 693447772, "Makis@gmail.com", "Helpdesk");
        Ticket_Agent TicketAgent5 = new Ticket_Agent("Ticket Agent", "Katerina", 693447772, "Katerina@gmail.com", "Ticket Agent Manager");

/*

        TicketAgent1.getValues();
        TicketAgent2.getValues();
        TicketAgent3.getValues();
        TicketAgent4.getValues();
*/
//      With this method we get how many employees has been instantiated
        Employee.Employees();

//      Issuing tickets using Ticket_Agent's method
        Ticket tk1 = TicketAgent4.issueTicket(31, "Kostas Papas", 20240423, "London", "Athens", "LON0345", 102.4F, 10.2F, "YPA14");
        Ticket tk2 = TicketAgent5.issueTicket(34, "Kiki Louda", 20240421, "Amsterdam", "Thessaloniki", "AMS0233", 140.4F, 10.2F, "YPA14");

        Reservation rs1 = TicketAgent4.makeReservation(2,3,4,5,6);

        Booking bk1 = TicketAgent4.makeBooking(10, 32, 59, 34);

        Ticket tk3 = TicketAgent4.issueTicket(36, "Fotis Migas", 20240411, "Sofia", "Bristol", "SOF01115", 88.4F, 9.3F, "YPA7");

//        rs1.getValues();
//        tk1.getValues();
//        tk2.getValues();
//
//        bk1.getValues();
        TicketAgent4.getValues();
    }
}