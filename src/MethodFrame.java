import java.util.HashMap;
import java.util.Map;

/**
 * Created by lars on 3/20/2017.
 */
public class MethodFrame {
    //attributes
    private Map<String, String> jasminPosition;
    private Map<String, String> variableTypes;
    private Map<String, String> jasminGlobalcode;
    private MethodFrame globalFrame;

    //constructors
    public MethodFrame(MethodFrame globalFrame) {
        this.jasminPosition = new HashMap<String, String>();
        this.globalFrame = globalFrame;
        this.variableTypes = new HashMap<String, String>();
    }

    public MethodFrame() {
        this.jasminGlobalcode = new HashMap<String, String>();
        this.variableTypes = new HashMap<String, String>();
    }

    /**
     * add variables to hashmaps to store their position and their type
     *
     * @param key      name of the variable
     * @param position the position within jasmin
     * @param type     the type of the variable
     */
    public void declareJasminPosition(String key, int position, String type) {
        jasminPosition.put(key, String.valueOf(position));
        variableTypes.put(key, type);
    }

    /**
     * add variables to hashmaps to store their position and their type as global variables
     *
     * @param key        name of the variable
     * @param jasmincode the code for the variable to get them in jasmin
     * @param type       the type of the variable
     */
    public void declareGlobalJasminVariable(String key, String jasmincode, String type) {
        jasminGlobalcode.put(key, jasmincode);
        variableTypes.put(key, type);
    }

    /**
     * lookup the jasmin position for the variable
     *
     * @param key the name of the variable
     * @return the position
     */
    public String lookupJasminPosition(String key) {
        if (jasminPosition.containsKey(key)) {
            return jasminPosition.get(key);
        } else {    //check in globalscope
            return globalFrame.lookupGlobalCode(key);
        }
    }

    /**
     * lookup jasmin position in hashmap for non global variables
     *
     * @param key the name of the variable
     * @return the position
     */
    public String lookupJasminPositionNonGlobal(String key) {
        if (jasminPosition.containsKey(key)) {
            return jasminPosition.get(key);
        }
        return "";
    }

    /**
     * lookup global variables
     * @param key the identifier for the specific variable
     * @return the jasmin code to get the variable
     */
    public String lookupGlobalCode(String key) {
        if (jasminGlobalcode.containsKey(key)) {
            return jasminGlobalcode.get(key);
        }
        return "";
    }

    /**
     * lookup type of variable
     * @param key the name of variable
     * @return the type of the variable
     */
    public String lookupType(String key) {
        if (variableTypes.containsKey(key)) {
            return variableTypes.get(key);
        } else {    //check global scope
            return globalFrame.lookupGlobalType(key);
        }
    }

    /**
     * lookup type of variable
     * @param key the name of variable
     * @return the type of the variable
     */
    public String lookupGlobalType(String key) {
        if (variableTypes.containsKey(key)) {
            return variableTypes.get(key);
        }
        return "";
    }

    //getter
    public Map<String, String> getJasminPosition() {
        return jasminPosition;
    }

}
