using System;
namespace Elevator.Responsible
{
    public interface IElevator
    {

        void Go(Floor desiredFloor);

        void OpenDoor();

        void CloseDoor();

    }
}
