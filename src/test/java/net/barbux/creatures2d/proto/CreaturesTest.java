package net.barbux.creatures2d.proto;

import net.barbux.creatures2d.proto.Creatures.Node;
import org.junit.Assert;
import org.junit.Test;

public class CreaturesTest {

  @Test
  public void getDefaultInstanceOutputNotNull1() {
    final Node actual = Node.getDefaultInstance();
    Assert.assertNotNull(actual);
    Assert.assertEquals(0.0, actual.getStartY(), 0.0);
    Assert.assertEquals(0.0, actual.getSize(), 0.0);
    Assert.assertEquals(0.0, actual.getStartX(), 0.0);
    Assert.assertEquals(0, actual.getNodeId());
    Assert.assertEquals(0.0, actual.getWeight(), 0.0);
  }
}
