package clojure;

import clojure.lang.*;

public final class set_bubble_max_key extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "max-key");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "remove");
 }
 public set_bubble_max_key() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object k1, java.lang.Object coll2) {
  {
   Object max3 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), k1, coll2);
   return ((IFn)const__2.getRawRoot()).invoke(max3, ((IFn)const__3.getRawRoot()).invoke(new clojure.set_bubble_max_key_fn__6854(max3), coll2));
  }
 }
}
