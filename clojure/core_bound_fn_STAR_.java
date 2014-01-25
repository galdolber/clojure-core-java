package clojure;

import clojure.lang.*;

public final class core_bound_fn_STAR_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "get-thread-bindings");
 }
 public core_bound_fn_STAR_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  {
   Object bindings2 = ((IFn)const__0.getRawRoot()).invoke();
   return new clojure.core_bound_fn_STAR__fn__4127(bindings2, f1);
  }
 }
}
