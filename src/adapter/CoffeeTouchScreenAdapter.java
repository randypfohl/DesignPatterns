package adapter;

	public class CoffeeTouchScreenAdapter implements ICoffeeMachine {

		OldCoffeeMachine theMachine;

		public CoffeeTouchScreenAdapter(OldCoffeeMachine newMachine) {
			this.theMachine = newMachine;
		}
		
		public void chooseFirstSelection() {
			this.theMachine.selectA();
		}
		
		public void chooseSecondSelection() {
			this.theMachine.selectB();
	}
	}