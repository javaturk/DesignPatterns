using System;
namespace PostCode
{
    public class PostCode
    {
        private string code { get; };

        public PostCode(String code)
        {
            this.code = code;
        }

	public bool Equals(Object obj)
		{
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			PostCode other = (PostCode)obj;
			if (code == null)
			{
				if (other.code != null)
					return false;
			}
			else if (!code.Equals(other.code))
				return false;
			return true;
		}

		
	public String ToString()
		{
			return "PostCode [code=" + code + "]";
		}

	}
}
