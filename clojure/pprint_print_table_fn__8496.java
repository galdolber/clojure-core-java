package clojure;

import clojure.lang.*;

public final class pprint_print_table_fn__8496 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "max");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 Object rows2;
 public pprint_print_table_fn__8496(final Object rows2) {
  super();
  this.rows2 = rows2;
 }
 public java.lang.Object invoke(java.lang.Object k1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)((IFn)const__3.getRawRoot()).invoke(k1)))), ((IFn)const__4.getRawRoot()).invoke(new clojure.pprint_print_table_fn__8496_fn__8497(k1), this.rows2));
 }
}
