import java.util.HashMap;
import java.util.Map;

/**
 * Created by lars on 3/20/2017.
 */
public class MethodFrame {
    private Map<String, String> jasminPosition;
    private MethodFrame globalFrame;

    public MethodFrame(MethodFrame globalFrame) {
        this.jasminPosition = new HashMap<String, String>();
        this.globalFrame = globalFrame;
    }

    public MethodFrame() {
        this.jasminPosition = new HashMap<String, String>();
    }

    public void declareJasminPosition(String key, int position) {
        jasminPosition.put(key, String.valueOf(position));
    }

    public String lookupJasminPosition(String key) {
        if(jasminPosition.containsKey(key)) {
            return jasminPosition.get(key);
        } else {
            return globalFrame.lookupJasminPosition(key);
        }
    }

    public Map<String, String> getJasminPosition() {
        return jasminPosition;
    }

    public void setJasminPosition(Map<String, String> jasminPosition) {
        this.jasminPosition = jasminPosition;
    }
}
