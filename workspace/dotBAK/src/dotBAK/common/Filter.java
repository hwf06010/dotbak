package dotBAK.common;

public abstract class Filter<T> {
	public abstract boolean include(T x);
}
