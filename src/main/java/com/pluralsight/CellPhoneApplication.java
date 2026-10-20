package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder outputContainer = new StringBuilder();
        CellPhone myPhone = new CellPhone();

        //Set parameters
        myPhone.setSerialNumber(Long.parseLong(getInputFromConsole("What is your phone's serial number?", s, false)));
        myPhone.setModelType(getInputFromConsole("What is the phone's model type?", s, true));
        myPhone.setServiceCarrier(getInputFromConsole("Who is the service provider?", s, true));
        myPhone.setPhoneNumber(getInputFromConsole("What is the phone number?", s, true));
        myPhone.setOwnerName(getInputFromConsole("Who is the owner of the phone?", s, true));

        //Get parameters and print
        outputContainer.append("Serial number: ").append(myPhone.getSerialNumber()).append("\n")
                       .append("Model type: ").append(myPhone.getModelType()).append("\n")
                       .append("Service provider: ").append(myPhone.getServiceCarrier()).append("\n")
                       .append("Phone number: ").append(myPhone.getPhoneNumber()).append("\n")
                       .append("Owner name: ").append(myPhone.getOwnerName()).append("\n");

        System.out.println(outputContainer);
    }

    public static String getInputFromConsole(String display, Scanner s, boolean clearBuffer) {
        if (clearBuffer) s.skip("\n");
        System.out.println(display);
        return s.nextLine().trim();
    }
}
