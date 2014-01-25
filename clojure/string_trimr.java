package clojure;

import clojure.lang.*;

public final class string_trimr extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__2 = (java.lang.Object)0L;
 }
 public string_trimr() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  {
   long index2 = clojure.lang.RT.longCast((int)((java.lang.CharSequence)s1).length());
   while(true) {
    if (clojure.lang.Numbers.isZero((long)index2)) {
     return "";
    } else {
     if (java.lang.Character.isWhitespace((char)((java.lang.CharSequence)s1).charAt((int)RT.intCast(clojure.lang.Numbers.dec((long)index2))))) {
      long index2___aux = clojure.lang.Numbers.dec((long)index2);
      index2 = index2___aux;
      continue;
     } else {
      return ((java.lang.String)((java.lang.Object)((java.lang.CharSequence)((java.lang.CharSequence)s1).subSequence((int)RT.intCast(0L), (int)RT.intCast(index2)))).toString());
     }
    }
   }
  }
 }
}
