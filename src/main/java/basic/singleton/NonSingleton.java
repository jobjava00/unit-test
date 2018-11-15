package basic.singleton;

/**
 * Created by uienw on 2018-11-15.
 */
public class NonSingleton {
	private NonSingleton(){}

	public static NonSingleton getInstance(){
		return new NonSingleton();
	}
}
