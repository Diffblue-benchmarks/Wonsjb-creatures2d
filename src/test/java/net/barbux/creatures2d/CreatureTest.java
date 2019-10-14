package net.barbux.creatures2d;

import net.barbux.creatures2d.Geometry.Vector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

public class CreatureTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void addInputNotNullOutputTrue() {
    final Creature creature = new Creature();
    final Creature.NodeList creatureNodeList = creature.new NodeList();
    final Creature.Node node = new Creature.Node(2.0, 2.0);
    Assert.assertTrue(creatureNodeList.add(node));
  }

  @Test
  public void cloneOutputNotNull() {
    final Creature creature = new Creature();
    final Creature actual = creature.clone();
    Assert.assertNotNull(actual);
    final ArrayList<Creature.Bone> arrayList = new ArrayList<Creature.Bone>();
    Assert.assertEquals(arrayList, actual.allBones);
    Assert.assertNotNull(actual.allNodes);
    Assert.assertNull(actual.physics);
    Assert.assertEquals(0.0, actual.maxReached, 0.0);
    final ArrayList<Creature.Muscle> arrayList1 = new ArrayList<Creature.Muscle>();
    Assert.assertEquals(arrayList1, actual.allMuscles);
    Assert.assertEquals(0, actual.creatureId);
  }

  @Test
  public void getCenterOutputNotNull() {
    final Creature creature = new Creature();
    final Vector actual = creature.getCenter();
    Assert.assertNotNull(actual);
    Assert.assertEquals(0x1.fffffffffffffp+1022 /* 8.98847e+307 */, actual.y, 0.0);
    Assert.assertEquals(0x1.fffffffffffffp+1022 /* 8.98847e+307 */, actual.x, 0.0);
  }

  @Test
  public void getFitnessOutputZero() {
    final Creature creature = new Creature();
    Assert.assertEquals(0.0, creature.getFitness(), 0.0);
  }

  @Test
  public void getInputPositiveOutputIndexOutOfBoundsException() {
    final Creature creature = new Creature();
    final Creature.NodeList creatureNodeList = creature.new NodeList();
    thrown.expect(IndexOutOfBoundsException.class);
    creatureNodeList.get(3);
  }

  @Test
  public void removeInputPositiveOutputIndexOutOfBoundsException() {
    final Creature creature = new Creature();
    final Creature.NodeList creatureNodeList = creature.new NodeList();
    thrown.expect(IndexOutOfBoundsException.class);
    creatureNodeList.remove(2);
  }

  @Test
  public void sizeOutputZero() {
    final Creature creature = new Creature();
    final Creature.NodeList creatureNodeList = creature.new NodeList();
    Assert.assertEquals(0, creatureNodeList.size());
  }

  @Test
  public void cloneOutputNotNull1() {
    final Creature.Node thisObj = new Creature.Node(0.05, 0.05);
    final Creature.Node actual = thisObj.clone();
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.p);
    Assert.assertEquals(0.05, actual.p.x, 0.0);
    Assert.assertEquals(0.05, actual.p.y, 0.0);
    Assert.assertNotNull(actual.v);
    Assert.assertEquals(0.0, actual.v.x, 0.0);
    Assert.assertEquals(0.0, actual.v.y, 0.0);
    Assert.assertNotNull(actual.originalPos);
    Assert.assertEquals(0.05, actual.originalPos.x, 0.0);
    Assert.assertEquals(0.05, actual.originalPos.y, 0.0);
    Assert.assertEquals(0.05, actual.size, 0.0);
    Assert.assertNotNull(actual.color);
    Assert.assertEquals(1.0, actual.weight, 0.0);
    Assert.assertEquals(0, actual.nodeId);
  }

  @Test
  public void cloneOutputNotNull2() {
    final Creature.Node creature$Node = new Creature.Node(1.0, 1.0);
    final Creature.Node creature$Node1 = new Creature.Node(1.0, 1.0);
    final Creature.Bone thisObj = new Creature.Bone(creature$Node, creature$Node1);
    final Creature.Bone actual = thisObj.clone();
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.color);
    Assert.assertEquals(0.0, actual.length, 0.0);
    Assert.assertNotNull(actual.node1);
    Assert.assertNotNull(actual.node1.p);
    Assert.assertEquals(1.0, actual.node1.p.x, 0.0);
    Assert.assertEquals(1.0, actual.node1.p.y, 0.0);
    Assert.assertNotNull(actual.node1.v);
    Assert.assertEquals(0.0, actual.node1.v.x, 0.0);
    Assert.assertEquals(0.0, actual.node1.v.y, 0.0);
    Assert.assertNotNull(actual.node1.originalPos);
    Assert.assertEquals(1.0, actual.node1.originalPos.x, 0.0);
    Assert.assertEquals(1.0, actual.node1.originalPos.y, 0.0);
    Assert.assertEquals(0.05, actual.node1.size, 0.0);
    Assert.assertNotNull(actual.node1.color);
    Assert.assertEquals(1.0, actual.node1.weight, 0.0);
    Assert.assertEquals(0, actual.node1.nodeId);
    Assert.assertNotNull(actual.node2);
    Assert.assertNotNull(actual.node2.p);
    Assert.assertEquals(1.0, actual.node2.p.x, 0.0);
    Assert.assertEquals(1.0, actual.node2.p.y, 0.0);
    Assert.assertNotNull(actual.node2.v);
    Assert.assertEquals(0.0, actual.node2.v.x, 0.0);
    Assert.assertEquals(0.0, actual.node2.v.y, 0.0);
    Assert.assertNotNull(actual.node2.originalPos);
    Assert.assertEquals(1.0, actual.node2.originalPos.x, 0.0);
    Assert.assertEquals(1.0, actual.node2.originalPos.y, 0.0);
    Assert.assertEquals(0.05, actual.node2.size, 0.0);
    Assert.assertEquals(actual.node1.color, actual.node2.color);
    Assert.assertEquals(1.0, actual.node2.weight, 0.0);
    Assert.assertEquals(0, actual.node2.nodeId);
    Assert.assertEquals(0.0, actual.expectedLength, 0.0);
  }

  @Test
  public void setExpectedLengthInputPositiveOutputVoid() {
    final Creature.Node creature$Node = new Creature.Node(0.5, 0.5);
    final Creature.Node creature$Node1 = new Creature.Node(0.5, 0.5);
    final Creature.Muscle thisObj = new Creature.Muscle(creature$Node, creature$Node1, 0.5, 0.5, 0.5);
    final double arg0 = 0.5;
    thisObj.setExpectedLength(arg0);
    Assert.assertEquals(-0x1.1a62633145c07p-55 /* -3.06162e-17 */, thisObj.expectedLength, 0.0);
  }
}
