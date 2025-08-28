public class Motor {
    private boolean encendido = false;

    public void encender(){
        if(!encendido){
        encendido = true;
        System.out.println("El motor esta encendido.");
        }  
    }
    public void apagado(){
        if (encendido) {
            encendido = false;
            System.out.println("El motor esta apagado");
        }
    }
    public boolean estaencencido(){
        return encendido;
    }
}