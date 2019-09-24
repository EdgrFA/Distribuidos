package sources;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfazRMI extends Remote{
    
    public String Saludo(String nombre) throws RemoteException;
    
}
