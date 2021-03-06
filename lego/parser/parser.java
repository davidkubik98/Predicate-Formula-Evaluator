
//----------------------------------------------------
// The following code was generated by CUP v0.10j
// Wed Jan 07 16:25:30 EST 2004
//----------------------------------------------------

package lego.parser;

import java_cup.runtime.Symbol;
import java_cup.runtime.lr_parser;
import java.io.*;

/** CUP v0.10j generated parser.
  * @version Wed Jan 07 16:25:30 EST 2004
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\003\005\000\002\003" +
    "\004\000\002\003\005\000\002\003\010\000\002\003\005" +
    "\000\002\004\003\000\002\004\003\000\002\004\005\000" +
    "\002\004\005\000\002\005\003\000\002\005\003\000\002" +
    "\005\003\000\002\006\003\000\002\007\003\000\002\007" +
    "\003\000\002\007\003\000\002\007\003\000\002\010\003" +
    "\000\002\010\003\000\002\014\003\000\002\011\010\000" +
    "\002\013\003\000\002\012\003\000\002\012\003\000\002" +
    "\012\003\000\002\012\003\000\002\012\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\062\000\016\022\010\026\014\031\004\032\007\033" +
    "\017\034\005\001\002\000\004\034\uffef\001\002\000\040" +
    "\002\uffed\006\uffed\012\uffed\013\uffed\014\uffed\015\uffed\016" +
    "\uffed\017\uffed\020\uffed\021\uffed\023\uffed\024\uffed\025\uffed" +
    "\027\uffed\030\uffed\001\002\000\016\022\010\026\014\031" +
    "\004\032\007\033\017\034\005\001\002\000\004\034\uffee" +
    "\001\002\000\016\022\010\026\014\031\004\032\007\033" +
    "\017\034\005\001\002\000\022\012\042\013\053\014\051" +
    "\015\052\016\045\017\044\020\050\021\047\001\002\000" +
    "\036\002\ufffb\012\ufffb\013\ufffb\014\ufffb\015\ufffb\016\ufffb" +
    "\017\ufffb\020\ufffb\021\ufffb\023\ufffb\024\ufffb\025\ufffb\027" +
    "\ufffb\030\ufffb\001\002\000\014\002\041\024\026\025\030" +
    "\027\032\030\027\001\002\000\016\022\ufff4\026\ufff4\031" +
    "\ufff4\032\ufff4\033\ufff4\034\ufff4\001\002\000\004\034\005" +
    "\001\002\000\036\002\ufffa\012\ufffa\013\ufffa\014\ufffa\015" +
    "\ufffa\016\ufffa\017\ufffa\020\ufffa\021\ufffa\023\ufffa\024\ufffa" +
    "\025\ufffa\027\ufffa\030\ufffa\001\002\000\042\002\uffeb\007" +
    "\uffeb\011\uffeb\012\uffeb\013\uffeb\014\uffeb\015\uffeb\016\uffeb" +
    "\017\uffeb\020\uffeb\021\uffeb\023\uffeb\024\uffeb\025\uffeb\027" +
    "\uffeb\030\uffeb\001\002\000\004\006\021\001\002\000\004" +
    "\010\022\001\002\000\004\033\017\001\002\000\004\007" +
    "\024\001\002\000\016\022\010\026\014\031\004\032\007" +
    "\033\017\034\005\001\002\000\016\002\ufffd\023\ufffd\024" +
    "\026\025\030\027\032\030\027\001\002\000\016\022\ufff3" +
    "\026\ufff3\031\ufff3\032\ufff3\033\ufff3\034\ufff3\001\002\000" +
    "\016\022\ufff0\026\ufff0\031\ufff0\032\ufff0\033\ufff0\034\ufff0" +
    "\001\002\000\016\022\ufff2\026\ufff2\031\ufff2\032\ufff2\033" +
    "\ufff2\034\ufff2\001\002\000\016\022\010\026\014\031\004" +
    "\032\007\033\017\034\005\001\002\000\016\022\ufff1\026" +
    "\ufff1\031\ufff1\032\ufff1\033\ufff1\034\ufff1\001\002\000\016" +
    "\002\ufffe\023\ufffe\024\026\025\030\027\032\030\027\001" +
    "\002\000\004\007\035\001\002\000\004\007\036\001\002" +
    "\000\004\033\017\001\002\000\004\011\040\001\002\000" +
    "\004\007\uffec\001\002\000\004\002\001\001\002\000\010" +
    "\022\uffea\033\uffea\034\uffea\001\002\000\010\022\054\033" +
    "\017\034\005\001\002\000\010\022\ufff5\033\ufff5\034\ufff5" +
    "\001\002\000\010\022\uffe6\033\uffe6\034\uffe6\001\002\000" +
    "\010\022\054\033\017\034\005\001\002\000\010\022\ufff6" +
    "\033\ufff6\034\ufff6\001\002\000\010\022\ufff7\033\ufff7\034" +
    "\ufff7\001\002\000\010\022\uffe8\033\uffe8\034\uffe8\001\002" +
    "\000\010\022\uffe7\033\uffe7\034\uffe7\001\002\000\010\022" +
    "\uffe9\033\uffe9\034\uffe9\001\002\000\010\022\054\033\017" +
    "\034\005\001\002\000\030\002\000\012\042\013\053\014" +
    "\051\015\052\016\045\023\000\024\000\025\000\027\000" +
    "\030\000\001\002\000\016\012\042\013\053\014\051\015" +
    "\052\016\045\023\057\001\002\000\036\002\ufff8\012\ufff8" +
    "\013\ufff8\014\ufff8\015\ufff8\016\ufff8\017\ufff8\020\ufff8\021" +
    "\ufff8\023\ufff8\024\ufff8\025\ufff8\027\ufff8\030\ufff8\001\002" +
    "\000\036\002\ufff9\012\042\013\053\014\051\015\052\016" +
    "\045\017\ufff9\020\ufff9\021\ufff9\023\ufff9\024\ufff9\025\ufff9" +
    "\027\ufff9\030\ufff9\001\002\000\024\012\042\013\053\014" +
    "\051\015\052\016\045\017\044\020\050\021\047\023\057" +
    "\001\002\000\014\023\063\024\026\025\030\027\032\030" +
    "\027\001\002\000\016\002\ufffc\023\ufffc\024\ufffc\025\ufffc" +
    "\027\ufffc\030\ufffc\001\002\000\016\002\uffff\023\uffff\024" +
    "\026\025\030\027\032\030\027\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\062\000\016\003\012\004\010\006\005\010\014\013" +
    "\011\014\015\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\003\063\004\010\006\005\010\014\013\011\014" +
    "\015\001\001\000\002\001\001\000\016\003\061\004\060" +
    "\006\005\010\014\013\011\014\015\001\001\000\006\005" +
    "\045\012\042\001\001\000\002\001\001\000\004\007\030" +
    "\001\001\000\002\001\001\000\004\014\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\011\022\001\001\000\004\013\033\001\001\000\002\001" +
    "\001\000\016\003\024\004\010\006\005\010\014\013\011" +
    "\014\015\001\001\000\004\007\030\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\016\003\032" +
    "\004\010\006\005\010\014\013\011\014\015\001\001\000" +
    "\002\001\001\000\004\007\030\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\013\036\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\004\057\013\011\014\015\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\004\054\013\011\014\015" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\004\055" +
    "\013\011\014\015\001\001\000\004\012\042\001\001\000" +
    "\004\012\042\001\001\000\002\001\001\000\004\012\042" +
    "\001\001\000\006\005\045\012\042\001\001\000\004\007" +
    "\030\001\001\000\002\001\001\000\004\007\030\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // int_operator ::= T_MOD 
            {
              String RESULT = null;
		 RESULT = "mod"; 
              CUP$parser$result = new java_cup.runtime.Symbol(8/*int_operator*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // int_operator ::= T_DIVIDE 
            {
              String RESULT = null;
		 RESULT = "/"; 
              CUP$parser$result = new java_cup.runtime.Symbol(8/*int_operator*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // int_operator ::= T_TIMES 
            {
              String RESULT = null;
		 RESULT = "*"; 
              CUP$parser$result = new java_cup.runtime.Symbol(8/*int_operator*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // int_operator ::= T_MINUS 
            {
              String RESULT = null;
		 RESULT = "-"; 
              CUP$parser$result = new java_cup.runtime.Symbol(8/*int_operator*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // int_operator ::= T_PLUS 
            {
              String RESULT = null;
		 RESULT = "+"; 
              CUP$parser$result = new java_cup.runtime.Symbol(8/*int_operator*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // int ::= T_INT 
            {
              Int RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		TokenValue n = (TokenValue)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new Int(new Integer(n.toInt())); 
              CUP$parser$result = new java_cup.runtime.Symbol(9/*int*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // domain ::= T_LSQBRACE int T_DOT T_DOT int T_RSQBRACE 
            {
              Domain RESULT = null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Int n1 = (Int)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Int n2 = (Int)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Domain(n1, n2); 
              CUP$parser$result = new java_cup.runtime.Symbol(7/*domain*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // var ::= T_IDENTIFER 
            {
              Var RESULT = null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		TokenValue id = (TokenValue)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new Var(id.toString()); 
              CUP$parser$result = new java_cup.runtime.Symbol(10/*var*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // quantifier ::= T_EXISTS 
            {
              String RESULT = null;
		 RESULT = "exists"; 
              CUP$parser$result = new java_cup.runtime.Symbol(6/*quantifier*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // quantifier ::= T_FORALL 
            {
              String RESULT = null;
		 RESULT = "forall"; 
              CUP$parser$result = new java_cup.runtime.Symbol(6/*quantifier*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // binary_connective ::= T_EQUIV 
            {
              String RESULT = null;
		 RESULT = "<->"; 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*binary_connective*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // binary_connective ::= T_IMPLIES 
            {
              String RESULT = null;
		 RESULT = "->"; 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*binary_connective*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // binary_connective ::= T_OR 
            {
              String RESULT = null;
		 RESULT = "||"; 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*binary_connective*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // binary_connective ::= T_AND 
            {
              String RESULT = null;
		 RESULT = "&&"; 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*binary_connective*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // unary_connective ::= T_NOT 
            {
              String RESULT = null;
		 RESULT = "!"; 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*unary_connective*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // rel_operator ::= T_EQ 
            {
              String RESULT = null;
		 RESULT = "="; 
              CUP$parser$result = new java_cup.runtime.Symbol(3/*rel_operator*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // rel_operator ::= T_GREATEREQ 
            {
              String RESULT = null;
		 RESULT = ">="; 
              CUP$parser$result = new java_cup.runtime.Symbol(3/*rel_operator*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // rel_operator ::= T_GREATER 
            {
              String RESULT = null;
		 RESULT = ">"; 
              CUP$parser$result = new java_cup.runtime.Symbol(3/*rel_operator*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // exp ::= T_LPAREN exp T_RPAREN 
            {
              Exp RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*exp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // exp ::= exp int_operator exp 
            {
              Exp RESULT = null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String op = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new BinExp(op, e1, e2); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*exp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // exp ::= var 
            {
              Exp RESULT = null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Var v = (Var)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = v; 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*exp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // exp ::= int 
            {
              Exp RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Int n = (Int)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = n; 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*exp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // formula ::= T_LPAREN formula T_RPAREN 
            {
              Formula RESULT = null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Formula f = (Formula)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = f; 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*formula*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // formula ::= quantifier var T_COLON domain T_DOT formula 
            {
              Formula RESULT = null;
		int qleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int qright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String q = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Var v = (Var)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Domain d = (Domain)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Formula f = (Formula)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new Quantified(q, v, d, f); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*formula*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // formula ::= formula binary_connective formula 
            {
              Formula RESULT = null;
		int f1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int f1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Formula f1 = (Formula)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bcleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bcright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String bc = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int f2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int f2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Formula f2 = (Formula)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new Binary(bc, f1, f2); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*formula*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // formula ::= unary_connective formula 
            {
              Formula RESULT = null;
		int ucleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int ucright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String uc = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Formula f = (Formula)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new Unary(uc, f); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*formula*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // formula ::= exp rel_operator exp 
            {
              Formula RESULT = null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String r = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new Atomic(r, e1, e2); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*formula*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= formula EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Formula start_val = (Formula)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

