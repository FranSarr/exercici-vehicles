import com.vehicles.project.Bike;
import com.vehicles.project.Car;
import com.vehicles.project.Plate;
import com.vehicles.project.Wheel;

import java.util.ArrayList;
import java.util.Scanner;

public class fase3 {
    public static void main(String[] args) {
        String matricula;
        String marca;
        String colorin;
        String tipo_vehi;
        Scanner user_input = new Scanner(System.in);
        Scanner user_input2 = new Scanner(System.in);
        Scanner user_input3 = new Scanner(System.in);

        System.out.print("Please, enter if you want a car or a bike: ");
        tipo_vehi = user_input3.nextLine();
        if (!tipo_vehi.equals("car") && !tipo_vehi.equals("bike")){
            System.out.print("Error, you did not entered either a car or a bike: \n");
        }

        System.out.print("Please, enter the plate of the " + tipo_vehi +" : ");
        matricula = user_input.nextLine();
        Plate placa = new Plate(matricula);

        if (placa.check()) {
            System.out.print("Matricula correcta :" + placa.getPlate() + "\n");
        } else {
            System.out.print("Error, las matriculas solo pueden tener 4 numeros y 2 o 3 letras" + "\n");
        }

        System.out.print("Please, enter the brand of the " + tipo_vehi + ": ");
        marca = user_input.nextLine();
        System.out.print("Please, enter the color of the " + tipo_vehi + ": ");
        colorin = user_input.nextLine();

        //Car cotxe = new Car(matricula, marca, colorin);

        Car cotxe = null;
        Bike moto = null;

        if (tipo_vehi.equals("car")) {
            cotxe = new Car(matricula, marca, colorin);
           // System.out.print("es un coche");
        } else if (tipo_vehi.equals("bike") ) {
            moto = new Bike(matricula, marca, colorin);}
          //  System.out.print("es una moto");}


        ArrayList<Wheel> ruedas_atras = new ArrayList<Wheel>();
        ArrayList<Wheel> ruedas_delante = new ArrayList<Wheel>();

        String w_brand;
        Double wheel_dia;

        //Rear Wheels
        System.out.print("Please, enter the brand of one rear wheel: ");
        w_brand = user_input.nextLine();
        System.out.print("Please, enter the diameter of one rear wheeel: ");
        wheel_dia = user_input2.nextDouble();
        if (wheel_dia>0.4 && wheel_dia<4) {
            ruedas_atras.add(new Wheel(w_brand,wheel_dia));}
        else { System.out.print("Error, wheel diameter must be bigger than 0,4 and smaller than 4" + "\n");}

        if (tipo_vehi.equals("car")) {
        System.out.print("Please, enter the brand of the other rear wheel: ");
        w_brand = user_input.nextLine();
        System.out.print("Please, enter the diameter of the other rear wheel: ");
        wheel_dia = user_input2.nextDouble();
        if (wheel_dia>0.4 && wheel_dia<4) {
            ruedas_atras.add(new Wheel(w_brand,wheel_dia));}
        else { System.out.print("Error, wheel diameter must be bigger than 0,4 and smaller than 4" + "\n");}}

        //try {
        //    cotxe.addTwoWheels(ruedas_atras);
        //} catch (Exception e) {System.out.println("Error, both wheels must be identical, please try again");}

        //Front Wheels
        System.out.print("Please, enter the brand of one front wheel: ");
        w_brand = user_input.nextLine();
        System.out.print("Please, enter the diameter of the front right wheel: ");
        wheel_dia = user_input2.nextDouble();
        if (wheel_dia>0.4 && wheel_dia<4) {
            ruedas_delante.add(new Wheel(w_brand,wheel_dia));}
        else { System.out.print("Error, wheel diameter must be bigger than 0,4 and smaller than 4" + "\n");}

        if (tipo_vehi.equals("car")) {
            System.out.print("Please, enter the brand of the other front wheel: ");
        w_brand = user_input.nextLine();
        System.out.print("Please, enter the diameter of the front left wheel: ");
        wheel_dia = user_input2.nextDouble();
        if (wheel_dia>0.4 && wheel_dia<4) {
            ruedas_delante.add(new Wheel(w_brand,wheel_dia));}
        else { System.out.print("Error, wheel diameter must be bigger than 0,4 and smaller than 4" + "\n");}}

        //try {
        //    cotxe.addTwoWheels(ruedas_delante);
        //} catch (Exception e) {System.out.println("Error, both wheels must be identical, please try again");}

        if (tipo_vehi.equals("car")) {
            try {
                cotxe.addWheels(ruedas_atras,ruedas_delante);
            } catch (Exception e) {System.out.println("Error, wheels in each zone must be identical, please try again");}
        } else if (tipo_vehi.equals("bike") ) {
            try {
                moto.addWheels(ruedas_atras,ruedas_delante);
                } catch (Exception e) {System.out.println("Error, incorrect number of wheels, please try again");}
            }

        //Compruebo si se ha cargado la lista de ruedas al coche
        //System.out.print(moto.getWheels().size());
        //for(Wheel r : moto.getWheels()) {
        //    System.out.println(r.getBrand());
        //    System.out.println(r.getDiameter());}





    }
}
