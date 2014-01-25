package clojure;

import clojure.lang.*;

public final class pprint_toks extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "tok");
 }
 public pprint_toks() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object toks1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), toks1);
 }
}
