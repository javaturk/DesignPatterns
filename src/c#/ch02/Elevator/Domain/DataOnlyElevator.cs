using System;
namespace Elevator.Domain {

    public class DataOnlyElevator {
		public bool doorOpen = false;
		public int currentFloor = 1;
		public int weight = 0;

		public readonly int CAPACITY = 1000;
		public readonly int TOP_FLOOR = 5;
		public readonly int BOTTOM_FLOOR = 1;
	}
}
