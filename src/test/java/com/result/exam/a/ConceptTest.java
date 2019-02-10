package com.result.exam.a;

import org.junit.Assert;
import org.junit.Test;


public class ConceptTest {

    @Test
    public void ConceptATests(){
        String anId = "qwerty";
        Concept aParent = null;
        String id = "tomek";
        ConceptA conceptA = new ConceptA(anId, aParent);

        String toString = conceptA.toString();

        Assert.assertEquals("ConceptA{" + anId + ", parent=" + aParent + '}', toString);
        Assert.assertEquals(null, conceptA.getParent());
        Assert.assertEquals(anId, conceptA.getId());

        conceptA.setId(id);

        Assert.assertEquals(id, conceptA.getId());

    }

    @Test
    public void ConceptCTests(){

        Assert.assertEquals(1,ConceptC.getNextSerialNo());
        Assert.assertEquals(2,ConceptC.getNextSerialNo());
        String anId = "qwerty";
        ConceptC conceptC = new ConceptC(anId);
        Assert.assertEquals(3, conceptC.getSerialNo());
        String toString = conceptC.toString();

        Assert.assertEquals("ConceptC(" + anId + ", " + 3 + ")",toString);
    }
    @Test
    public void ConceptBTests(){
        String anId = "qwerty";
        Concept aParent = null;
        ConceptB conceptB = new ConceptB(anId, aParent);
        Assert.assertEquals(0, conceptB.getCount());

        ConceptB concept1 = new ConceptB("asdas", null);
        conceptB.addChild(concept1);

        Assert.assertEquals(1,conceptB.getCount());

        conceptB.removeChild(concept1);
        Assert.assertEquals(0,conceptB.getCount());

        conceptB.addChild(concept1);
        Assert.assertEquals (1, conceptB.getFamilySize());

        ConceptB concept2 = new ConceptB("asdas", null);
        concept1.addChild(concept2);
        Assert.assertEquals (2, conceptB.getFamilySize());

        Assert.assertEquals(0, conceptB.getAncestorCount());

        ConceptB children = new ConceptB("asdas", conceptB);
        Assert.assertEquals(1, children.getAncestorCount());


        ConceptA conceptA2 = new ConceptA("asdas", null);
        ConceptA conceptA = new ConceptA("asdas", conceptA2);
        ConceptB children2 = new ConceptB("asdas", conceptA);
        Assert.assertEquals(2, children2.getAncestorCount());

        String toString = conceptB.toString();
        Assert.assertEquals("ConceptB{" + "qwerty" + ", parent=" + null + ", children=" + 1 + "}", toString);
    }
}
