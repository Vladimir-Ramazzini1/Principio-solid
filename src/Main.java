public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.encender();
        motor.apagado();
        System.out.println(motor.estaencencido());
    }
}
