package advancedDevelopment.task2;

import org.junit.jupiter.api.Test;

import advancedDevelopment.task2.Sorter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SorterTest {

    @Test
    public void shouldBeReturningDescendingOrderWithoutLetterCase() {
        //given
        List<String> list = new ArrayList<>(Arrays.asList("AIM", "back", "ciTEA"));

        //when
        List<String> result = Sorter.sortDescendingWithoutLetterCase(list);

        //then
        assertThat(result).contains("ciTEA", "back", "AIM");
    }

}