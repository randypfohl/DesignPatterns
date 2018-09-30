package factory_method;

public class Main {

	public static void main(String[] args) {
		KitchenKnifeFactory factory = new KitchenKnifeFactory();
		factory.orderKnife(factory.createKnife("Steak Knife"));
		factory.orderKnife(factory.createKnife("Butter Knife"));
	}

}
