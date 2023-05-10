package advancedDevelopment.task6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class MeasurementConverterTest {


    @ParameterizedTest
    @MethodSource
    public void checkConversion(ConversionType type, double expected){
        //when
        double result = MeasurementConverter.convert(50, type);
        //the method "convert" should be static
        //otherwise we have to create a new object :: double result = new MeasurementConverter().convert...

        //then
        assertThat(result).isEqualTo(expected);
    }

    public static Stream<Arguments> checkConversion(){
        return Stream.of(
                Arguments.of(ConversionType.METERS_TO_YARDS, 54.67999999999999d),
                Arguments.of(ConversionType.INCHES_TO_CENTIMETERS, 127.0d),
                Arguments.of(ConversionType.MILES_TO_KILOMETERS, 80.465d));

    }

}