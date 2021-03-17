using System;
namespace Elevator.Domain
{
    public class FloorMovement
    {
		private int intFloor;
		private Floor currentFloor;

		public FloorMovement(Floor currentFloor)
        {
			this.currentFloor = currentFloor;
		}
		

        public int GetIntFloor()
		{
			if (currentFloor.Equals(Floor.ENTRANCE))
				intFloor = 0;
			else if (currentFloor.Equals(Floor.FIRST))
				intFloor = 1;
			else if (currentFloor == Floor.SECOND)
				intFloor = 2;
			else if (currentFloor == Floor.THIRD)
				intFloor = 3;
			else
				intFloor = 4;

			return intFloor;
		}

		public Floor GoUp()
		{
			Floor upperFloor;
			if (currentFloor.Equals(Floor.ENTRANCE))
				upperFloor = Floor.FIRST;
			else if (currentFloor.Equals(Floor.FIRST))
				upperFloor = Floor.SECOND;
			else if (currentFloor == Floor.SECOND)
				upperFloor = Floor.THIRD;
			else if (currentFloor == Floor.THIRD)
				upperFloor = Floor.FOURTH;
			else
				upperFloor = Floor.FIFTH;
			currentFloor = upperFloor;
			return upperFloor;
		}

		public Floor GoDown()
		{
			Floor lowerFloor;
			if (currentFloor.Equals(Floor.FIFTH))
				lowerFloor = Floor.FOURTH;
			else if (currentFloor.Equals(Floor.FOURTH))
				lowerFloor = Floor.THIRD;
			else if (currentFloor.Equals(Floor.THIRD))
				lowerFloor = Floor.SECOND;
			else if (currentFloor.Equals(Floor.SECOND))
				lowerFloor = Floor.FIRST;
			else
				lowerFloor = Floor.ENTRANCE;
			currentFloor = lowerFloor;
			return lowerFloor;
		}

		public override string ToString()
		{
			string  s = "Floor: " + GetIntFloor();
			return s;
		}
	}
}
