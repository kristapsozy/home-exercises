package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength >= 300) {
            System.out.println("Pārsniedz atļauto izmēru");
            return false;
        } else if (xLength < 30 && yLength < 30 && zLength < 30) {
            System.out.println("Malu izmēri ir pārāk mazi");
            return false;
        } else if (isExpress == false && weight >= 30) {
            System.out.println("Pakas svars ir par lielu");
            return false;
        } else if (isExpress && weight >= 15) {
            System.out.println("Pakas svars ir par lielu");
            return false;
        }
        return true;
    }
}
