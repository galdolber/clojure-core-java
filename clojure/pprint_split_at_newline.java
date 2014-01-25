package clojure;

import clojure.lang.*;

public final class pprint_split_at_newline extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "take-while");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "drop");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "count");
 }
 public pprint_split_at_newline() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object tokens1) {
  {
   Object pre2 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(new clojure.pprint_split_at_newline_fn__7519(), tokens1));
   return RT.vector(pre2, ((IFn)const__0.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)pre2))), tokens1)));
  }
 }
}
