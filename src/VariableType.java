/**
 * Created by lars on 3/6/2017.
 */
public class VariableType extends Type {
    private DataType dataType;

    public VariableType(DataType dataType) {
        this.dataType = dataType;
    }

    public DataType getDataType() {
        return dataType;
    }
}
