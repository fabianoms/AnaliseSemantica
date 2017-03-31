
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analysis;

import java_cup.runtime.*;
import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Deque;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\003\002\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\010\004\000\002\005\005\000" +
    "\002\006\005\000\002\007\003\000\002\007\003\000\002" +
    "\011\003\000\002\012\004\000\002\013\005\000\002\013" +
    "\002\000\002\014\003\000\002\014\003\000\002\014\005" +
    "\000\002\015\003\000\002\015\003\000\002\016\003\000" +
    "\002\016\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\012\002\ufffe\004\005\005\012\016\006\001" +
    "\002\000\004\006\ufffb\001\002\000\004\016\ufff7\001\002" +
    "\000\004\007\043\001\002\000\006\006\ufffd\007\022\001" +
    "\002\000\004\002\000\001\002\000\004\016\021\001\002" +
    "\000\004\016\ufff6\001\002\000\004\006\017\001\002\000" +
    "\004\002\016\001\002\000\004\006\ufffc\001\002\000\004" +
    "\002\001\001\002\000\012\002\ufffe\004\005\005\012\016" +
    "\006\001\002\000\004\002\uffff\001\002\000\006\006\ufffa" +
    "\007\ufffa\001\002\000\012\012\032\014\026\015\027\016" +
    "\023\001\002\000\012\006\ufff0\010\ufff0\011\ufff0\013\ufff0" +
    "\001\002\000\004\006\ufff8\001\002\000\012\006\ufff2\010" +
    "\037\011\036\013\ufff2\001\002\000\012\006\uffee\010\uffee" +
    "\011\uffee\013\uffee\001\002\000\012\006\uffed\010\uffed\011" +
    "\uffed\013\uffed\001\002\000\004\006\ufff5\001\002\000\012" +
    "\006\ufff1\010\ufff1\011\ufff1\013\ufff1\001\002\000\012\012" +
    "\032\014\026\015\027\016\023\001\002\000\004\013\034" +
    "\001\002\000\012\006\uffef\010\uffef\011\uffef\013\uffef\001" +
    "\002\000\012\012\032\014\026\015\027\016\023\001\002" +
    "\000\012\012\uffeb\014\uffeb\015\uffeb\016\uffeb\001\002\000" +
    "\012\012\uffec\014\uffec\015\uffec\016\uffec\001\002\000\006" +
    "\006\ufff4\013\ufff4\001\002\000\012\006\ufff2\010\037\011" +
    "\036\013\ufff2\001\002\000\006\006\ufff3\013\ufff3\001\002" +
    "\000\012\012\032\014\026\015\027\016\023\001\002\000" +
    "\004\006\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\020\002\013\003\007\004\012\005\014\006" +
    "\003\007\010\010\006\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\016\003\017\004\012\005\014\006\003\007\010\010\006" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\011" +
    "\023\012\027\014\024\015\030\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\013\037\016\034\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\012\032\014\024\015\030\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\014\040\015\030" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\013\041\016\034\001\001\000\002\001\001" +
    "\000\012\011\043\012\027\014\024\015\030\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
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
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {


	Map<String,Integer> ts = new HashMap<String,Integer>();
	Deque<Integer> pTipos = new LinkedList<Integer>();
	
	public void asVarCheck(String ident) throws Exception {
		if(ts.containsKey(ident)) {
			throw new Exception("Vari�vel \"" + ident + "\" j� declarada");
		} else {
			Integer t = asUnstackType();
			ts.put(ident, t);
			System.out.println("ID <" + ident + "," + Sym.terminalNames[t] + "> adicionado � tabela de s�mbolos");
		}
	}
	
	public void asStackUpType(Integer varType) {
		pTipos.addFirst(varType);
		System.out.println("Tipo empilhado: " + Sym.terminalNames[varType]);
	}
	
	public Integer asUnstackType() throws Exception {
		if (pTipos.isEmpty()) {
			throw new Exception("Tipo n�o encontrado");
		}
		return pTipos.removeFirst();
	}

  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INIT EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INIT ::= COMMANDS 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INIT",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // COMMANDS ::= CMD EndCmd COMMANDS 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COMMANDS",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // COMMANDS ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("COMMANDS",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CMD ::= DEC_CMD 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CMD",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CMD ::= ATT_CMD 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CMD",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CMD ::= DEC_ATT_CMD 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("CMD",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DEC_CMD ::= TYPE Id 
            {
              Object RESULT =null;
		int identleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int identright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object ident = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				asVarCheck((String)ident);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("DEC_CMD",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // ATT_CMD ::= Id Att EXPRESSION 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ATT_CMD",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DEC_ATT_CMD ::= DEC_CMD Att EXPRESSION 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("DEC_ATT_CMD",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // TYPE ::= IntType 
            {
              Object RESULT =null;
		
		 	asStackUpType(Sym.IntType);
		 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TYPE",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TYPE ::= FloatType 
            {
              Object RESULT =null;
		int floatTypeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int floatTyperight = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object floatType = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
		 	asStackUpType(Sym.FloatType);
		 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("TYPE",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // EXPRESSION ::= ARITHMETIC_EXP 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXPRESSION",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // ARITHMETIC_EXP ::= FACTOR ARITHM_EXP 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ARITHMETIC_EXP",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // ARITHM_EXP ::= SUM_SUB_OP FACTOR ARITHM_EXP 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ARITHM_EXP",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ARITHM_EXP ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ARITHM_EXP",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // FACTOR ::= NUMBER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FACTOR",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // FACTOR ::= Id 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FACTOR",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // FACTOR ::= OpenPar ARITHMETIC_EXP ClosePar 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("FACTOR",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // NUMBER ::= Integer 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NUMBER",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // NUMBER ::= Float 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NUMBER",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SUM_SUB_OP ::= SumOp 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SUM_SUB_OP",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // SUM_SUB_OP ::= SubOp 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SUM_SUB_OP",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
