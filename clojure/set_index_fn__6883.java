package clojure;

import clojure.lang.*;

public final class set_index_fn__6883 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "select-keys");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "get");
 }
 Object ks2;
 public set_index_fn__6883(final Object ks2) {
  super();
  this.ks2 = ks2;
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object x2) {
  {
   Object ik3 = ((IFn)const__0.getRawRoot()).invoke(x2, this.ks2);
   return ((IFn)const__1.getRawRoot()).invoke(m1, ik3, ((IFn)const__2.getRawRoot()).invoke(((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)m1), ((java.lang.Object)ik3), ((java.lang.Object)clojure.lang.PersistentHashSet.EMPTY))), x2));
  }
 }
}
