package clojure;

import clojure.lang.*;

public final class core_proxy_name_fn__5186 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public core_proxy_name_fn__5186() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5183_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(p1__5183_SHARP_1, Numbers.num(clojure.lang.Numbers.inc((long)((java.lang.String)p1__5183_SHARP_1).lastIndexOf((java.lang.String)((java.lang.String)".")))));
 }
}
