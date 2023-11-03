package q9k.buaa.AST;

import q9k.buaa.Token.Token;
import q9k.buaa.Symbol.SymbolTable;

import java.io.IOException;

public class MainFuncDef implements Syntax {
    private Token int_token;
    private Token main_token;
    private Token lparent_token;
    private Token rparent_token;
    private Syntax block;
    private SymbolTable symbolTable;

    public MainFuncDef(Token int_token, Token main_token, Token lparent_token, Token rparent_token, Syntax block) {
        this.int_token = int_token;
        this.main_token = main_token;
        this.lparent_token = lparent_token;
        this.rparent_token = rparent_token;
        this.block = block;
    }

    @Override
    public void print() throws IOException {
        int_token.print();
        main_token.print();
        lparent_token.print();
        rparent_token.print();
        block.print();
        printAstName(MainFuncDef.class);
    }

    @Override
    public void visit() {
        this.symbolTable = SymbolTable.getCurrent();
        SymbolTable.changeTo(SymbolTable.getCurrent().createSymbolTable());
        SymbolTable.getCurrent().setFunc_block(2);
        block.visit();
        ((Block)block).checkReturn();
        SymbolTable.changeToFather();
    }

    @Override
    public int getLineNumber() {
        return block.getLineNumber();
    }

    @Override
    public String toString() {
        return int_token.toString()+' '+main_token.toString()+lparent_token.toString()+rparent_token.toString()+block.toString();
    }

}
