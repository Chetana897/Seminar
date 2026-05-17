import java.rmi.*;
import java.rmi.server.*;

public class ServerImplementation extends UnicastRemoteObject implements ServerInterface {

    public ServerImplementation() throws RemoteException { }

    public double addSquares(double a, double b) throws RemoteException {
        return (a * a) + (b * b);
    }
}