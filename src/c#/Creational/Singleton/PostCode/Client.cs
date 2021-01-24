using System;
using System.Collections.Generic;

namespace PostCode
{
    public class Client
    {
        public Client()
        {

            static void Main()
            {
                PostCodeServiceEnum postCodeServiceEnum = PostCodeServiceEnum.INSTANCE;
                List<PostCode> codes = postCodeServiceEnum.GetPostCodes(new City("Istanbul"));
                PostCode postCode = postCodeServiceEnum.GetPostCode(new City("Istanbul"), new Street("Muratreis"));
            }
        }
    }
}
