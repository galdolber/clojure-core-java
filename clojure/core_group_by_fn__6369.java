package clojure;

import clojure.lang.*;

public final class core_group_by_fn__6369 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "assoc!");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "get");
 }
 Object f1;
 public core_group_by_fn__6369(final Object f1) {
  super();
  this.f1 = f1;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object x2) {
  {
   Object k3 = ((IFn)this.f1).invoke(x2);
   return ((IFn)const__0.getRawRoot()).invoke(ret1, k3, ((IFn)const__1.getRawRoot()).invoke(((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)ret1), ((java.lang.Object)k3), ((java.lang.Object)clojure.lang.PersistentVector.EMPTY))), x2));
  }
 }
}
