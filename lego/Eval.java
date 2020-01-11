// Created by David Kubik
// 20029272
// Evaluator for Lego formulas
package lego;

import lego.parser.*;
import java.util.Map;
import java.util.HashMap;

// Env is a data structure that stores the values of a free variables
class Env{
    Map<String,Integer> vars;

    Env() {
        this.vars = new HashMap<>();
    }
}

public class Eval {
    
    public static boolean eval(Formula f) throws DivisionByZeroException, FreeVariableException, ModuloByZeroException{
        //Creates a new instance of the environment object.
        return eval(f, new Env());
    }

    // Method that parses the formula and finds which eval to use using recursion.
    public static boolean eval(Formula f, Env e) throws FreeVariableException,DivisionByZeroException,ModuloByZeroException {
        
        //Evaluates each side of the expressions and applies operator on the result.
        if (f instanceof Atomic) {
        Integer leftSide = evalExp(((Atomic) f).e1, e);
        Integer rightSide = evalExp(((Atomic) f).e2, e);
        String op = ((Atomic) f).rel_op;
          
        //Evaluates equality / inequality
        switch(op){
            case "=":
                return leftSide.equals(rightSide);
            case ">":
                return leftSide > rightSide;
            case ">=":
                return leftSide >= rightSide;
            }
        return true;
        } 
        
        else if (f instanceof Binary) {
            return evalBin(eval(((Binary) f).f1, e), ((Binary) f).bin_conn, eval(((Binary) f).f2, e));  
        } else if (f instanceof Unary) {
            return evalUnaryConn(((Unary) f).unary_conn, eval(((Unary) f).f, e));
        } else if (f instanceof Quantified) {
            
            Integer startDomain = Integer.parseInt(((Quantified) f).dom.from.toString());
            Integer endDomain = Integer.parseInt(((Quantified) f).dom.to.toString());
            
            if (((Quantified) f).quant.equals("forall")) {
                for (int x = startDomain; x <= endDomain; x++) {
                    e.vars.put(((Quantified) f).var.toString(), x);
                    // If all cases hold true, forall is true.
                    if (eval(((Quantified) f).f, e)) {
                        continue;
                    } else {
                        return false; //Otherwise result is false.
                    }
                }
            } else if (((Quantified) f).quant.equals("exists")) {
                for (int y = startDomain; y <= endDomain; y++) {
                    e.vars.put(((Quantified) f).var.toString(), y);
                    //Checks for one true case.
                    if (eval(((Quantified) f).f, e)) {
                        return true;
                    }
                }
                return false; // Otherwise result is false.
            }
        }
            return true;
    }
                      
    // Method that evaluates the expression.
    public static int evalExp(Exp f, Env e) throws DivisionByZeroException, ModuloByZeroException, FreeVariableException {
        if (f instanceof BinExp) {
            return evalBin(evalExp(((BinExp) f).e1, e),((BinExp) f).bin_op,evalExp(((BinExp) f).e2, e));
        } else if (f instanceof Var) {
            return getBoundedVar(f.toString(),e);
        } else if (isNumber(f.toString())){
            return Integer.parseInt(f.toString());
        }
        return 0;
    }
    
    // Evaluation of binary expression for addition, subtraction, multiplication and modulo
    public static int evalBin(Integer x, String op, Integer y) throws DivisionByZeroException, ModuloByZeroException{
        switch(op){
            case "+":
                return x + y;
                
            case "-":
                return x - y;
                
            case "*":
                return x * y;
                
            case "/":
                if (y == 0){
                    // Checks for a case where the divident equals zero.
                    throw new DivisionByZeroException();
                }
                return x / y;
                
            case "mod":
                if (y == 0){
                    // Checks for the case x mod 0 is undefined.
                    throw new ModuloByZeroException();
                }
                return x % y;
        }
        return 0;
    }

    // Evaluation of binary connectives for conjuction, disjunction, implication and equivalence
    public static boolean evalBin(boolean x, String op, boolean y) { 
        switch(op){
            case "&&":
                return x && y;
            case "||":
                return x || y;
            case "->":
                return !x || y;
            case "<->":
               if (x && y){
                   
                   return true;
                   
               } else if (!x && !y){
                   
                   return true;
                   
               } else {
                   
                   return false;
               }
        } 
        return true;
    }

    // Evaluation of unary connector
    public static boolean evalUnaryConn(String op, boolean x) {
        if (op.equals("!")) {
            return !x;
        }
        return true;
    }
    
    //Checks if the variable is free
    public static int getBoundedVar(String var, Env e) throws FreeVariableException {
        // get variable
        if (e.vars.get(var) == null || e.vars.isEmpty()) {
            throw new FreeVariableException();
        }
        return e.vars.get(var); //return the value of the bounded variable stored in the HashMap
    }

    //Checks if the expression is numeric
    public static boolean isNumber(String s){
        return s.matches("-?\\d+(\\.\\d+)?");
    }

}
