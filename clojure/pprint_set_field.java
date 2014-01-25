package clojure;

import clojure.lang.*;

public final class pprint_set_field extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 public pprint_set_field() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object sym2, java.lang.Object new_val3) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this1), const__2.getRawRoot(), sym2, new_val3);
 }
}
