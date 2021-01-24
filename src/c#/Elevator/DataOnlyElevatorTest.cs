using System;

namespace Elevator {
	public class DataOnlyElevatorTest {
		private static DataOnlyElevator PublicElevator = new DataOnlyElevator();

		public static void Main(string[] args) {

			PrintElevatorState();
			PublicElevator.doorOpen = true; // passengers get on

			PublicElevator.doorOpen = false; // doors closed
			PrintElevatorState();
			// go down to currentFloor 0 (below bottom of building)
			PublicElevator.currentFloor--;
			PublicElevator.currentFloor++;

			// jump to currentFloor 7 (only 5 floors in building)
			PublicElevator.currentFloor = 7;
			PublicElevator.doorOpen = true; // passengers get on/off

			PrintElevatorState();
			PublicElevator.doorOpen = false;

			PublicElevator.currentFloor = -15; // go to the first floor
			PrintElevatorState();
			PublicElevator.doorOpen = true; // passengers get on/off
			PublicElevator.currentFloor++; // elevator moves with door open
			PrintElevatorState();
			PublicElevator.doorOpen = false;
			PublicElevator.currentFloor--;
			PublicElevator.currentFloor--;
			PrintElevatorState();
			PublicElevator.currentFloor--;
			PrintElevatorState();


		}


	    public static void PrintElevatorState() {
		    String doorStatusString = "CLOSED";
		    if (PublicElevator.doorOpen)
			    doorStatusString = "OPEN";

		    Console.WriteLine("Elevator is at floot " + PublicElevator.currentFloor + " and the door is " + doorStatusString);
	    }
	}
}

