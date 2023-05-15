package advancedDevelopment.task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class JoinerTest {

    @Test
    public void checkJoinerInteger() {
        //given
        JoinerInteger joinerInteger = new JoinerInteger(",");

        //when
        String result = joinerInteger.join(1, 2, 3);

        //then
        assertThat(result).isEqualTo("{1,2,3}");

    }


    @Test
    public void checkJoinerString() {
        //given
        JoinerString joinerString = new JoinerString("-");

        //when
        String result = joinerString.join("ABC", "DEF", "GHI");

        //then
        assertThat(result).isEqualTo("[0:ABC-1:DEF-2:GHI]");

    }

}