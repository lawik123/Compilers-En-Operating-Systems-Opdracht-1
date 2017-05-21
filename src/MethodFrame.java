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

    public MethodFrame(MethodFrame globalFrame) {
        this.jasminPosition = new HashMap<String, String>();
        this.globalFrame = globalFrame;
        this.variableTypes = new HashMap<String, String>();
    }

    public MethodFrame() {
        this.jasminGlobalcode = new HashMap<String, String>();
        this.variableTypes = new HashMap<String, String>();
    }

    public void declareJasminPosition(String key, int position, String type) {
        jasminPosition.put(key, String.valueOf(position));
        variableTypes.put(key, type);
    }

    public void declareGlobalJasminVariable(String key, String jasmincode, String type) {
        jasminGlobalcode.put(key, jasmincode);
        variableTypes.put(key, type);
    }

    public String lookupJasminPosition(String key) {
        if(jasminPosition.containsKey(key)) {
            return jasminPosition.get(key);
        } else {
            return globalFrame.lookupGlobalCode(key);
        }
    }

    public String lookupGlobalCode(String key) {
        if(jasminGlobalcode.containsKey(key)){
            return jasminGlobalcode.get(key);
        }
        return "";
    }

    public String lookupType(String key) {
        if(variableTypes.containsKey(key)) {
            return variableTypes.get(key);
        } else {
            return globalFrame.lookupGlobalType(key);
        }
    }

    public String lookupGlobalType(String key) {
        if(variableTypes.containsKey(key)) {
            return variableTypes.get(key);
        }
        return "";
    }

    public Map<String, String> getJasminPosition() {
        return jasminPosition;
    }

    public void setJasminPosition(Map<String, String> jasminPosition) {
        this.jasminPosition = jasminPosition;
    }
}
