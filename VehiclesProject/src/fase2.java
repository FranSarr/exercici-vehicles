import com.vehicles.project.Car;
import com.vehicles.project.Plate;
import com.vehicles.project.Wheel;

import java.util.ArrayList;
import java.util.Scanner;

public class fase2 {
    public static void main(String[] args) {
        String matricula;
        String marca;
        String colorin;
        Scanner user_input = new Scanner(System.in);
        Scanner user_input2 = new Scanner(System.in);

        System.out.print("Please, enter the plate of the car: ");
        matricula = user_input.nextLine();
        Plate placa = new Plate(matricula);

        if (placa.check()) {
            System.out.print("Matricula correcta :" + placa.getPlate() + "\n");
        } else {
            System.out.print("Error, las matriculas solo pueden tener 4 numeros y 2 o 3 letras" + "\n");
        }

        System.out.print("Please, enter the brand of the car: ");
        marca = user_input.nextLine();
        System.out.print("Please, enter the color of the car: ");
        colorin = user_input.nextLine();
        Car cotxe = new Car(matricula, marca, colorin);

        ArrayList<Wheel> ruedas_atras = new ArrayList<Wheel>();
        ArrayList<Wheel> ruedas_delante = new ArrayList<Wheel>();

        String w_brand;
        Double wheel_dia;

        //Rear Wheels
        System.out.print("Please, enter the brand of the rear right wheel: ");
        w_brand = user_input.nextLine();
        System.out.print("Please, enter the diameter of the rear right wheel: ");
        wheel_dia = user_input2.nextDouble();
        if (wheel_dia>0.4 && wheel_dia<4) {
                ruedas_atras.add(new Wheel(w_brand,wheel_dia));}
        else { System.out.print("Error, wheel diameter must be bigger than 0,4 and smaller than 4" + "\n");}


        System.out.print("Please, enter the brand of the rear left wheel: ");
        w_brand = user_input.nextLine();
        System.out.print("Please, enter the diameter of the rear left wheel: ");
        wheel_dia = user_input2.nextDouble();
        if (wheel_dia>0.4 && wheel_dia<4) {
            ruedas_atras.add(new Wheel(w_brand,wheel_dia));}
        else { System.out.print("Error, wheel diameter must be bigger than 0,4 and smaller than 4" + "\n");}

        try {
            cotxe.addTwoWheels(ruedas_atras);
        } catch (Exception e) {System.out.println("Error, both wheels must be identical, please try again");}

        //Front Wheels
        System.out.print("Please, enter the brand of the front right wheel: ");
        w_brand = user_input.nextLine();
        System.out.print("Please, enter the diameter of the front right wheel: ");
        wheel_dia = user_input2.nextDouble();
        if (wheel_dia>0.4 && wheel_dia<4) {
            ruedas_delante.add(new Wheel(w_brand,wheel_dia));}
        else { System.out.print("Error, wheel diameter must be bigger than 0,4 and smaller than 4" + "\n");}

        System.out.print("Please, enter the brand of the front left wheel: ");
        w_brand = user_input.nextLine();
        System.out.print("Please, enter the diameter of the front left wheel: ");
        wheel_dia = user_input2.nextDouble();
        if (wheel_dia>0.4 && wheel_dia<4) {
            ruedas_delante.add(new Wheel(w_brand,wheel_dia));}
        else { System.out.print("Error, wheel diameter must be bigger than 0,4 and smaller than 4" + "\n");}

        try {
            cotxe.addTwoWheels(ruedas_delante);
        } catch (Exception e) {System.out.println("Error, both wheels must be identical, please try again");}

        //Compruebo si se ha cargado la lista de ruedas al coche
        //System.out.print(cotxe.getWheels().size());
        //for(Wheel r : cotxe.getWheels()) {
        //    System.out.println(r.getBrand());
        //    System.out.println(r.getDiameter());}





    }
}