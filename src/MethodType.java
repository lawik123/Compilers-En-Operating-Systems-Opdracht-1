import java.util.ArrayList;
import java.util.List;

/**
 * Created by lars on 3/6/2017.
 */
public class MethodType extends Type {

    private DataType returnType;
    private List<DataType> parameters = new ArrayList<DataType>();

    public MethodType(DataType returnType) {
        this.returnType = returnType;
    }
    public void addParameter(DataType dataType) {
        parameters.add(dataType);
    }

    public List<DataType> getParameters() {
        return parameters;
    }

    public DataType getReturnType() {
        return returnType;
    }
}
