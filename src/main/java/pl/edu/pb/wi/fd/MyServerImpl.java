package pl.edu.pb.wi.fd;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class MyServerImpl extends UnicastRemoteObject implements MyServerInt {
    private IConnection dbConnection;

    protected MyServerImpl(IConnection dbConnection) throws RemoteException {
        super();
        this.dbConnection = dbConnection;
    }

    @Override
    public List<String> findAll() throws RemoteException {
        System.out.println("FindAll");
        return dbConnection.findAll();
    }

    @Override
    public List<String> findAllByName(String name) throws RemoteException {
        System.out.println("FindByName(\""+name+"\")");
        return dbConnection.findAllByName(name);
    }
}
