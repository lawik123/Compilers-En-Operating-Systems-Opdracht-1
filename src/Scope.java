import java.util.HashMap;
import java.util.Map;

/**
 * Created by lars on 3/6/2017.
 */
public class Scope {

    //attributes
    private Scope parentScope = null;
    private Map<String, Symbol> symbolTable;

    /**
     * constructor for a scope
     * @param parentScope the scope where the new made scope is a child of.
     */
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

    /**
     * method for declaration of a variable
     * @param key the name of the variable
     * @param dataType the type of the variable
     * @return the symbol which contains the new made variable
     */
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


    /**
     * method for declaration of a method
     * @param key the name of the method
     * @param newM the type of the method
     * @return the created symbol which contains the new made method
     */
    public Symbol declareMethod(String key, MethodType newM) {

        Symbol newMethod = new Symbol(key, newM);

        symbolTable.put(key, newMethod);
        return newMethod;
    }


    /**
     * looks up a variable within the Scope and all his parentscopes
     * @param key the name of the value
     * @return the Symbol which contains the variable
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


    /**
     * lookup the method by name
     * @param key the name of the method
     * @return the Symbol which contains the method
     */
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
