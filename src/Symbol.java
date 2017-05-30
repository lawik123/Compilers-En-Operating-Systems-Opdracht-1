/**
 * Created by lars on 3/6/2017.
 */
public class Symbol {
    //attributes
    private String name;
    private Type type;

    //constructor
    public Symbol(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    //getters
    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
