import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lars on 3/6/2017.
 */
public class Scope {

    private Scope parentScope;
    private Map<String, Symbol> symbolTable;

    public Scope(Scope parentScope) {
        this.parentScope = parentScope;
        this.symbolTable = new HashMap<String, Symbol>();
    }

    private Symbol declareVariable(String key, DataType dataType, boolean isGlobal) {
        if(isGlobal) {
            Symbol var = lookupVariable(key);
            if(var == null) {
                VariableType variable = new VariableType(dataType, isGlobal);

                Symbol newVariable = new Symbol(key, variable);

                symbolTable.put(key, newVariable);
                return newVariable;
            }
        } else {
            Symbol var = lookupForGlobalVariable(key);
            if(var == null) {
                VariableType variable = new VariableType(dataType, isGlobal);

                Symbol newVariable = new Symbol(key, variable);

                symbolTable.put(key, newVariable);
                return newVariable;
            }
        }
        return null;
    }

    private Symbol declareMethod(String key, DataType dataType, List<DataType> parameters) {
        MethodType method = new MethodType(dataType, parameters);

        Symbol newMethod = new Symbol(key, method);

        symbolTable.put(key, newMethod);
        return newMethod;
    }

    private Symbol lookupForGlobalVariable(String key) {
        Symbol variable = symbolTable.get(key);
        if(variable != null) {
            return variable;
        } else {
            variable = parentScope.lookupVariable(key);
            if(variable != null) {
                return variable;
            } else {
                return null;
            }
        }
    }

    private Symbol lookupVariable(String key) {
        Symbol variable = symbolTable.get(key);
        if(variable != null) {
            return variable;
        } else {
            return null;
        }
    }

    private Symbol lookupMethod(String key) {
        return symbolTable.get(key);
    }

    private Scope openScope() {

        return new Scope(this);
    }

    private Scope closeScope() {
        return getParentScope();
    }


    //Getters

    private Scope getParentScope() {
        return parentScope;
    }
}
