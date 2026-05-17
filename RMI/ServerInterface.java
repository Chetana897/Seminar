import java.rmi.*;

interface ServerInterface extends Remote {
    public double addSquares(double a, double b) throws RemoteException;
}