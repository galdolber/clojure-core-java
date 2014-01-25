package clojure;

import clojure.lang.*;

public final class core_replace extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 public core_replace() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object smap1, java.lang.Object coll2) {
  Object __r2917 = ((IFn)const__0.getRawRoot()).invoke(coll2);
  if (__r2917 != null && !(__r2917 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(new clojure.core_replace_fn__4710(smap1), coll2, ((IFn)const__2.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)coll2)))));
  } else {
   return ((IFn)const__4.getRawRoot()).invoke(new clojure.core_replace_fn__4713(smap1), coll2);
  }
 }
}
