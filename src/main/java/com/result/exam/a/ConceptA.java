package com.result.exam.a;

public class ConceptA extends Concept
{
    private final Concept parent;

    public ConceptA(String anId, Concept aParent) {
        super(anId);
        parent = aParent;
    }

    public Concept getParent(){
        return parent;
    }

    @Override
    public String toString(){
        return "ConceptA{" + getId() + ", parent=" + parent + "}"; //changed to "}" from '}' 
    }
}
