package myDemoApp;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals(App.toplam(array, 0,1),1);
    }

    @Test
    public void testFound2() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals(App.toplam(array, 0,4),10);
    }

    @Test
    public void testSonBaslangic() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals(App.toplam(array, 2,2),-1);
    }

    @Test
    public void test4() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals(App.toplam(array, 4,5),-1);
    }

    @Test
    public void test5() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals(App.toplam(array, 2,1),-1);
    }

    @Test
    public void test6() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals(App.toplam(array, 0,5),-1);
    }

    @Test
    public void testNull() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals(App.toplam(null, 0,5),-1);
    }

}