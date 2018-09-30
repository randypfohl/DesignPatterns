
package factory_method;

public abstract class KnifeFactory {

	public void orderKnife(Knife knife) {
		knife.sharpenKnife();
		knife.polishKnife();
		knife.orderKnife();
	}
	
	public abstract Knife createKnife(String s);
}
