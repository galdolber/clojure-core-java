package clojure;

import clojure.lang.*;

public final class pprint_fn__7528 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (java.lang.Object)Character.valueOf((char)34);
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "data");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "trailing-white-space");
 }
 public pprint_fn__7528() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object token1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, RT.get(token1, Keyword.intern(null, "data")), RT.get(token1, Keyword.intern(null, "trailing-white-space")), const__1);
 }
}
