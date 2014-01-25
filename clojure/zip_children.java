package clojure;

import clojure.lang.*;

public final class zip_children extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.zip", "branch?");
  const__1 = (clojure.lang.Keyword)Keyword.intern("zip", "children");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__3 = (clojure.lang.Var)RT.var("clojure.zip", "node");
 }
 public zip_children() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  Object __r4549 = ((IFn)const__0.getRawRoot()).invoke(loc1);
  if (__r4549 != null && !(__r4549 == Boolean.FALSE)) {
   return ((IFn)RT.get(((IFn)const__2.getRawRoot()).invoke(loc1), Keyword.intern("zip", "children"))).invoke(((IFn)const__3.getRawRoot()).invoke(loc1));
  } else {
   Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)"called children on a leaf node")));
   return null;
  }
 }
}
