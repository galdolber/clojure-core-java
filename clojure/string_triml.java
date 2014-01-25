package clojure;

import clojure.lang.*;

public final class string_triml extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public string_triml() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  {
   long index2 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   while(true) {
    if (clojure.lang.Util.equiv((long)((java.lang.CharSequence)s1).length(), (long)index2)) {
     return "";
    } else {
     if (java.lang.Character.isWhitespace((char)((java.lang.CharSequence)s1).charAt((int)RT.intCast(index2)))) {
      long index2___aux = clojure.lang.Numbers.inc((long)index2);
      index2 = index2___aux;
      continue;
     } else {
      return ((java.lang.String)((java.lang.Object)((java.lang.CharSequence)((java.lang.CharSequence)s1).subSequence((int)RT.intCast(index2), (int)((java.lang.CharSequence)s1).length()))).toString());
     }
    }
   }
  }
 }
}
