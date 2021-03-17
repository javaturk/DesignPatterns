using System;
namespace Elevator.Domain {
    public class GetterSetterElevator {
		public bool DoorOpen { get; set; }  = false;
		public int CurrentFloor { get; set; } = 1;
		public int Weight { get; set; } = 0;

		public readonly int CAPACITY = 1000;
		public readonly int TOP_FLOOR = 5;
		public readonly int BOTTOM_FLOOR = 1;
	}
}
