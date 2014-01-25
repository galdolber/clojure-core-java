package clojure;

import clojure.lang.*;

public final class string_escape extends clojure.lang.AFunction {
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
 public string_escape() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object cmap2) {
  {
   long index3 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   Object buffer4 = new java.lang.StringBuilder((int)((java.lang.CharSequence)s1).length());
   while(true) {
    if (clojure.lang.Util.equiv((long)((java.lang.CharSequence)s1).length(), (long)index3)) {
     return ((java.lang.String)((java.lang.StringBuilder)buffer4).toString());
    } else {
     {
      char ch5 = ((java.lang.CharSequence)s1).charAt((int)RT.intCast(index3));
      {
       Object temp__4115__auto__6 = ((IFn)cmap2).invoke(Character.valueOf(ch5));
       Object __r6349 = temp__4115__auto__6;
       if (__r6349 != null && !(__r6349 == Boolean.FALSE)) {
        {
         Object replacement7 = temp__4115__auto__6;
         ((java.lang.StringBuilder)buffer4).append(((java.lang.Object)replacement7));
        }
       } else {
        ((java.lang.StringBuilder)buffer4).append((char)ch5);
       }
      }
      long index3___aux = clojure.lang.Numbers.inc((long)index3);
      index3 = index3___aux;
      continue;
     }
    }
   }
  }
 }
}
