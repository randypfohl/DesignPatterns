package adapter;

public class Main {

	public static void main(String[] args) {

		CoffeeTouchScreenAdapter touchScreen = new CoffeeTouchScreenAdapter(new OldCoffeeMachine());
		touchScreen.chooseFirstSelection();
		touchScreen.chooseSecondSelection();
	}

}
