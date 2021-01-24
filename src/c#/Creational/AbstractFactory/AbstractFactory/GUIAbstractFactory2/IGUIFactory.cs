using System;
namespace GUIAbstractFactory2
{
    public interface IGUIFactory
    {
         IComponent CreateButton();

         IComponent CreateList();

         IComponent CreateTable();
    }
}
