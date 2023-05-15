package advancedDevelopment.task10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.catchIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ConditionCheckerTest {
    @Test
    public void checkPartOf(){
        ConditionChecker conditionChecker = new ConditionChecker();

        assertThat(conditionChecker.partOf(new Integer[]{1, 2, 3, 4, 5}, num -> num % 2 == 0)).isEqualTo(40);
    }

}