using System;
namespace DoubleCheckedLockingSingleton
{
    /// Look: https://docs.microsoft.com/en-us/previous-versions/msp-n-p/ff650316(v=pandp.10)?redirectedfrom=MSDN 
    public class DoubleCheckedLockingSingleton
    {
        //private static DoubleCheckedLockingSingleton singleton;
        private static volatile DoubleCheckedLockingSingleton singleton;
        private static readonly object lockObject = new object();

        private static int count;
        private readonly String name;

        private DoubleCheckedLockingSingleton()
        {
            name = "DoubleCheckedLockingSingleton" + count;
            count++;
        }

        public static DoubleCheckedLockingSingleton Instance
        {
            get
            {
                if (singleton == null)
                {
                    lock (lockObject)
                    {
                        if (singleton == null)
                        {
                            singleton = new DoubleCheckedLockingSingleton();
                        }
                    }
                }
                return singleton;

            }
        }

        public void PrintName()
        {
            Console.WriteLine(name);
        }
    }
}
