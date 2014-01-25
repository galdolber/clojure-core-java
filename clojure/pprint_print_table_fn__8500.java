package clojure;

import clojure.lang.*;

public final class pprint_print_table_fn__8500 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
 }
 public pprint_print_table_fn__8500() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__8493_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(p1__8493_SHARP_1, "-"));
 }
}
