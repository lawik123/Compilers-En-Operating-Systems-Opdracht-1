/**
 * Created by lars on 3/6/2017.
 */
public class VariableType extends Type {
    private DataType dataType;
    private boolean isGlobal;

    public VariableType(DataType dataType, boolean isGlobal) {
        this.dataType = dataType;
        this.isGlobal = isGlobal;
    }
}
