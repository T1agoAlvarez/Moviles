public class Carro {
    private  String color;
    String marca, diseño, placa;

    void encender (){
        System.out.println("encendiendo");
    }
        void trasladar(){
            System.out.println("Trasladando");
        }
        void acelerar(){
            System.out.println("Acelerando");
        }
        //
        void setColor(String color){
            if (color.equals("rosado")){
                System.out.println("no puede ser rosado");
            }
            else {
                this.color = color;
            }
        }
        String getColor(){
            return this.color;
        }
}
