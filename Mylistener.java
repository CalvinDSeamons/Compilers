public class Mylistener extends MicroBaseListener{
	@Override public void enterProgram(MicroParser.ProgramContext ctx){
		System.out.println("Rule: " + ctx.getText());
	}



}
