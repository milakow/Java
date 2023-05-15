package advancedDevelopment.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class HexagonTest {

    @Test
    public void checkHexagonPerimeter(){
        //given
        Hexagon hexagon = new Hexagon(3);

        //when
        int result = hexagon.calculatePerimeter();

        //then
        assertThat(result).isEqualTo(18);
    }

    @Test
    public void checkHexagonArea(){
        //given
        Hexagon hexagon = new Hexagon(5);

        //when
        double result = hexagon.calculateArea();

        //then
        assertThat((double)Math.round(result)).isEqualTo(65.00);

    }

}