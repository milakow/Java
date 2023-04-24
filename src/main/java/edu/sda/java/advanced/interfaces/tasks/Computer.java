package edu.sda.java.advanced.interfaces.tasks;

/**
 * Create a class Computer and subclasses Desktop and Laptop
 * Create an interface InternetConnection
 * with method connectToWifi
 * Let Computer implement InternetConnection
 * Implement method connectToWifi on class Computer
 * Override it on Desktop to get information that Desktops do not have Network Adapter
 *
 * Add Enum ConnectionType with types: WIFI, ETHERNET.
 * Add at least one field to it with name "shortcut".
 * Create a method to search for ConnectionType basing on this shortcut
 *
 * Rename method connectToWifi to connect()
 * Add field representing ConnectionType to Desktop
 * If desktop will have this field set, change way of connect method behavior - it can allow for connections now
 */

public abstract class Computer implements InternetConnection{

    private final String type;

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    private final ConnectionType connectionType;



    public Computer(String type, ConnectionType connectionType) {
        this.type = type;
        this.connectionType = connectionType;
    }

    public Computer(String type, String shortcut) {
        this.type = type;
        this.connectionType = ConnectionType.findByShortcut(shortcut);
    }

    public String getType() {
        return type;
    }

    @Override
    public String connect() {
        return "Computer " + type + " is not connected to Wifi.";
    }
}
