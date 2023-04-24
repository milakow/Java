package edu.sda.java.advanced.interfaces.tasks;

import edu.sda.java.advanced.enums.Gender;

public enum ConnectionType {
    WIFI ("wifi"),
    ETHERNET("ENT");

    private String shortcut;

    ConnectionType(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getShortcut() {
        return shortcut;
    }

    public static ConnectionType findByShortcut(String shortcut) {
        for (ConnectionType value : ConnectionType.values()) {
            if(value.shortcut.equalsIgnoreCase(shortcut)) {
                return value;
            }
        }
        return null;
    }
}
