package clojure;

import clojure.lang.*;

public final class pprint_get_pretty_writer extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "pretty-writer?");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "pretty-writer");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-right-margin*");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-miser-width*");
 }
 public pprint_get_pretty_writer() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object writer1) {
  Object __r5619 = ((IFn)const__0.getRawRoot()).invoke(writer1);
  if (__r5619 != null && !(__r5619 == Boolean.FALSE)) {
   return writer1;
  } else {
   return ((IFn)const__1.getRawRoot()).invoke(writer1, const__2.get(), const__3.get());
  }
 }
}
