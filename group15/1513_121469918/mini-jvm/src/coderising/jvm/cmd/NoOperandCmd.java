package coderising.jvm.cmd;

import coderising.jvm.clz.ClassFile;
import coderising.jvm.constant.ConstantPool;

public class NoOperandCmd extends ByteCodeCommand{

	public NoOperandCmd(ClassFile clzFile, String opCode) {
		super(clzFile, opCode);
	}

	@Override
	public String toString(ConstantPool pool) {
		return this.getOffset()+":" +this.getOpCode() + " "+ this.getReadableCodeText();
	}

	
	
	public  int getLength(){
		return 1;
	}

}
