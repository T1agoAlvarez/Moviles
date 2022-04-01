import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //Write your code here
        Scanner inputData = new Scanner(System.in);
        String productoName, brand, model;
        double price;


        System.out.println("Ingrese el nombre del producto");
        productoName = inputData.nextLine();
        System.out.println("Ingrese el precio del producto");
        price = Double.parseDouble(inputData.nextLine());
        System.out.println("Ingrese la marca del producto");
        brand = inputData.nextLine();
        Producto monitorHp = new Producto(productoName,price,brand);
        System.out.println(monitorHp.getName());
        System.out.println(monitorHp.getPrice());
        System.out.println(monitorHp.getBrand());
        Carro tesla = new Carro();
        //tesla.color = "Negro";
        tesla.encender();
        Carro mercedez = new Carro();
        //System.out.println(mercedez.color);
        tesla.setColor("verde");
        String color = tesla.getColor();
        System.out.println("el color es: "+ color);
    }
}
