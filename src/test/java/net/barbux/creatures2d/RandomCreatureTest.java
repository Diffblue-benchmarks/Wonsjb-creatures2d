package net.barbux.creatures2d;

import static org.mockito.Matchers.anyInt;

import net.barbux.creatures2d.Creature.Bone;
import net.barbux.creatures2d.Creature.Muscle;
import net.barbux.creatures2d.RandomCreature.PairOfNode;
import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import java.util.Collections;
import java.util.Random;

public class RandomCreatureTest {

  @Test
  public void constructorInputPositivePositiveOutputNotNull() {
    final PairOfNode actual = new PairOfNode(2, 2);
    Assert.assertNotNull(actual);
    Assert.assertEquals(2, actual.node2);
    Assert.assertEquals(2, actual.node1);
  }

  @PrepareForTest({RandomCreature.class, Collections.class, Random.class})
  @Test
  public void constructorInputNotNullOutputVoid() throws Exception {
    PowerMockito.mockStatic(Collections.class);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(0);
    PowerMockito.when(random.nextDouble())
        .thenReturn(0.25)
        .thenReturn(0x1.000184313988cp-239 /* 1.13199e-72 */)
        .thenReturn(0x1p-64 /* 5.42101e-20 */)
        .thenReturn(0x1.a8p-1022 /* 3.68528e-308 */)
        .thenReturn(0x1.8003f403f7fp-320 /* 7.0228e-97 */)
        .thenReturn(0x1.0027fffffffffp-1021 /* 4.45286e-308 */)
        .thenReturn(0x1.999999999999bp-3 /* 0.2 */)
        .thenReturn(0.2)
        .thenReturn(0x1.7cp-58 /* 5.14996e-18 */)
        .thenReturn(0x0.50042a853303p-1022 /* 6.95477e-309 */);
    final RandomCreature actual = new RandomCreature(random);
    Assert.assertNotNull(actual.allBones);
    Assert.assertEquals(1, actual.allBones.size());
    Assert.assertNotNull(actual.allBones.get(0));
    Assert.assertNotNull(((Bone)actual.allBones.get(0)).color);
    Assert.assertEquals(0.25, ((Bone)actual.allBones.get(0)).length, 0.0);
    Assert.assertEquals(0.0, ((Bone)actual.allBones.get(0)).expectedLength, 0.0);
    Assert.assertNotNull(((Bone)actual.allBones.get(0)).node1);
    Assert.assertNotNull(((Bone)actual.allBones.get(0)).node1.originalPos);
    Assert.assertEquals(0x1.000184313988cp-239 /* 1.13199e-72 */,
                        ((Bone)actual.allBones.get(0)).node1.originalPos.y, 0.0);
    Assert.assertEquals(0.25, ((Bone)actual.allBones.get(0)).node1.originalPos.x, 0.0);
    Assert.assertEquals(0, ((Bone)actual.allBones.get(0)).node1.nodeId);
    Assert.assertNotNull(((Bone)actual.allBones.get(0)).node1.color);
    Assert.assertNotNull(((Bone)actual.allBones.get(0)).node1.v);
    Assert.assertEquals(0.0, ((Bone)actual.allBones.get(0)).node1.v.y, 0.0);
    Assert.assertEquals(0.0, ((Bone)actual.allBones.get(0)).node1.v.x, 0.0);
    Assert.assertEquals(1.0, ((Bone)actual.allBones.get(0)).node1.weight, 0.0);
    Assert.assertEquals(0.05, ((Bone)actual.allBones.get(0)).node1.size, 0.0);
    Assert.assertNotNull(((Bone)actual.allBones.get(0)).node1.p);
    Assert.assertEquals(0x1.000184313988cp-239 /* 1.13199e-72 */,
                        ((Bone)actual.allBones.get(0)).node1.p.y, 0.0);
    Assert.assertEquals(0.25, ((Bone)actual.allBones.get(0)).node1.p.x, 0.0);
    Assert.assertNotNull(((Bone)actual.allBones.get(0)).node2);
    Assert.assertNotNull(((Bone)actual.allBones.get(0)).node2.originalPos);
    Assert.assertEquals(0x1.a8p-1022 /* 3.68528e-308 */,
                        ((Bone)actual.allBones.get(0)).node2.originalPos.y, 0.0);
    Assert.assertEquals(0x1p-64 /* 5.42101e-20 */, ((Bone)actual.allBones.get(0)).node2.originalPos.x,
                        0.0);
    Assert.assertEquals(1, ((Bone)actual.allBones.get(0)).node2.nodeId);
    Assert.assertNotNull(((Bone)actual.allBones.get(0)).node2.color);
    Assert.assertNotNull(((Bone)actual.allBones.get(0)).node2.v);
    Assert.assertEquals(0.0, ((Bone)actual.allBones.get(0)).node2.v.y, 0.0);
    Assert.assertEquals(0.0, ((Bone)actual.allBones.get(0)).node2.v.x, 0.0);
    Assert.assertEquals(1.0, ((Bone)actual.allBones.get(0)).node2.weight, 0.0);
    Assert.assertEquals(0.05, ((Bone)actual.allBones.get(0)).node2.size, 0.0);
    Assert.assertNotNull(((Bone)actual.allBones.get(0)).node2.p);
    Assert.assertEquals(0x1.a8p-1022 /* 3.68528e-308 */, ((Bone)actual.allBones.get(0)).node2.p.y,
                        0.0);
    Assert.assertEquals(0x1p-64 /* 5.42101e-20 */, ((Bone)actual.allBones.get(0)).node2.p.x, 0.0);
    Assert.assertNotNull(actual.allNodes);
    Assert.assertNotNull(actual.allMuscles);
    Assert.assertEquals(1, actual.allMuscles.size());
    Assert.assertNotNull(actual.allMuscles.get(0));
    Assert.assertEquals(250.0, ((Muscle)actual.allMuscles.get(0)).power, 0.0);
    Assert.assertEquals(0x1.e8p-61 /* 8.26704e-19 */, ((Muscle)actual.allMuscles.get(0)).maxLength,
                        0.0);
    Assert.assertEquals(0.2, ((Muscle)actual.allMuscles.get(0)).period, 0.0);
    Assert.assertEquals(-0.0, ((Muscle)actual.allMuscles.get(0)).minLength, 0.0);
    Assert.assertEquals(0.0, ((Muscle)actual.allMuscles.get(0)).expectedLength, 0.0);
    Assert.assertEquals(((Bone)actual.allBones.get(0)).node2,
                        ((Muscle)actual.allMuscles.get(0)).node1);
    Assert.assertNotNull(((Muscle)actual.allMuscles.get(0)).node2);
    Assert.assertNotNull(((Muscle)actual.allMuscles.get(0)).node2.originalPos);
    Assert.assertEquals(0x1.0027fffffffffp-1021 /* 4.45286e-308 */,
                        ((Muscle)actual.allMuscles.get(0)).node2.originalPos.y, 0.0);
    Assert.assertEquals(0x1.8003f403f7fp-320 /* 7.0228e-97 */,
                        ((Muscle)actual.allMuscles.get(0)).node2.originalPos.x, 0.0);
    Assert.assertEquals(2, ((Muscle)actual.allMuscles.get(0)).node2.nodeId);
    Assert.assertNotNull(((Muscle)actual.allMuscles.get(0)).node2.color);
    Assert.assertNotNull(((Muscle)actual.allMuscles.get(0)).node2.v);
    Assert.assertEquals(0.0, ((Muscle)actual.allMuscles.get(0)).node2.v.y, 0.0);
    Assert.assertEquals(0.0, ((Muscle)actual.allMuscles.get(0)).node2.v.x, 0.0);
    Assert.assertEquals(1.0, ((Muscle)actual.allMuscles.get(0)).node2.weight, 0.0);
    Assert.assertEquals(0.05, ((Muscle)actual.allMuscles.get(0)).node2.size, 0.0);
    Assert.assertNotNull(((Muscle)actual.allMuscles.get(0)).node2.p);
    Assert.assertEquals(0x1.0027fffffffffp-1021 /* 4.45286e-308 */,
                        ((Muscle)actual.allMuscles.get(0)).node2.p.y, 0.0);
    Assert.assertEquals(0x1.8003f403f7fp-320 /* 7.0228e-97 */,
                        ((Muscle)actual.allMuscles.get(0)).node2.p.x, 0.0);
  }
}
