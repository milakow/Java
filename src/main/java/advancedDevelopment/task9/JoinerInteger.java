package advancedDevelopment.task9;

/**
 * Add 2 additional classes, JoinerString and JoinerInteger, that inherit from Joiner.
 * The new classes must implement the same logic as the base class but return the results in the following format:
 *
 * - JoinerInteger, assuming joiner is ",": "{0,1,2,3,4,5}"
 * - JoinerString, assuming joiner is "-": "[0:text1-1:text2-2:text3]"
 */
public class JoinerInteger extends Joiner<Integer>{
    public JoinerInteger(String separator) {
        super(separator);
    }

    @Override
    public String join(Integer... nums) {
        String result = "{";
        result += nums[0].toString();
        for (int i = 1; i < nums.length; i++) {
            result += getSeparator() + nums[i].toString();
        }
        result += "}";
        return result;
    }

}
