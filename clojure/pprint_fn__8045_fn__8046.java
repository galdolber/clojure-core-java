package clojure;

import clojure.lang.*;

public final class pprint_fn__8045_fn__8046 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "prn");
 }
 public pprint_fn__8045_fn__8046() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object arg_navigator2, java.lang.Object offsets3) {
  Object __r5675 = RT.get(params1, Keyword.intern(null, "at"));
  if (__r5675 != null && !(__r5675 == Boolean.FALSE)) {
   ((IFn)const__1.getRawRoot()).invoke();
  } else {
  }
  return arg_navigator2;
 }
}
