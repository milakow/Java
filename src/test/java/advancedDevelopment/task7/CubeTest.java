package advancedDevelopment.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CubeTest {

    @Test
    public void checkCubeVolume(){
        //given
        Cube cube = new Cube(4);

        //when
        double result = cube.calculateVolume();

        //then
        assertThat(result).isEqualTo(64.0);
    }

    @Test
    public void checkCubeArea(){
        //given
        Cube cube = new Cube(3);

        //when
        double result = cube.calculateArea();

        //then
        assertThat(result).isEqualTo(54.0);
    }

}