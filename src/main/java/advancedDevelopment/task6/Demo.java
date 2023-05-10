package advancedDevelopment.task6;

public class Demo {
    public static void main(String[] args) {
        MeasurementConverter measurementConverter = new MeasurementConverter();
        System.out.println(measurementConverter.convert(5, ConversionType.CENTIMETERS_TO_ICHES));
    }
}
