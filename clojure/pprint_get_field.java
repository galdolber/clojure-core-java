package clojure;

import clojure.lang.*;

public final class pprint_get_field extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "deref");
 }
 public pprint_get_field() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object sym2) {
  return ((IFn)sym2).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(this1)));
 }
}
