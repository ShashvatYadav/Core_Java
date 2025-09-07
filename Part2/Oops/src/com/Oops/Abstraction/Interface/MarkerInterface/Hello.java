package com.Oops.Abstraction.Interface.MarkerInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
	// for RMI(Remote method invocation)
	String sayHello() throws RemoteException;
}
