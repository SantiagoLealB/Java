package com.leal.avanzado.Tema14.nio.watchService;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardWatchEventKinds.*;//lamar de forma directa sin utilizar el prefijo de la clase
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class WatchService {
    
     
        public void observar() throws Exception{
            //crear el obj que va a monitorear el archivo
            WatchService watcher = (WatchService) FileSystems.getDefault().newWatchService();
            Path arc = Paths.get("carpetaPrueba");
            //registrar los eventos que va a monitorear 
            arc.register(watcher, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
            System.out.println("Iniciando observacion para: " + arc.getFileName());
       
             while(true){//bucle infinito
                 WatchKey key;
                 key = watcher.take();
                 List<WatchEvent<?>> listaEventos = key.pollEvents();
                 
                 for(WatchEvent<?> evento : listaEventos){
 
                     Kind<?> tipoEvento = evento.kind();//Obtener tipo de evento
                     
                     Path fileName = (Path) evento.context();//archivo afectado
                     
                     //System.out.println(tipoEvento.name() + ": " + fileName);
                     
                     if(tipoEvento == OVERFLOW){//si sucede evento no capturado
                         continue; //continue, hasta encontraar otro evento
                     }
                     else if(tipoEvento == ENTRY_DELETE){//hacer algo   
                         if(fileName.toString().equalsIgnoreCase("archivo.txt")){
                             System.out.println("EL archivo: " + fileName + " ha sido eliminado" );
                         }
                     }
                     else if(tipoEvento == ENTRY_MODIFY){}
                     else if(tipoEvento == ENTRY_CREATE){}
           
                 }
                 
                 boolean valid = key.reset();//resetearla llave para que siga monitoreando
                 if(!valid){
                     break;
                 }
             }
        }
        
        
        public static void main(String...leal) throws Exception{
            WatchService app = new WatchService();
            app.observar();
        
        }
}
