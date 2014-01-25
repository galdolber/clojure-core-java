package clojure;

import clojure.lang.*;

public final class zip_root extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "end");
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.zip", "node");
  const__4 = (clojure.lang.Var)RT.var("clojure.zip", "up");
 }
 public zip_root() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  while(true) {
   if (clojure.lang.Util.equiv(((java.lang.Object)const__1), ((java.lang.Object)((IFn)loc1).invoke(const__2)))) {
    return ((IFn)const__3.getRawRoot()).invoke(loc1);
   } else {
    {
     Object p2 = ((IFn)const__4.getRawRoot()).invoke(loc1);
     Object __r4567 = p2;
     if (__r4567 != null && !(__r4567 == Boolean.FALSE)) {
      java.lang.Object loc1___aux = p2;
      loc1 = loc1___aux;
      continue;
     } else {
      return ((IFn)const__3.getRawRoot()).invoke(loc1);
     }
    }
   }
  }
 }
}
