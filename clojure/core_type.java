package clojure;

import clojure.lang.*;

public final class core_type extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "class");
 }
 public core_type() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  {
   Object or__3968__auto__2 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(x1)), ((java.lang.Object)const__2)));
   Object __r2637 = or__3968__auto__2;
   if (__r2637 != null && !(__r2637 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    return ((IFn)const__3.getRawRoot()).invoke(x1);
   }
  }
 }
}
