package com.codeandapps.creationals.prototype;

public class Client {

    public static void main(String[] args) {
        Chip chipIntel = new Chip("Intel i7");
        Robbot rob1 = new Robbot("Rob1", chipIntel);

        // Soft clone
        Robbot rob2 = rob1.cloneSoft();

        System.out.println("Soft Clone: Robo 2 " + rob2.toString());
        chipIntel.model = "Intel i9";
        //change the chip model of the original Robbot
        System.out.println("Soft Clone: Robo 2 " + rob2.toString());

        // Deep clone
        Robbot rob3 = rob1.cloneDeep();
        System.out.println("Deep Clone: robo 3 " + rob3);

        // Modify the chip of the original Robbot
        chipIntel.model = "AMD Ryzen 9";

        System.out.println("After modifying the original chip:");
        System.out.println("Original: " + rob1);
    }
}
