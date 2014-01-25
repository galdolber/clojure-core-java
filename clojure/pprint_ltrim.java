package clojure;

import clojure.lang.*;

public final class pprint_ltrim extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)0L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public pprint_ltrim() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object c2) {
  {
   int len3 = clojure.lang.RT.count(((java.lang.Object)s1));
   Object __r4832 = null;
   boolean and__3966__auto__4 = clojure.lang.Numbers.isPos((long)len3);
   Object __r4833;
   if (and__3966__auto__4) {
    __r4833 = clojure.lang.Util.equiv(((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)s1), (int)RT.intCast(0L)))), ((java.lang.Object)c2));
   } else {
    __r4833 = and__3966__auto__4;
   }
   if ((java.lang.Boolean)__r4833) {
    {
     long n5 = 0L;
     while(true) {
      Object __r4835 = null;
      {
       boolean or__3968__auto__6 = clojure.lang.Util.equiv((long)n5, (long)len3);
       Object __r4836;
       if (or__3968__auto__6) {
        __r4836 = (or__3968__auto__6 ? Boolean.TRUE : Boolean.FALSE);
       } else {
        __r4836 = ((IFn)const__5.getRawRoot()).invoke((clojure.lang.Util.equiv(((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)s1), (int)RT.intCast(n5)))), ((java.lang.Object)c2)) ? Boolean.TRUE : Boolean.FALSE));
       }
       __r4835 = __r4836;
      }
      Object __r4837 = __r4835;
      if (__r4837 != null && !(__r4837 == Boolean.FALSE)) {
       return ((IFn)const__6.getRawRoot()).invoke(s1, Numbers.num(n5));
      } else {
       long n5___aux = clojure.lang.Numbers.inc((long)n5);
       n5 = n5___aux;
       continue;
      }
     }
    }
   } else {
    return s1;
   }
  }
 }
}
