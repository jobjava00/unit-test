package basic.singleton;

/**
 * Created by uienw on 2018-11-15.
 */
public enum EnumSingleton {
	INSTANCE;

	public static EnumSingleton getInstance(){
		return INSTANCE;
	}
}
