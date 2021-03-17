using System;
namespace Elevator.Responsible
{
    public class ResponsibleElevatorTest
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("ResponsibleElevatorTest");

            IElevator elevator = new ResponsibleElevator();
            elevator.OpenDoor();  // Get into the elevator
            elevator.Go(Floor.FIFTH);

            elevator.OpenDoor(); // Somebody is coming :)
            elevator.Go(Floor.FIRST);
            elevator.Go(Floor.FIFTH);
        }
    }
}
