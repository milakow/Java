package advancedDevelopment.task6;

/**
 * Create an enum class named ConversionType with constants METERS_TO_YARDS, YARDS_TO_METERS,
 * CENTIMETERS_TO_ICHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
 * The enum should have a parameter of type Converter which is used to perform calculations for the given type.
 * Next, create a class named MeasurementConverter which will have a method named convert(int value, ConversionType conversionType).
 * This method will take a value and a conversion type as input, and based on the provided value and type of conversion,
 * it will use the Converter of the corresponding type to perform the conversion and return the result.
 */
public enum ConversionType {
    METERS_TO_YARDS(1.0936),
    YARDS_TO_METERS( 0.9144),
    CENTIMETERS_TO_ICHES(0.3937),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.6214),
    MILES_TO_KILOMETERS(1.6093);

    private double converter;


    private ConversionType(double converter) {
        this.converter = converter;
    }

    public double getConverter() {
        return converter;
    }
}
