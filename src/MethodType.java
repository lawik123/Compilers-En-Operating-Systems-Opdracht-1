import java.util.ArrayList;
import java.util.List;

/**
 * Created by lars on 3/6/2017.
 */
public class MethodType extends Type {
    //attributes
    private DataType returnType;
    private List<DataType> parameters = new ArrayList<DataType>();

    /**
     * constructor for method
     * @param returnType the returntype of the method
     */
    public MethodType(DataType returnType) {
        this.returnType = returnType;
    }

    /**
     * add a parameter to the list of parameters
     * @param dataType the parameter type which is added to the list
     */
    public void addParameter(DataType dataType) {
        parameters.add(dataType);
    }

    //getters
    public List<DataType> getParameters() {
        return parameters;
    }

    public DataType getReturnType() {
        return returnType;
    }
}
