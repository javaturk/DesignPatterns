using System;
using Elevator.domain;
namespace Elevator {
    public class PrimitiveElevatorTest {
		public static void Main(String[] args)
		{
			PrimitiveElevator primitiveElevator = new PrimitiveElevator();

			primitiveElevator.OpenDoor();
			primitiveElevator.CloseDoor();
			primitiveElevator.GoDown();
			primitiveElevator.GoUp();
			primitiveElevator.GoUp();
			primitiveElevator.OpenDoor();
			primitiveElevator.CloseDoor();
			primitiveElevator.GoDown();
			primitiveElevator.OpenDoor();
			primitiveElevator.GoDown();
			primitiveElevator.CloseDoor();
			primitiveElevator.GoDown();
			primitiveElevator.GoDown();

			int curFloor = primitiveElevator.GetFloor();

			if (curFloor != 5 && !primitiveElevator.GetDoorStatus())
			{
				primitiveElevator.Go(5);
			}

			primitiveElevator.Go(-10000000);
			primitiveElevator.OpenDoor();
		}
	}
}
