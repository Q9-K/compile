package q9k.buaa.AST;

import q9k.buaa.Frontend.Token.Token;
import q9k.buaa.Symbol.SymbolTable;
import q9k.buaa.Symbol.SymbolType;
import q9k.buaa.Utils.Tuple;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FuncFParams implements Syntax {
    private Syntax func_f_param;
    private List<Tuple<Token, Syntax>> list;

    public FuncFParams(Syntax func_f_param, List<Tuple<Token, Syntax>> list) {
        this.func_f_param = func_f_param;
        this.list = list;
    }

    @Override
    public void print() throws IOException {
        func_f_param.print();
        for(Tuple<Token, Syntax> item : list){
            item.getFirst().print();
            item.getSecond().print();
        }
        printAstName(FuncFParams.class);
    }

    @Override
    public void visit() {
        func_f_param.visit();
        for(Tuple<Token, Syntax> item : list){
            item.getSecond().visit();
        }
    }

    @Override
    public int getLineNumber() {
        return func_f_param.getLineNumber();
    }
    public List<SymbolType> getSymbolTypeList(){
        List<SymbolType> symbolTypeList = new ArrayList<>();
        symbolTypeList.add(((FuncFParam)func_f_param).getSymbolType());
        for(Tuple<Token, Syntax> item : list){
            FuncFParam funcFParam = (FuncFParam) item.getSecond();
            symbolTypeList.add(funcFParam.getSymbolType());
        }
        return symbolTypeList;
    }
}
