package com.vehicles.project;

public class Plate {
    private String plate;

    public Plate(String plate) {
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    public boolean check() {
        int letras = 0;
        int numeros = 0;
        for (int i = 0, len = plate.length(); i < len; i++) {
            if (Character.isDigit(plate.charAt(i))) {
                numeros++;
            }
            if (Character.isLetter(plate.charAt(i))) {
                letras++;
            }
        }
        if ((letras==2 || letras==3) && numeros==4) {return true;}
        else {return false;}
    }

    //@Override
    //public boolean equals(Object o) {
    //    if (this == o) {
    //        return true;
    //    }
    //    if (o == null || getClass() != o.getClass()) {
    //        return false;
    //    }
    //    Wheel rueda = (Wheel) o;
    //    return brand.equals(rueda.brand) &&
    //            diameter == rueda.diameter;
    //}

}
