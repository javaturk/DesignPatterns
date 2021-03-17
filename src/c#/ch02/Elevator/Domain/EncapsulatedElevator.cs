using System;
namespace Elevator.Domain
{
    public class EncapsulatedElevator
    {
		private bool doorOpen = false;
		private bool stopped = true;
		private Floor currentFloor = Floor.ENTRANCE;
		private FloorMovement floorMovement;
		private int weight = 0;
        private Random random = new Random();
        private const int CAPACITY = 1000;

		public EncapsulatedElevator()
        {
			floorMovement = new FloorMovement(currentFloor);
		}

		public void OpenDoor()
		{
			if (stopped)
				doorOpen = true;
			Console.WriteLine("Door is open.");
		}

		public void CloseDoor()
		{
			CalculateCapacity();
			if (weight <= CAPACITY)
			{
				doorOpen = false;
				Console.WriteLine("Door is closed.");
			}
			else
				Console.WriteLine("The elevator has exceeded capacity, doors will remain open until someone exits!");
		}

		private void CalculateCapacity()
		{
			weight = random.Next(1500);
			Console.WriteLine("The weight is " + weight);
		}

		public void GoUp()
		{
			if (doorOpen)
				CloseDoor();
			if (currentFloor.CompareTo(Floor.FIFTH) < 0)
			{
				Console.WriteLine("Going up!");
				stopped = false;
				currentFloor = floorMovement.GoUp();
				Console.WriteLine(currentFloor);
			}
			else
				Console.WriteLine("Already on top floor.");
			Stop();
		}

		public void GoDown()
		{
			if (doorOpen)
				CloseDoor();
			if (currentFloor.CompareTo(Floor.ENTRANCE) > 0)
			{
				Console.WriteLine("Going down!");
				stopped = false;
				currentFloor = floorMovement.GoDown();
				Console.WriteLine(currentFloor);
			}
			else
				Console.WriteLine("Already on bottom floor.");
			Stop();
		}

		public void Go(Floor desiredFloor)
		{
			int compare = currentFloor.CompareTo(desiredFloor);
			while (compare != 0)
			{
				if (compare < 0)
					GoUp();
				else
					GoDown();
				compare = currentFloor.CompareTo(desiredFloor); // Do this otherwise loop goes iinfinitely
			}
			Stop();
		}

		private void Stop()
		{
			stopped = true;
			OpenDoor();
		}

		public bool GetDoorStatus()
		{
			return doorOpen;
		}
	}
}
