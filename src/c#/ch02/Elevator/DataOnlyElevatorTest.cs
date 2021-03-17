using System;
using Elevator.Domain;

namespace Elevator {
	public class DataOnlyElevatorTest {
		private static DataOnlyElevator dataOnlyElevator = new DataOnlyElevator();

		public static void Main(string[] args) {
			Console.WriteLine("DataOnyElevatorTest");

			PrintElevatorState();
			dataOnlyElevator.doorOpen = true; // passengers get on

			dataOnlyElevator.doorOpen = false; // doors closed
			PrintElevatorState();
			// go down to currentFloor 0 (below bottom of building)
			dataOnlyElevator.currentFloor--;
			dataOnlyElevator.currentFloor++;

			// jump to currentFloor 7 (only 5 floors in building)
			dataOnlyElevator.currentFloor = 7;
			dataOnlyElevator.doorOpen = true; // passengers get on/off

			PrintElevatorState();
			dataOnlyElevator.doorOpen = false;

			dataOnlyElevator.currentFloor = -15; // go to the first floor
			PrintElevatorState();
			dataOnlyElevator.doorOpen = true; // passengers get on/off
			dataOnlyElevator.currentFloor++; // elevator moves with door open
			PrintElevatorState();
			dataOnlyElevator.doorOpen = false;
			dataOnlyElevator.currentFloor--;
			dataOnlyElevator.currentFloor--;
			PrintElevatorState();
			dataOnlyElevator.currentFloor--;
			PrintElevatorState();
		}


	    public static void PrintElevatorState() {
		    String doorStatusString = "CLOSED";
		    if (dataOnlyElevator.doorOpen)
			    doorStatusString = "OPEN";

		    Console.WriteLine("Elevator is at floot " + dataOnlyElevator.currentFloor + " and the door is " + doorStatusString);
	    }
	}
}

