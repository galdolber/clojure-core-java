package clojure;

import clojure.lang.*;

public final class pprint_format_old_roman extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "format-roman");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "old-roman-table");
 }
 public pprint_format_old_roman() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), params1, navigator2, offsets3);
 }
}
