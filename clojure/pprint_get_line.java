package clojure;

import clojure.lang.*;

public final class pprint_get_line extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "get-field");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "line");
 }
 public pprint_get_line() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  return ((IFn)const__0.getRawRoot()).invoke(this1, const__1);
 }
}
