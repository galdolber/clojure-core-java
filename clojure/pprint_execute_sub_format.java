package clojure;

import clojure.lang.*;

public final class pprint_execute_sub_format extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "map-passing-context");
 }
 public pprint_execute_sub_format() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object format1, java.lang.Object args2, java.lang.Object base_args3) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(new clojure.pprint_execute_sub_format_fn__7737(base_args3), args2, format1));
 }
}
