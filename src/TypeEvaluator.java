/**
 * Created by lars on 2/21/2017.
 */
public class TypeEvaluator extends LangBaseVisitor<Type> {

    @Override
    public Type visitProg(LangParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Type visitVarDecl(LangParser.VarDeclContext ctx) {
        return super.visitVarDecl(ctx);
    }
}
