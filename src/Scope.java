import java.util.HashMap;
import java.util.Map;

/**
 * Created by lars on 3/6/2017.
 */
public class Scope {

    private Scope parentScope = null;
    private Map<String, Symbol> symbolTable;
    private Map<String, String> jasminPosition;

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

    public Symbol declareVariable(String key, DataType dataType) {
        Symbol var = lookupVariable(key);
        if (var == null) {
            VariableType variable = new VariableType(dataType);

            Symbol newVariable = new Symbol(key, variable);

            symbolTable.put(key, newVariable);
            return newVariable;
        }
        return null;
    }

    public Symbol declareMethod(String key, MethodType newM) {

        Symbol newMethod = new Symbol(key, newM);

        symbolTable.put(key, newMethod);
        return newMethod;
    }


    /**
     * looks up a variable within the Scope and all his parentscopes
     *
     * @param key
     * @return
     */
    public Symbol lookupVariable(String key) {
        Symbol variable = symbolTable.get(key);
        if (variable != null) {
            return variable;
        } else {
            //if parentscope is null the global scope is reached, has no parent
            if (parentScope != null)
                variable = parentScope.lookupVariable(key);
            if (variable != null) {
                return variable;
            } else {
                return null;
            }
        }
    }

    public String lookupJasminPosition(String key) {
        String position = jasminPosition.get(key);
        if (position != null) {
            return position;
        } else {
            //if parentscope is null the global scope is reached, has no parent
            if (parentScope != null)
                position = parentScope.lookupJasminPosition(key);
            if (position != null) {
                return position;
            } else {
                return null;
            }
        }
    }

    public Symbol lookupMethod(String key) {
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
