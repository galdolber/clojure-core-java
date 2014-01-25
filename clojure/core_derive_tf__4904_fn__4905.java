package clojure;

import clojure.lang.*;

public final class core_derive_tf__4904_fn__4905 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "cons");
 }
 Object target4;
 Object targets5;
 public core_derive_tf__4904_fn__4905(final Object target4, final Object targets5) {
  super();
  this.target4 = target4;
  this.targets5 = targets5;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object k2) {
  return ((IFn)const__0.getRawRoot()).invoke(ret1, k2, ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)this.targets5), ((java.lang.Object)k2), ((java.lang.Object)clojure.lang.PersistentHashSet.EMPTY))), ((IFn)const__4.getRawRoot()).invoke(this.target4, ((IFn)this.targets5).invoke(this.target4))));
 }
}
