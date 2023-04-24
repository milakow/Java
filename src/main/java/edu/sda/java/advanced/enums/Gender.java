package edu.sda.java.advanced.enums;

//We do not use camel case in enums
public enum Gender {
    FEMALE("f", "kobieta"),
    MALE("m", "mężczyzna");

    private String abbreviate;
    private String plTranslation;

    Gender(String abbreviate, String plTranslation) {
        this.abbreviate = abbreviate;
        this.plTranslation = plTranslation;
    }

    public String getAbbreviate() {
        return abbreviate;
    }

    public String getPlTranslation() {
        return plTranslation;
    }

    public static Gender findByAbbrev(String abbrev) {
        for (Gender value : Gender.values()) { //values() allows us to get all instances, so we are able to iterate over it
            if(value.abbreviate.equalsIgnoreCase(abbrev)) {
                return value;
            }
        }
        return null; //if no abbrev fits
    }
}
