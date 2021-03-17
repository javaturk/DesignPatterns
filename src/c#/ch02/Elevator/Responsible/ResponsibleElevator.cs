using System;
namespace Elevator.Responsible
{
    public class ResponsibleElevator : IElevator
    {
        private bool doorOpen = false;
        private bool stopped = true;
        private int weight = 0;

        private const int CAPACITY = 1000;

        private Random random = new Random();

        private Floor currentFloor = Floor.ENTRANCE;
        private FloorMovement floorMovement;

        public ResponsibleElevator()
        {
            floorMovement = new FloorMovement(currentFloor);
        }

        public void CloseDoor()
        {
            CalculateCapacity();
            if (weight <= CAPACITY)
            {
                doorOpen = false;
                stopped = false;
                Console.WriteLine("Door is closed.");
            }
            else
                Console.WriteLine("The elevator has exceeded capacity, doors will remain open until someone exits!");
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
                compare = currentFloor.CompareTo(desiredFloor);
            }
            stopped = true;
            OpenDoor();
        }

        public void OpenDoor()
        {
            if (stopped)
                doorOpen = true;
            Console.WriteLine("Door is open.");
        }

        private void GoUp()
        {
            if (doorOpen)
                CloseDoor();
            if (currentFloor.CompareTo(Floor.FIFTH) < 0)
            {
                Console.WriteLine("Going up!");
                currentFloor = floorMovement.Increase();
                Console.WriteLine(currentFloor);
            }
            else
                Console.WriteLine("Already on top floor.");
            stopped = true;
        }

        private void GoDown()
        {
            if (doorOpen)
                CloseDoor();
            if (currentFloor.CompareTo(Floor.ENTRANCE) > 0)
            {
                Console.WriteLine("Going down!");
                currentFloor = floorMovement.Decrease();
                Console.WriteLine(currentFloor);
            }
            else
                Console.WriteLine("Already on bottom floor.");
            stopped = true;
            OpenDoor();
        }

        private void CalculateCapacity()
        {
            weight = random.Next(1500);
            Console.WriteLine("The weight is " + weight);
        }
    }
}
