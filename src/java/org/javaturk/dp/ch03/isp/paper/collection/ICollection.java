package org.javaturk.dp.ch03.isp.paper.collection;

public interface ICollection<T> {
	
	public void Add(T t)	;

	public void Clear()	;

	public void Contains(T t)	;

	public void CopyTo(T[] t, Int32 i)	;

	public IEnumerator GetEnumerator()	;

	public void Remove(T t);

}
