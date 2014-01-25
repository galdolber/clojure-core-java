package clojure;

import clojure.lang.*;

public final class core_derive_tf__4904 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "cons");
 }
 public core_derive_tf__4904() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object source2, java.lang.Object sources3, java.lang.Object target4, java.lang.Object targets5) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_derive_tf__4904_fn__4905(target4, targets5), m1, ((IFn)const__1.getRawRoot()).invoke(source2, ((IFn)sources3).invoke(source2)));
 }
}
