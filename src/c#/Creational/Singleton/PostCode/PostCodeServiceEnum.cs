using System;
using System.Collections.Generic;

namespace PostCode
{
    public enum PostCodeServiceEnum
    {
        INSTANCE
    }

    public static class PostCodeServiceEnumExtensions
    {
        public static string ToText(this PostCodeServiceEnum type)
        {
            return string.Format("{0}:{1}", (int)type, type);
        }

        public static PostCode GetPostCode(this PostCodeServiceEnum postCodeServiceEnum, City city, Neighborhood neighborhood)
        {
            return null;
        }

        public static  PostCode GetPostCode(this PostCodeServiceEnum postCodeServiceEnum, City city, Street street)
        {
            return null;
        }

        public static List<PostCode> GetPostCodes(this PostCodeServiceEnum postCodeServiceEnum, City city)
        {
            return null;
        }

        public static List<PostCode> GetPostCodesAround(this PostCodeServiceEnum postCodeServiceEnum, PostCode postCode)
        {
            return null;
        }

        public static void Refresh()
        {
        }
    }
}
