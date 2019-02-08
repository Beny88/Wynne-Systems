package com.result.exam.a;

public class ConceptC extends ConceptA
{
    private static int nextSerialNo = 0;

    public static int getNextSerialNo()
    {
        return nextSerialNo++;
    }

    private final int serialNo;

    public ConceptC( String anId )
    {
        super( anId, null );

        serialNo = getNextSerialNo();
    }

    public int getSerialNo()
    {
        return serialNo;
    }

    @Override
    public String toString()
    {
        return "ConceptC(" + getId() + ", " + serialNo + ")";
    }
}
