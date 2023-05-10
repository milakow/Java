package advancedDevelopment.task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class JoinerTest {

    @Test
    public void checkJoiner() {
        //given
        Joiner<Integer> joiner = new Joiner<>("-");

        //when
        String result = joiner.join(1,2,3,4,5);

        //then
        assertThat(result).isEqualTo("1-2-3-4-5");

    }

}