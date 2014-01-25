package clojure;

import clojure.lang.*;

public final class pprint_init_navigator extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "struct");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "arg-navigator");
  const__3 = (java.lang.Object)0L;
 }
 public pprint_init_navigator() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  {
   Object s2 = ((IFn)const__0.getRawRoot()).invoke(s1);
   return ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), s2, s2, const__3);
  }
 }
}
