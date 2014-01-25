package clojure;

import clojure.lang.*;

public final class core_merge extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "identity");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
 }
 public core_merge() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object maps1) {
  Object __r2537 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), maps1);
  if (__r2537 != null && !(__r2537 == Boolean.FALSE)) {
   return ((IFn)const__2.getRawRoot()).invoke(new clojure.core_merge_fn__4301(), maps1);
  } else {
   return null;
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
