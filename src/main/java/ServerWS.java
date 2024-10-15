
import WS.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerWS {
    public  static void main(String[] args){
        System.out.println("Démarrage du serveur...");
        Endpoint.publish("http://localhost:9191/", new BanqueService());
        System.out.println("web service deployé sur http://localhost:9191/");
    }
}
