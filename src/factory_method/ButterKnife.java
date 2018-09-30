package factory_method;

public class ButterKnife extends Knife {

	@Override
	public void sharpenKnife() {
		System.out.println("Butter Knife Dulled");
	}

	@Override
	public void polishKnife() {
		System.out.println("Butter Knife Polished");
	}

	@Override
	public void orderKnife() {
		System.out.println("Butter Knife Ordered");
	}

}
