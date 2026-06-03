package TJasn.virtualMachine;

import TJasn.TJ;

public class WRITESTRINGinstr extends TwoOperandInstruction {

  void execute ()
  {
    for (int addr = firstOperand; addr <= secondOperand; addr++) {
      System.out.print((char)(TJ.data[addr]));
    }
  }

  public WRITESTRINGinstr (int startOffset, int endOffset)
  {
    super(startOffset, endOffset, "WRITESTRING");
  }
}

