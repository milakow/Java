package advancedDevelopment.task9;

/**
 * Add 2 additional classes, JoinerString and JoinerInteger, that inherit from Joiner.
 * The new classes must implement the same logic as the base class but return the results in the following format:
 *
 * - JoinerInteger, assuming joiner is ",": "{0,1,2,3,4,5}"
 * - JoinerString, assuming joiner is "-": "[0:text1-1:text2-2:text3]"
 */
public class JoinerString extends Joiner<String>{
    public JoinerString(String separator) {
        super(separator);
    }

    @Override
    public String join(String ... text) {
        String result = "[";
        result += "0:" + text[0].toString();
        for (int i = 1; i < text.length; i++) {
            result += getSeparator() + i + ":" + text[i].toString();
        }
        result += "]";
        return result;
    }
}
