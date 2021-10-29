package src.test.main.java.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import src.main.java.strategy.WestHillsMall;

public class WestHillsMallTest {
   @Test 
   void testThatClentObjectCanBeCreated() {
      // given
      WestHillsMall mallMock = mock(WestHillsMall.class);
      // when
      when(mallMock.getID()).thenReturn("5634");
      // then
      assertEquals("5634", mallMock.getID());
   }
}
