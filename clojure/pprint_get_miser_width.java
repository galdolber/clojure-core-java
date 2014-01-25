package clojure;

import clojure.lang.*;

public final class pprint_get_miser_width extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "miser-width");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
 }
 public pprint_get_miser_width() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  return RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this1)), Keyword.intern(null, "miser-width"));
 }
}
