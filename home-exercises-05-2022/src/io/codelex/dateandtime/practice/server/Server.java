package io.codelex.dateandtime.practice.server;

import java.time.LocalDate;
import java.time.Month;

public class Server {
    LocalDate serverCreated;
    LocalDate lastServerUpdateDate;

    public Server(LocalDate serverCreated) {
        this.serverCreated = serverCreated;
        this.lastServerUpdateDate = serverCreated;
    }

    public LocalDate getLastServerUpdateDate() {
        return lastServerUpdateDate;
    }

    public void setLastServerUpdateDate(LocalDate lastServerUpdateDate) {
        this.lastServerUpdateDate = lastServerUpdateDate;
    }

    public LocalDate getServerCreated() {
        return serverCreated;
    }

    public void setServerCreated(LocalDate serverCreated) {
        this.serverCreated = serverCreated;
    }

    public void serverUpdate() {
        lastServerUpdateDate = lastServerUpdateDate.plusDays(14);
    }

    public void serverUpdatesInAskingMonth(int year, int month) {
        Month thisMonth = LocalDate.of(year, month, 1).getMonth();
        while (lastServerUpdateDate.isBefore(LocalDate.of(year, month + 1, 1))) {
            serverUpdate();
            if (lastServerUpdateDate.getMonth().equals(thisMonth)) {
                System.out.println("Server will be updated in: " + lastServerUpdateDate);
            }
        }
    }
}
