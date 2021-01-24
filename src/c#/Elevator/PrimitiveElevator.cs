using System;
namespace Elevator.domain {
    public class PrimitiveElevator {
		private bool DoorOpen = false;
		private int CurrentFloor = 1;
		private int Weight = 0;

		private readonly int CAPACITY = 1000;
		private readonly int TOP_FLOOR = 5;
		private readonly int BOTTOM_FLOOR = 1;

		public void OpenDoor() {
			if (!DoorOpen)
				DoorOpen = true;
			else
				Console.WriteLine("Door already open.");
		}

		public void CloseDoor() {
			CalculateCapacity();

			if (Weight <= CAPACITY) {
				DoorOpen = false;
			}
			else {
				Console.WriteLine("The elevator has exceeded capacity.");
				Console.WriteLine("Doors will remain open until someone exits!");
			}
		}

		// In reality, the elevator would have weight sensors to
		// check the actual weight in the elevator, but for the sake
		// of simplicity we just pick a random number to represent the
		// weight in the elevator

		private void CalculateCapacity() {
			Weight = 1500;
			Console.WriteLine("The weight is " + Weight);
		}

		public void GoUp() {
			if (!DoorOpen) {
				if (CurrentFloor < TOP_FLOOR) {
					CurrentFloor++;
					Console.WriteLine("Current floor: " + CurrentFloor);
				}
				else
					Console.WriteLine("Already on top floor.");
			}
			else
				Console.WriteLine("Doors still open!");
		}

		public void GoDown() {
			if (!DoorOpen) {
				if (CurrentFloor > BOTTOM_FLOOR) {
					CurrentFloor--;
					Console.WriteLine("Current floor: " + CurrentFloor);
				}
				else
					Console.WriteLine("Already on bottom floor.");
			}
			else
				Console.WriteLine("Doors still open!");
		}

		public void Go(int desiredFloor) {
			if ((desiredFloor >= BOTTOM_FLOOR) && (desiredFloor <= TOP_FLOOR)) {

				while (CurrentFloor != desiredFloor) {
					if (CurrentFloor < desiredFloor)
						GoUp();
					else
						GoDown();
				}
			}
			else
				Console.WriteLine("Invalid Floor");
		}

		public int GetFloor() {
			return CurrentFloor;
		}

		public bool GetDoorStatus() {
			return DoorOpen;
		}
	}
}
