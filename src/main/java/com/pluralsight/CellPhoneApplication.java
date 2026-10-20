package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone(987654321L, "iPhone 18", "AT&T", "646-420-6769", "John Smith");
        CellPhone phone3 = new CellPhone(111110000L, "Samsung Galaxy S25", "T-Mobile", "718-456-7890", "Mary Jane");

        //Set parameters for phone 1
        phone1.setSerialNumber(Long.parseLong(getInputFromConsole("What is your phone's serial number?", s, false)));
        phone1.setModelType(getInputFromConsole("What is the phone's model type?", s, true));
        phone1.setServiceCarrier(getInputFromConsole("Who is the service provider?", s, true));
        phone1.setPhoneNumber(getInputFromConsole("What is the phone number?", s, true));
        phone1.setOwnerName(getInputFromConsole("Who is the owner of the phone?", s, true));

        //Test display
        display(phone1);
        display(phone2);
        display(phone3);

        //Test dial
        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());
        phone3.dial(phone1);
    }

    public static void display(CellPhone phone) {
        String output = "Serial number: " + phone.getSerialNumber() + "\n" +
                "Model type: " + phone.getModelType() + "\n" +
                "Service provider: " + phone.getServiceCarrier() + "\n" +
                "Phone number: " + phone.getPhoneNumber() + "\n" +
                "Owner name: " + phone.getOwnerName() + "\n";
        System.out.println(output);
    }

    public static String getInputFromConsole(String display, Scanner s, boolean clearBuffer) {
        if (clearBuffer) s.skip("\n");
        System.out.println(display);
        return s.nextLine().trim();
    }
}
