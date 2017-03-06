import java.util.List;

/**
 * Created by lars on 3/6/2017.
 */
public class MethodType extends Type {

    private DataType returnType;
    private List<DataType> parameters;

    public MethodType(DataType returnType, List<DataType> parameters) {
        this.returnType = returnType;
        this.parameters = parameters;
    }

    public void addParameter(DataType dataType) {
        parameters.add(dataType);
    }
}
