package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class JUMPONFALSEinstr extends OneOperandInstruction {

  void execute ()
  {
    if (EXPRSTACK[--ESP] == 0) {
      PC = this.operand; // jump only if false
    }
  }

  public JUMPONFALSEinstr (int address)
  {
    super(address, "JUMPONFALSE");
  }
}

