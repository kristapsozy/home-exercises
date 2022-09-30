package io.codelex.dateandtime.practice.server;

import java.time.LocalDate;
import java.util.Scanner;

public class ServerUpdates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter server launch date in format (yyyy-mm-dd): ");
        LocalDate launchDate = LocalDate.parse(in.nextLine());
        System.out.println("Please enter year: (yyyy)");
        int year = in.nextInt();
        System.out.println("Please enter month: (mm)");
        int month = in.nextInt();
        Server server = new Server(launchDate);
        server.serverUpdatesInAskingMonth(year, month);
    }
}
