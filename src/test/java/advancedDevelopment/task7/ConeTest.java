package advancedDevelopment.task7;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.concurrent.CompletionException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ConeTest {
    @Test
    public void checkConeVolume(){
        //given
        Cone cone = new Cone(2, 5, 5.38);

        //when
        double result = cone.calculateVolume();
        double roundedResult = Math.round(result * 100.0) / 100.0;

        //then
        assertThat(roundedResult).isEqualTo(20.94);
    }

    @Test
    public void checkConeArea(){
        //given
        Cone cone = new Cone(1, 4, 4.12);

        //when
        double result = cone.calculateArea();
        double roundedResult = Math.round(result * 100.0) / 100.0;

        //then
        assertThat((double) Math.round(result)).isEqualTo(16.08);
    }

    @Test
    public void checkConePerimeter(){
        //given
        Cone cone = new Cone(3, 4, 9);

        //when
        double result = cone.calculatePerimeter();

        //then
        assertThat(result).isEqualTo(0);

    }

}