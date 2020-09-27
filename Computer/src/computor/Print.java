package src.computor;

import src.words.*;

public class Print implements Instruction {
	private Operand a;
	public Print(Operand a) {
		this.a = a;
	}
	
	public void execute(Memory m, InstructionPointer p) {
		System.out.println(a.getWord(m));
		
	}
	
	@Override
	public String toString() {
		return "Print " + a.toString();
	}

}
