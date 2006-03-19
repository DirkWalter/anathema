package net.sf.anathema.character.generic.impl.magic.persistence.writer.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

  public static Test suite() {
    TestSuite suite = new TestSuite("Test for net.sf.anathema.character.generic.impl.magic.persistence.writer.test"); //$NON-NLS-1$
    // $JUnit-BEGIN$
    suite.addTestSuite(SourceWriterTest.class);
    suite.addTestSuite(DurationWriterTest.class);
    suite.addTestSuite(HeadDataWriterTest.class);
    suite.addTestSuite(CharmTypeWriterTest.class);
    suite.addTestSuite(PrerequisiteWriterTest.class);
    suite.addTestSuite(CostWriterTest.class);
    // $JUnit-END$
    return suite;
  }

}
