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

    /**
     * Constructor for global scope
     * has no parent
     */
    public Scope() {
        this.symbolTable = new HashMap<String, Symbol>();
    }

    public Symbol declareVariable(String key, DataType dataType, boolean isGlobal) {
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

    public Symbol declareMethod(String key, MethodType newM) {

        Symbol newMethod = new Symbol(key, newM);

        symbolTable.put(key, newMethod);
        return newMethod;
    }

    private Symbol lookupForGlobalVariable(String key) {
        Symbol variable = symbolTable.get(key);
        if(variable != null) {
            return variable;
        } else {
            variable = parentScope.lookupForGlobalVariable(key);
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

    public Scope openScope() {

        return new Scope(this);
    }

    public Scope closeScope() {
        return getParentScope();
    }


    //Getters

    private Scope getParentScope() {
        return parentScope;
    }
}
