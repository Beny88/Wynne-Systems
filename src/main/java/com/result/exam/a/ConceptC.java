package com.result.exam.a;

public class ConceptC extends ConceptA
{
    private static int nextSerialNo = 0;

    public static int getNextSerialNo() {
        return ++nextSerialNo; // original value of the operand is being returned prior to the operand being changed, so we have to increment it before
    }

    private final int serialNo;

    public ConceptC(String anId) {
        super(anId, null);
        serialNo = getNextSerialNo();
    }

    public int getSerialNo() {
        return serialNo;
    }

    @Override
    public String toString() {
        return "ConceptC(" + getId() + ", " + serialNo + ")";
    }
}
