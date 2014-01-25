package clojure;

import clojure.lang.*;

public final class core_fn__6168 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "methods");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "print-method");
  const__3 = (java.lang.Object)clojure.lang.ISeq.class;
 }
 public core_fn__6168() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object v1, java.lang.Object w2) {
  return ((IFn)((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot())), ((java.lang.Object)const__3)))).invoke(v1, w2);
 }
}
