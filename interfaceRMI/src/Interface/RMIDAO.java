/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author JFredy23
 */
public interface RMIDAO extends Remote{
    public double sumar(double numero1, double numero2) throws RemoteException;
    public double restar(double numero1, double numero2) throws RemoteException;
    public double multiplicar(double numero1, double numero2) throws RemoteException;
    public double dividir(double numero1, double numero2) throws RemoteException;
    public String Mensaje(String mensaje) throws RemoteException;
}
