package analysis;

import java_cup.runtime.Symbol;

%%
%cup
%class Scanner
%standalone

IntType = int
FloatType = float
EndCmd = ;
Att = [=]

SumOp = [+]
SubOp = [-]
OpenPar = [(]
ClosePar = [)]

Whitespace = [ \t]

Digit = [0-9]
Integer = {Digit}+
Float = {Integer}([.]{Integer})?

Id = [a-zA-Z_][a-zA-Z0-9_]*

NextLine = [\r]?[\n]

%%

<YYINITIAL> {

    {IntType} 			{ return new Symbol(Sym.IntType); }
    {FloatType} 		{ return new Symbol(Sym.FloatType); }
    {EndCmd} 			{ return new Symbol(Sym.EndCmd); }
    {Att} 			    { return new Symbol(Sym.Att); }
    
    {SumOp} 			{ return new Symbol(Sym.SumOp); }
    {SubOp} 			{ return new Symbol(Sym.SubOp); }
    {OpenPar} 			{ return new Symbol(Sym.OpenPar); }
    {ClosePar} 			{ return new Symbol(Sym.ClosePar); }

	{Integer} 			{ return new Symbol(Sym.Integer, Integer.parseInt(yytext())); }
    {Float} 			{ return new Symbol(Sym.Float, Double.parseDouble(yytext())); }
    {Id} 			    { return new Symbol(Sym.Id, yytext()); }

	{Whitespace}	    { }
    
    {NextLine}          { }

}

<<EOF>> { return new Symbol( Sym.EOF ); }


[^] { throw new Error("Illegal character: "+yytext()+" at line "+(yyline+1)+", column "+(yycolumn+1) ); }







