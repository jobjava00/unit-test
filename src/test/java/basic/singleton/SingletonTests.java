package basic.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by uienw on 2018-11-15.
 */
public class SingletonTests {

	@Test
	public void testEnumSingletonInstance_equals(){
		EnumSingleton origin = EnumSingleton.getInstance();
		EnumSingleton target = EnumSingleton.getInstance();
		assertEquals("EnumSingleton 인스턴스가 동일한지 확인", origin.hashCode(), target.hashCode());
	}

	@Test
	public void testLazyHolderSingletonInstance_equals(){
		LazyHolderSingleton origin = LazyHolderSingleton.getInstance();
		LazyHolderSingleton target = LazyHolderSingleton.getInstance();
		assertEquals("LazyHolderSingleton 인스턴스가 동일한지 확인", origin.hashCode(), target.hashCode());
	}

	@Test
	public void testNonSingletonInstance_not_equals(){
		NonSingleton origin = NonSingleton.getInstance();
		NonSingleton target = NonSingleton.getInstance();
		assertNotEquals("NonSingleton 인스턴스가 동일하지 않은지 확인", origin.hashCode(), target.hashCode());
	}
}
