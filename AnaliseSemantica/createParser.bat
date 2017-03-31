java -jar .\lib\java-cup-11b.jar -parser Parser -symbols Sym .\lib\gramatica.cup
move /y .\Parser.java .\src\analysis\Parser.java
move /y .\Sym.java .\src\analysis\Sym.java
pause