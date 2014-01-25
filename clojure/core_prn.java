package clojure;

import clojure.lang.*;

public final class core_prn extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pr");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "newline");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "*flush-on-newline*");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "flush");
 }
 public core_prn() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object more1) {
  ((IFn)const__0.getRawRoot()).invoke(const__1.get(), more1);
  ((IFn)const__2.getRawRoot()).invoke();
  Object __r2703 = const__3.get();
  if (__r2703 != null && !(__r2703 == Boolean.FALSE)) {
   return ((IFn)const__4.getRawRoot()).invoke();
  } else {
   return null;
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
