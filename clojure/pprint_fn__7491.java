package clojure;

import clojure.lang.*;

public final class pprint_fn__7491 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "linear-nl?");
 }
 public pprint_fn__7491() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object newl1, java.lang.Object this2, java.lang.Object section3, java.lang.Object _4) {
  {
   Object lb5 = RT.get(newl1, Keyword.intern(null, "logical-block"));
   return ((IFn)const__1.getRawRoot()).invoke(this2, lb5, section3);
  }
 }
}
