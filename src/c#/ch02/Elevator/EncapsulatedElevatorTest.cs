using System;
using Elevator.Domain;

namespace Elevator
{
    public class EncapsulatedElevatorTest
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("EncapsulatedElevatorTest");

            EncapsulatedElevator encapElevator = new EncapsulatedElevator();

            encapElevator.OpenDoor(); // Get into the elevator
            encapElevator.GoDown();
            encapElevator.GoUp();
            encapElevator.GoUp();
            encapElevator.CloseDoor();
            encapElevator.OpenDoor(); // Somebody is coming :)
            encapElevator.GoDown();
            encapElevator.GoDown();
            encapElevator.GoDown();
            encapElevator.Go(Floor.FOURTH);
        }
    }
}
