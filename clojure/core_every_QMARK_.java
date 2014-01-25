package clojure;

import clojure.lang.*;

public final class core_every_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "else");
 }
 public core_every_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object coll2) {
  while(true) {
   if (clojure.lang.Util.identical(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(coll2)), ((java.lang.Object)null))) {
    return Boolean.TRUE;
   } else {
    Object __r2466 = ((IFn)pred1).invoke(((IFn)const__2.getRawRoot()).invoke(coll2));
    if (__r2466 != null && !(__r2466 == Boolean.FALSE)) {
     java.lang.Object coll2___aux = ((IFn)const__3.getRawRoot()).invoke(coll2);
     coll2 = coll2___aux;
     continue;
    } else {
     Object __r2468 = const__4;
     if (__r2468 != null && !(__r2468 == Boolean.FALSE)) {
      return Boolean.FALSE;
     } else {
      return null;
     }
    }
   }
  }
 }
}
