package analysis;

import java.io.FileReader;
import java.nio.file.Paths;

import java_cup.runtime.Symbol;

public class Main {

	public static void main(String[] args) {
		String rootPath = Paths.get("").toAbsolutePath().toString();
		
        String sourceCode = rootPath + "\\src.txt";

        try {
        	Scanner scanner = new Scanner(new FileReader(sourceCode));
            Parser p = new Parser(scanner);
            p.parse();

            System.out.println("Compilacao concluida com sucesso...");
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
	}
}
