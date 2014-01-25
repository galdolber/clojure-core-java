package clojure;

import clojure.lang.*;

public final class core_merge_with_merge_entry__4305 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "key");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "val");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "get");
 }
 Object f1;
 public core_merge_with_merge_entry__4305(final Object f1) {
  super();
  this.f1 = f1;
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object e2) {
  {
   Object k3 = ((IFn)const__0.getRawRoot()).invoke(e2);
   Object v4 = ((IFn)const__1.getRawRoot()).invoke(e2);
   Object __r2539 = ((IFn)const__2.getRawRoot()).invoke(m1, k3);
   if (__r2539 != null && !(__r2539 == Boolean.FALSE)) {
    return ((IFn)const__3.getRawRoot()).invoke(m1, k3, ((IFn)this.f1).invoke(((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)m1), ((java.lang.Object)k3))), v4));
   } else {
    return ((IFn)const__3.getRawRoot()).invoke(m1, k3, v4);
   }
  }
 }
}
