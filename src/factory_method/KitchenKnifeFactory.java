package factory_method;

public class KitchenKnifeFactory extends KnifeFactory {

	@Override
	public Knife createKnife(String s) {
		switch(s) {
		case "Steak Knife":
			return new SteakKnife();
		case "Butter Knife":
			return new ButterKnife();
		default:
			return null;
		}
	}
}
