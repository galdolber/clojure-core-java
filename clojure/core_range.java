package clojure;

import clojure.lang.*;

public final class core_range extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
 }
 public core_range() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object start1, java.lang.Object end2, java.lang.Object step3) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_range_fn__4294(start1, step3, end2)));
 }
 public java.lang.Object invoke(java.lang.Object start1, java.lang.Object end2) {
  return ((IFn)const__0.getRawRoot()).invoke(start1, end2, const__2);
 }
 public java.lang.Object invoke(java.lang.Object end1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, end1, const__2);
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, Double.valueOf(java.lang.Double.POSITIVE_INFINITY), const__2);
 }
}
