package clojure;

import clojure.lang.*;

public final class core_fn__5452 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "print-sequential");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pr-on");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 public core_fn__5452() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object w2) {
  ((IFn)const__0.getRawRoot()).invoke(s1, w2);
  return ((IFn)const__1.getRawRoot()).invoke("#{", const__2.getRawRoot(), " ", "}", ((IFn)const__3.getRawRoot()).invoke(s1), w2);
 }
}
