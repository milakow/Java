package org.advancedPart.Tasks.ex9PostOffice;

import java.util.Arrays;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Packet emptyPacket = new Packet();
        Packet packet1 = new Packet("Krzysiek", "Wojtek", 1500, false);
        Packet packet2 = new Packet("Natalia", "Paweł", 2000, true);
        Packet packet3 = new Packet("Malina", "Mikołaj", 5000, true);
        System.out.println("Price of " + emptyPacket + " equals " + emptyPacket.getPriceOfPackage() + " PLN.");
        System.out.println("Price of " + packet1 + " equals " + packet1.getPriceOfPackage() + " PLN.");

        //Write a statement that will insert the first package into the third variable and replace null value. ???????????????
        //Display the package price in the third variable. ??????????

        /**
         * Display the data of the first package from the array.
         * Prepare an array of 3 packages in main
         * Fill it with packages.
         */
        Packet[] threePackets = {packet1, packet2, packet3};
        System.out.println(threePackets[0]);

        /**
         * Create an array of 100 packages.
         * Fill it with random packages
         * In a separate loop, display all drawn packages from the array (👉 for each)
         * Display the total shipping price for these packages
         */
        Random random = new Random();
        Packet[] oneHundredPackets = new Packet[100];
        for (int i = 0; i <100; i++){
            String sender = "Sender " + random.nextInt(1, 100);
            String recipient = "Recipient " + random.nextInt(1, 100);
            double weight = Math.round(random.nextDouble(1,3000));
            boolean isPriority = random.nextBoolean();
            oneHundredPackets[i] = new Packet(sender, recipient, weight, isPriority);
        }

        System.out.println("In a separate loop, display all drawn packages from the array (for each): ");
        Arrays.stream(oneHundredPackets)
                .forEach(System.out::println);

        int totalPrice = 0;
        for (Packet packet : oneHundredPackets) {
            totalPrice += packet.getPriceOfPackage();
        }
        System.out.println("Total price for all packets equals " + totalPrice + " PLN.");
    }
}

