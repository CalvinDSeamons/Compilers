import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.util.regex.Pattern;
//import org.antlr.v4.runtime.atn;




public class ANTLR{
  public static void main(String[] args) throws Exception{
    if(args[0] != null){
      CharStream cs = CharStreams.fromFileName(args[0]);  //load the file
      MicroLexer lexer = new MicroLexer(cs);  //instantiate a lexer
      CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
      MicroParser parser = new MicroParser(tokens);  //parse the tokens
	
      

      lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
      parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
      parser.program();

      ParseTree tree = parser.program();
      Mylistener listener = new Mylistener();
      ParseTreeWalker walker = new ParseTreeWalker();
      walker.walk(listener,tree);


      //ParseTree tree = new ParseTree();

      //Check for scope and vars//
      for(int i = 0; i>tokens.size();i++){
	//System.out.println(tokens.get(i).getText());
	if(tokens.get(i).getText().equals("PROGRAM")){
		System.out.print(tokens.get(i).getText()+ " ");
		System.out.println(tokens.get(i+1).getText());
	}
	else if(tokens.get(i).getText().equals("FUNCTION")){
		System.out.print(tokens.get(i).getText() + " ");
		System.out.println(tokens.get(i+2).getText());

	}
	else if(tokens.get(i).getText().equals("INT")){
		//this does not work atm </3
		System.out.print(tokens.get(i+1).getText() + " ");
		System.out.println(tokens.get(i+3).getText());

	}
	//System.out.println(tokens.getText());
      }


      int numErrors = parser.getNumberOfSyntaxErrors();
      if(numErrors == 0){
        System.out.println("Accepted " + numErrors);
      }
      else{
        System.out.println("Not Accepted " + numErrors);
      }
    

    }

    
	//MicroParser parser = new MicroParser(tokens);
 	//ParseTree tree = parser.program();
	//Mylistener listener = new Mylistener();
	//ParseTreeWalker walker = new ParseTreeWalker();
	//walker.walk(listener,tree);

  }



 

}

