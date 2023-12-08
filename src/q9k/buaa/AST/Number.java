package q9k.buaa.AST;

import q9k.buaa.IR.Types.IntegerType;
import q9k.buaa.IR.Value;
import q9k.buaa.Symbol.SymbolTable;
import q9k.buaa.Symbol.SymbolTableFactory;

import java.io.IOException;

public class Number implements Syntax {

    private Syntax int_const;
    private SymbolTable symbolTable;
    

    public Number(Syntax int_const) {
        this.int_const = int_const;
    }

    @Override
    public void print() throws IOException {
        int_const.print();
        printAstName(Number.class);
    }

    @Override
    public void visit() {
        this.symbolTable = SymbolTableFactory.getInstance().getCurrent();
    }

    @Override
    public int getLineNumber() {
        return int_const.getLineNumber();
    }

    @Override
    public Value generateIR() {
        return int_const.generateIR();
    }

    @Override
    public String toString() {
        return int_const.toString();
    }


}
