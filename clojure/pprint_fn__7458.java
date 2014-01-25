package clojure;

import clojure.lang.*;

public final class pprint_fn__7458 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "data");
 }
 public pprint_fn__7458() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object token2) {
  return Reflector.invokeInstanceMethod(RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")), "write", new Object[]{RT.get(token2, Keyword.intern(null, "data"))});
 }
}
