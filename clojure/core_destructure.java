package clojure;

import clojure.lang.*;

public final class core_destructure extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "partition");
  const__1 = (java.lang.Object)2L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "every?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
 }
 public core_destructure() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object bindings1) {
  {
   Object bents2 = ((IFn)const__0.getRawRoot()).invoke(const__1, bindings1);
   Object pb3 = new clojure.core_destructure_pb__4569();
   Object process_entry4 = new clojure.core_destructure_process_entry__4585(pb3);
   Object __r2811 = ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), ((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), bents2));
   if (__r2811 != null && !(__r2811 == Boolean.FALSE)) {
    return bindings1;
   } else {
    return ((IFn)const__6.getRawRoot()).invoke(process_entry4, clojure.lang.PersistentVector.EMPTY, bents2);
   }
  }
 }
}
