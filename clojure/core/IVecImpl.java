package clojure.core;

public interface IVecImpl {
 int tailoff();
 java.lang.Object arrayFor(int p0);
 java.lang.Object pushTail(int p0, clojure.core.VecNode p1, clojure.core.VecNode p2);
 java.lang.Object popTail(int p0, java.lang.Object p1);
 java.lang.Object newPath(java.lang.Object p0, int p1, java.lang.Object p2);
 java.lang.Object doAssoc(int p0, java.lang.Object p1, int p2, java.lang.Object p3);
}
