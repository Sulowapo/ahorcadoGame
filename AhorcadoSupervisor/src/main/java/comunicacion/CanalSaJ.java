
package comunicacion;

import java.util.ArrayList;


public class CanalSaJ implements Observable{

    private static CanalSaJ canal;
    private ArrayList<Observer> consumidores = new ArrayList<>();
    private Object evento = null;
    //Esta variable simula el consumo de los eventos por parte de los consumidores
    private int i = 0;
    
    private CanalSaJ(){    
    }
    
    public static CanalSaJ obtenerCanal(){
        if(canal == null){
            canal = new CanalSaJ();
        }
        return canal;
    }
    
    public void enlazarConsumidor(Observer consumidor){
        consumidores.add(consumidor);
    }
    
    public void PublicarEvento(Object o){
        this.evento = o;
        notificar();
    }
    
    public Object consumirEvento(){
        i++;
        Object o = evento;
        if(i >= consumidores.size()){
            evento = null;
        }
        return o;
    }
    
    @Override
    public void notificar() {
        for(Observer consumidor : consumidores){
            consumidor.update();
        }
    }
    
}
