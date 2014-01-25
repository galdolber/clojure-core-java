package clojure;

import clojure.lang.*;

public final class string_trim_newline extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (java.lang.Object)Character.valueOf((char)10);
  const__4 = (java.lang.Object)Character.valueOf((char)13);
  const__5 = (java.lang.Object)0L;
 }
 public string_trim_newline() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  {
   long index2 = clojure.lang.RT.longCast((int)((java.lang.CharSequence)s1).length());
   while(true) {
    if (clojure.lang.Numbers.isZero((long)index2)) {
     return "";
    } else {
     {
      char ch3 = ((java.lang.CharSequence)s1).charAt((int)RT.intCast(clojure.lang.Numbers.dec((long)index2)));
      Object __r6341 = null;
      boolean or__3968__auto__4 = clojure.lang.Util.equiv((char)ch3, (char)((Character)const__3).charValue());
      Object __r6342;
      if (or__3968__auto__4) {
       __r6342 = or__3968__auto__4;
      } else {
       __r6342 = clojure.lang.Util.equiv((char)ch3, (char)((Character)const__4).charValue());
      }
      if ((java.lang.Boolean)__r6342) {
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
}
