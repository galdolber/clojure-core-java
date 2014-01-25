package clojure;

import clojure.lang.*;

public final class core_with_bindings_STAR_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public core_with_bindings_STAR_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object binding_map1, java.lang.Object f2, java.lang.Object args3) {
  ((IFn)const__0.getRawRoot()).invoke(binding_map1);
  try {
   return ((IFn)const__1.getRawRoot()).invoke(f2, args3);
  } finally {
   ((IFn)const__2.getRawRoot()).invoke();
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
