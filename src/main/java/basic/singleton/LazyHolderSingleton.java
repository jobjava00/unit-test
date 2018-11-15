package basic.singleton;

/**
 * Created by uienw on 2018-11-15.
 */
public class LazyHolderSingleton {
	private LazyHolderSingleton() {}

	public static LazyHolderSingleton getInstance(){
		return LazyHolder.INSTANCE;
	}

	private static class LazyHolder {
		private static final LazyHolderSingleton INSTANCE = new LazyHolderSingleton();
	}
}
