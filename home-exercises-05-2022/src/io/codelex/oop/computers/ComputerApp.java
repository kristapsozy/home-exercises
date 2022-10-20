package io.codelex.oop.computers;

public class ComputerApp {
    public static void main(String[] args) {
        Computer pc = new Computer("i1", "2gb",
                "NVIDIA GX67", "Asus", "A4");
        Computer pc2 = new Computer("i3", "8gb",
                "NVIDIA GX67", "Samsung", "TYO");
        Computer pc3 = new Computer("i7", "16gb",
                "NVIDIA T7", "Apple", "A1PRO");

        System.out.println(pc.getCompany() + " " + pc.model);
        System.out.println(pc2);
        System.out.println(pc.graphicCard.equals(pc2.graphicCard));

        Laptop laptop = new Laptop("i9", "12gb", "TUPO TX3",
                "Epson", "IP8032", "Lion Power");

        System.out.println(laptop.getCompany() + " " + laptop.getModel());
        System.out.println(laptop);
    }
}
