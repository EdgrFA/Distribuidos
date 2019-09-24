package sources;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServidorRMI extends UnicastRemoteObject implements InterfazRMI{

    private static final long serialVersionUID = 1L;

    protected ServidorRMI() throws RemoteException {
        super();
    }

    @Override
    public String Saludo(String nombre) throws RemoteException {
        System.err.println(nombre + " esta tratando de contactar");
        return "Servidor dice Hola Mundo a " + nombre;
    }
    
    public static void main(String[] args) {
        try {
            Naming.rebind("//localhost/MiServidor", new ServidorRMI());            
            System.err.println("Servidor listo");
            
        } catch (Exception e) {
            System.err.println("Excepción: " + e.toString());
            e.printStackTrace();
        }
    }
}
