package edu.ufp.inf.sd.rmi.diglib.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DiglibSessionRI extends Remote {
    public Book[] search(String title, String author) throws RemoteException;
    public void logout() throws RemoteException;
}
