package edu.sda.java.advanced.interfaces.tasks;

/**
 * Create a class Computer and subclasses Desktop and Laptop
 * Create an interface InternetConnection
 * with method connectToWifi
 * Let Computer implement InternetConnection
 * Implement method connectToWifi on class Computer
 * Override it on Desktop to get information that Desktops do not have Network Adapter /???????????????
 *
 * Add Enum ConnectionType with types: WIFI, ETHERNET.
 * Add at least one field to it with name "shortcut".
 * Create a method to search for ConnectionType basing on this shortcut
 */
public class Laptop extends Computer{

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    private ConnectionType connectionType;

    public Laptop(String type, ConnectionType connectionType) {
        super(type, connectionType);
    }

    public Laptop(String type, String shortcut) {
        super(type, shortcut);
    }

}
