
package comunicacion;

public class CanalJaS implements Observable{
    
    private static CanalJaS canal;
    private Observer consumidor;
    private Object evento = null;

    private CanalJaS() {
    }
    
    public static CanalJaS obtenerCanal(){
        if(canal == null){
            canal = new CanalJaS();
        }
        return canal;
    }

    public void PublicarEvento(Object o){
        this.evento = o;
        notificar();
    }
    
    public Object consumirEvento(){
        Object o = evento;
        evento = null;
        return o;
    }
    
    @Override
    public void notificar() {
        consumidor.update();
    }
    
    public void enlazarConsumidor(Observer consumidor){
        this.consumidor = consumidor;
    }
}
