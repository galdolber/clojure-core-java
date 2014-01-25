package clojure;

import clojure.lang.*;

public final class core_print_map extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-sequential");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 public core_print_map() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object print_one2, java.lang.Object w3) {
  return ((IFn)const__0.getRawRoot()).invoke("{", new clojure.core_print_map_fn__5427(print_one2), ", ", "}", ((IFn)const__1.getRawRoot()).invoke(m1), w3);
 }
}
