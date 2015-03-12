package com.cmcc.sunyiwei.core;

import java.lang.annotation.Target;

public interface TestGenericInterface<T extends Number & Comparable<T>> {
	T add(T a, T b);
	T minus(T a, T b);
	T multiply(T a, T b);
	T divide(T a, T b);
}
