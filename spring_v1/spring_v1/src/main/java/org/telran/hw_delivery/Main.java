package org.telran.hw_delivery;

/**
 * Create a DeliveryDetailsPrinter object to print the parcel details and handle the delivery application.
 * This information should be sorted by destination address. Develop an appropriate class.
 */

public class Main {
    public static void main(String[] args) {
        DeliveryDetailsPrinter printer1 = new DeliveryDetailsPrinter(new SortedByAddress());
        printer1.printDetails();

        DeliveryDetailsPrinter printer2 = new DeliveryDetailsPrinter(new SorterByName());
        printer2.printDetails();
    }
}
