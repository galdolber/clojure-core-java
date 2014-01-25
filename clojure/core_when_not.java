package clojure;

import clojure.lang.*;

public final class core_when_not extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, "do");
 }
 public core_when_not() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object test3, java.lang.Object body4) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, test3, null, ((IFn)const__2.getRawRoot()).invoke(const__3, body4));
 }
 public int getRequiredArity() {
  return 3;
 }
}
