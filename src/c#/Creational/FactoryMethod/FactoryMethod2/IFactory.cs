using System;
namespace FactoryMethod2
{
    public interface IFactory
    {
        Employee Create(string name);
    }
}
