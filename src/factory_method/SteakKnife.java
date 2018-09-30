package factory_method;

public class SteakKnife extends Knife {

	@Override
	public void sharpenKnife() {
		System.out.println("Steak Knife Sharpened");		
	}

	@Override
	public void polishKnife() {
		System.out.println("Steak Knife Polished");
	}

	@Override
	public void orderKnife() {
		System.out.println("Steak Knife Ordered");
	}

}
