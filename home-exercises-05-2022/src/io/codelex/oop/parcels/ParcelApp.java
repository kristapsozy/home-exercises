package io.codelex.oop.parcels;

public class ParcelApp {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(31, 44, 33, 14.3f, true);
        Parcel parcel2 = new Parcel(29, 44, 33, 14.3f, true);
        Parcel parcel3 = new Parcel(29, 44, 33, 33f, false);

        System.out.println(parcel.validate());
        System.out.println(parcel2.validate());
        System.out.println(parcel3.validate());

    }
}
