package clojure;

import clojure.lang.*;

public final class core_sort extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "sort");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "compare");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "to-array");
 }
 public core_sort() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object comp1, java.lang.Object coll2) {
  Object __r2559 = ((IFn)const__2.getRawRoot()).invoke(coll2);
  if (__r2559 != null && !(__r2559 == Boolean.FALSE)) {
   {
    Object a3 = ((IFn)const__3.getRawRoot()).invoke(coll2);
    java.util.Arrays.sort((java.lang.Object[])((java.lang.Object[])a3), (java.util.Comparator)((java.util.Comparator)comp1));
    return ((IFn)const__2.getRawRoot()).invoke(a3);
   }
  } else {
   return clojure.lang.PersistentList.EMPTY;
  }
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), coll1);
 }
}
