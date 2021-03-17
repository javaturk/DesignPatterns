using System;
using Elevator.Domain;

namespace Elevator {
    public class GetterSetterElevatorTest {
		private static GetterSetterElevator GetterSetterElevator = new GetterSetterElevator();

		public static void Main(string[] args) {
			Console.WriteLine("GetterSetterElevatorTest");
			//		privElevator.doorOpen = true; // passengers get on
			GetterSetterElevator.DoorOpen = true;
			//		privElevator.doorOpen = false; // doors close
			// go down to currentFloor 0 (below bottom of building)
			GetterSetterElevator.DoorOpen = false;
			//		privElevator.currentFloor--;
			GetterSetterElevator.CurrentFloor = GetterSetterElevator.CurrentFloor + 1;
			//		privElevator.currentFloor++;

			// jump to currentFloor 7 (only 5 floors in building)
			//		privElevator.currentFloor = 7;
			GetterSetterElevator.CurrentFloor = 7;
			//		privElevator.doorOpen = true; // passengers get on/off
			GetterSetterElevator.DoorOpen = true;
			//		privElevator.doorOpen = false;
			GetterSetterElevator.DoorOpen = false;
			//		privElevator.currentFloor = 1; // go to the first floor
			GetterSetterElevator.CurrentFloor = 1;
			//		privElevator.doorOpen = true; // passengers get on/off
			GetterSetterElevator.DoorOpen = true;
			//		privElevator.currentFloor++; // elevator moves with door open
			GetterSetterElevator.CurrentFloor = GetterSetterElevator.CurrentFloor + 1;
			//		privElevator.doorOpen = false;
			GetterSetterElevator.DoorOpen = false;
			//		privElevator.currentFloor--;
			GetterSetterElevator.CurrentFloor = GetterSetterElevator.CurrentFloor - 1;
			//		privElevator.currentFloor--;
			GetterSetterElevator.CurrentFloor = GetterSetterElevator.CurrentFloor - 1;
		}
	}
}
