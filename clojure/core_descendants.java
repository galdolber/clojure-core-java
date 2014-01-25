package clojure;

import clojure.lang.*;

public final class core_descendants extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "descendants");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "global-hierarchy");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "class?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "not-empty");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "descendants");
 }
 public core_descendants() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object h1, java.lang.Object tag2) {
  Object __r3070 = ((IFn)const__2.getRawRoot()).invoke(tag2);
  if (__r3070 != null && !(__r3070 == Boolean.FALSE)) {
   Util.trow((Throwable)new java.lang.UnsupportedOperationException((java.lang.String)((java.lang.String)"Can't get descendants of classes")));
   return null;
  } else {
   return ((IFn)const__3.getRawRoot()).invoke(((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)RT.get(h1, Keyword.intern(null, "descendants"))), ((java.lang.Object)tag2))));
  }
 }
 public java.lang.Object invoke(java.lang.Object tag1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), tag1);
 }
}
