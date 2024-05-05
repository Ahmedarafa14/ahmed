package org.example;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        employee1 Employee = new employee1();
        System.out.println("if you an employee enter 1");
        //sign in give me your id,name
        //  create class called ticket
        // new user (id,name) , user has array of ticket
        //make static flight company
        // to book ticket press 1
        // create ticket
        // show company name,date,arrival place , ticket class store all thisxin ticket
        // ticket.setCompany name , ticket.setdate,ticket.set arrival place
        // user.tickets.add(object of ticket)
        //show all ticket information , you succefully book and the inforamtion is name,id, ticket.getcompany name,....

        //to cancel ticket enter your id
        //show array of tickets enter id of the ticket you want to delete
        // remove the ticket from array



        System.out.println("for booking or cancelling tickets press 2");

         int f = scanner.nextInt();
           if (f==1) {
               Employee.addEmployee();
               System.out.println("if you you print data enter 1");
               Employee.toString();
           }
//

           else if (f==2) {



                 User u10 = new User();
                 System.out.println("Provide needed information to continue");


                 System.out.print(" id: ");
                 u10.setId(scanner.nextDouble());
                 System.out.print("name:");
                 u10.setName(scanner.next());

             }

                   flightCompany f1=new flightCompany(55,"EGYPTAIR");
                   flightCompany f2=new flightCompany(56,"Emirates");
                   flightCompany f3=new flightCompany(57,"Qater Airways");
                   flightCompany f4=new flightCompany(59,"Turkish Airline");
                   System.out.println("if you want EGYPTAIR press 1");
                   System.out.println("if you want Emirates press 2");
                   System.out.println("if you want Qater Airways press 3");
                   System.out.println("if you want Turkish Airline press 4");
        int Z=scanner.nextInt();

        switch (Z) {
                       case 1:
                           System.out.println(f1.getFlightCompanyName());////////////////////////
                           break;
                       case 2:
                           System.out.println("f2.getflightCompanyName()");
                           break;
                       case 3:
                           System.out.println("f3.getflightCompanyName()");


                           // Addq more cases as needed
                       case 4:
                           System.out.println("f4.getflightCompanyName()");
                       default:
                           System.out.println("Invalid number");}
                       Flight x1=new Flight();
                   System.out.println("Date");
                   x1.setDate(scanner.next());
                   System.out.println("departureHour");
                           x1.setDepartureHour(scanner.nextInt());
                   System.out.println("departureAirport");
               x1.setDepartureAirport(scanner.next());
                   System.out.println("arrivalAirport");
                   x1.setArrivalAirport(scanner.next());
                   System.out.println("Provide below required information to continue booking ");
                   double p,j,g;
                   String I="Istanpulairline";
                   String D="Dubai Internation Airport";
                   String R="Riyadh Internation Airport";
                   p=x1.getDepartureAirport().compareTo(I);
                   j=x1.getDepartureAirport().compareTo(D);
                   g=x1.getDepartureAirport().compareTo(R);
                 if (p==0){
                     Flight s2=new Flight();
                     System.out.println("coming trips to turkey:");
                     System.out.println("date: 9/5/2024 of hour:7:00am arrives at 12:00pm");

                     System.out.println("date: 7/5/2024 of hour:10:00pm arrives at 2:00pm");
                     System.out.println("date: 9/5/2024 of hour:5:00pm arrives at 10:00pm");
                     System.out.println("please enter Depature houre");

                     s2.setDepartureHour(scanner.nextInt());
                     System.out.println("please enter suitable date ");

                     s2.setDate(scanner.next());

                     BookingAgent b1=new BookingAgent();
                     b1.bookTicket(scanner);

                     System.out.println(s2.toString());

                 }
                 else if
                   (j==0){
                       Flight s3=new Flight();
                        System.out.println("coming trips to dubai:");
                         System.out.println("date: 9/5/2024 of hour:7:00am arrives at 11:00am ");

                     System.out.println("date: 7/5/2024 of hour:10:00am arrives at 2:00pm ");
                     System.out.println("date: 9/5/2024 of hour:5:00pm arrives at 9:00pm");
                     System.out.println("please enter suitable date");
                     s3.setDepartureHour(scanner.nextInt());
                     s3.setDate(scanner.nextLine());

                 }
                     else if (g==0) {
                     Flight s4=new Flight();
                     System.out.println("coming trips to Rayiad:");
                     System.out.println("date: 9/5/2024 of hour:7:00am arrives at 10:00am");

                     System.out.println("date: 7/5/2024 of hour:10:00am arrives at 1:00pm ");
                     System.out.println("date: 9/5/2024 of hour:5:00pm arrives at 8:00pm ");
                     System.out.println("please enter suitable date");
                     s4.setDepartureHour(scanner.nextInt());
                     s4.setDate(scanner.nextLine());

                 }
                 else {
                      System.out.println("No trips found");

                  }

                                }



               }


       // int emoloyee1 = scanner.nextInt();
   /*     AboutTheAirport Id=new AboutTheAirport();
        Id.toString();
          Employee.addEmployee();
          Employee.toString();
              System.out.println("the first name is " + Employee.getName());

                System.out.println("The last name is " + Employee.getLastName());

                System.out.println("The Age is " + Employee.getAge());

                System.out.println("The gander is " + Employee.getGender());
                System.out.println("The phone number is " + Employee.getPhone());
                System.out.println("The phone address is " + Employee.getAddress());
                System.out.println("your Nationality" + Employee.getNationality());
                System.out.println("your Region" + Employee.getReligion());
                System.out.println("enter the Education");

*/
//
//                }1











