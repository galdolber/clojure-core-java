package clojure;

import clojure.lang.*;

public final class walk_stringify_keys_fn__6612 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "map?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "into");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 Object f2;
 public walk_stringify_keys_fn__6612(final Object f2) {
  super();
  this.f2 = f2;
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r4359 = ((IFn)const__0.getRawRoot()).invoke(x1);
  if (__r4359 != null && !(__r4359 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, ((IFn)const__2.getRawRoot()).invoke(this.f2, x1));
  } else {
   return x1;
  }
 }
}
