package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MovieReservationSystem {
    private int availableSeats;
    private final Lock reservationLock;

    //TODO: Initialise the constructor
    public MovieReservationSystem(int totalSeats) {
        reservationLock = new ReentrantLock();
        this.availableSeats = totalSeats;
    }

    //TODO: Implement this method and try to book numSeats number of movie tickets
    public boolean reserveSeats(int numSeats) {
        var result = false;
        //TODO: acquire the lock before starting the operation (Do not remove the try-finally block)
        try {
            reservationLock.lock();
            if (!(availableSeats < numSeats || availableSeats == 0)) {
                this.availableSeats -= numSeats;
                result = true;
            }
        } finally {
            reservationLock.unlock();
        }
        return result;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}