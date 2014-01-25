package clojure;

import clojure.lang.*;

public final class instant_zero_fill_right extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Keyword const__4;
 public static final java.lang.Object const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (java.lang.Object)0L;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__5 = (java.lang.Object)Character.valueOf((char)48);
 }
 public instant_zero_fill_right() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object width2) {
  if (clojure.lang.Util.equiv(((java.lang.Object)width2), (long)clojure.lang.RT.count(((java.lang.Object)s1)))) {
   return s1;
  } else {
   if (clojure.lang.Numbers.lt(((java.lang.Object)width2), (long)clojure.lang.RT.count(((java.lang.Object)s1)))) {
    return ((java.lang.String)((java.lang.String)s1).substring((int)RT.intCast(0L), (int)RT.intCast(width2)));
   } else {
    Object __r4024 = const__4;
    if (__r4024 != null && !(__r4024 == Boolean.FALSE)) {
     {
      Object b3 = new java.lang.StringBuilder((java.lang.String)((java.lang.String)s1));
      while(true) {
       if (clojure.lang.Numbers.lt((long)((java.lang.StringBuilder)b3).length(), ((java.lang.Object)width2))) {
        java.lang.Object b3___aux = ((java.lang.StringBuilder)((java.lang.StringBuilder)b3).append(((java.lang.Object)const__5)));
        b3 = b3___aux;
        continue;
       } else {
        return ((java.lang.String)((java.lang.StringBuilder)b3).toString());
       }
      }
     }
    } else {
     return null;
    }
   }
  }
 }
}
