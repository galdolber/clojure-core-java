package clojure;

import clojure.lang.*;

public final class pprint_print_table_fn__8496_fn__8497 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "get");
 }
 Object k1;
 public pprint_print_table_fn__8496_fn__8497(final Object k1) {
  super();
  this.k1 = k1;
 }
 public java.lang.Object invoke(java.lang.Object p1__8492_SHARP_1) {
  return Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)p1__8492_SHARP_1), ((java.lang.Object)this.k1)))))));
 }
}
