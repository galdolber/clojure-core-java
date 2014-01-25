package clojure;

import clojure.lang.*;

public final class core_extenders extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "keys");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "impls");
 }
 public core_extenders() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object protocol1) {
  return ((IFn)const__0.getRawRoot()).invoke(RT.get(protocol1, Keyword.intern(null, "impls")));
 }
}
