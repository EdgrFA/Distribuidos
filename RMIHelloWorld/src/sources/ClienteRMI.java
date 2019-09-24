package sources;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

public class ClienteRMI {
    
    private static InterfazRMI look_up;

    
    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
	look_up = (InterfazRMI) Naming.lookup("//localhost/MiServidor");
        String texto = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        String respuesta = look_up.Saludo(texto);
	JOptionPane.showMessageDialog(null, respuesta);
        
    }
    
}
