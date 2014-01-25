package clojure;

import clojure.lang.*;

public final class zip_lefts extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "l");
  const__2 = (java.lang.Object)1L;
 }
 public zip_lefts() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  return ((IFn)const__0.getRawRoot()).invoke(RT.get(((IFn)loc1).invoke(const__2), Keyword.intern(null, "l")));
 }
}
