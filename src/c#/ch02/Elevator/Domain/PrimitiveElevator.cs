using System;
namespace Elevator.Domain
{
    public class PrimitiveElevator
    {
		private bool doorOpen = false;
		private int currentFloor = 1;
		private int weight = 0;

		private const int CAPACITY = 1000;
		private const int TOP_FLOOR = 5;
		private const int BOTTOM_FLOOR = 1;

		private readonly Random random = new Random();

		public void OpenDoor()
		{
			if (!doorOpen)
				doorOpen = true;
			else
				Console.WriteLine("Door already open.");
		}

		public void CloseDoor()
		{
			CalculateCapacity();

			if (weight <= CAPACITY)
			{
				doorOpen = false;
			}
			else
			{
				Console.WriteLine("The elevator has exceeded capacity.");
				Console.WriteLine("Doors will remain open until someone exits!");
			}
		}

		// In reality, the elevator would have weight sensors to
		// check the actual weight in the elevator, but for the sake
		// of simplicity we just pick a random number to represent the
		// weight in the elevator

		private void CalculateCapacity()
		{
			weight = random.Next(1500);
			Console.WriteLine("The weight is " + weight);
		}

		public void GoUp()
		{
			if (!doorOpen)
			{
				if (currentFloor < TOP_FLOOR)
				{
					currentFloor++;
					Console.WriteLine("Current floor: " + currentFloor);
				}
				else
					Console.WriteLine("Already on top floor.");
			}
			else
				Console.WriteLine("Doors still open!");
		}

		public void GoDown()
		{
			if (!doorOpen)
			{
				if (currentFloor > BOTTOM_FLOOR)
				{
					currentFloor--;
					Console.WriteLine("Current floor: " + currentFloor);
				}
				else
					Console.WriteLine("Already on bottom floor.");
			}
			else
				Console.WriteLine("Doors still open!");
		}

		public void Go(int desiredFloor)
		{
			if ((desiredFloor >= BOTTOM_FLOOR) && (desiredFloor <= TOP_FLOOR))
			{

				while (currentFloor != desiredFloor)
				{
					if (currentFloor < desiredFloor)
						GoUp();
					else
						GoDown();
				}
			}
			else
				Console.WriteLine("Invalid Floor");
		}

		public int GetFloor()
		{
			return currentFloor;
		}

		public bool GetDoorStatus()
		{
			return doorOpen;
		}
	}
}
