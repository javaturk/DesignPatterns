using System;
using System.Collections.Generic;

namespace PostCode
{
    public interface IPostCodeService
    {
		PostCode GetPostCode(City city, Neighborhood neighborhood);

		public PostCode GetPostCode(City city, Street street);

		public List<PostCode> GetPostCodes(City city);

		public List<PostCode> GetPostCodesAround(PostCode postCode);

		public void Refresh();
	}
}
