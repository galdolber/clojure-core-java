package clojure;

import clojure.lang.*;

public final class core_fn__4439_fn__4440 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "keyword?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "class");
 }
 public core_fn__4439_fn__4440() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object writer2) {
  {
   Object t3 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(x1)), ((java.lang.Object)const__2)));
   Object __r2691 = ((IFn)const__3.getRawRoot()).invoke(t3);
   if (__r2691 != null && !(__r2691 == Boolean.FALSE)) {
    return t3;
   } else {
    return ((IFn)const__4.getRawRoot()).invoke(x1);
   }
  }
 }
}
