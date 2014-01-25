package clojure;

import clojure.lang.*;

public final class pprint_rtrim extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__8 = (java.lang.Object)0L;
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public pprint_rtrim() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object c2) {
  {
   int len3 = clojure.lang.RT.count(((java.lang.Object)s1));
   Object __r4824 = null;
   boolean and__3966__auto__4 = clojure.lang.Numbers.isPos((long)len3);
   Object __r4825;
   if (and__3966__auto__4) {
    __r4825 = clojure.lang.Util.equiv(((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)s1), (int)RT.intCast(clojure.lang.Numbers.dec((long)clojure.lang.RT.count(((java.lang.Object)s1))))))), ((java.lang.Object)c2));
   } else {
    __r4825 = and__3966__auto__4;
   }
   if ((java.lang.Boolean)__r4825) {
    {
     long n5 = clojure.lang.Numbers.dec((long)len3);
     while(true) {
      if (clojure.lang.Numbers.isNeg((long)n5)) {
       return "";
      } else {
       Object __r4828 = ((IFn)const__6.getRawRoot()).invoke((clojure.lang.Util.equiv(((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)s1), (int)RT.intCast(n5)))), ((java.lang.Object)c2)) ? Boolean.TRUE : Boolean.FALSE));
       if (__r4828 != null && !(__r4828 == Boolean.FALSE)) {
        return ((IFn)const__7.getRawRoot()).invoke(s1, const__8, Numbers.num(clojure.lang.Numbers.inc((long)n5)));
       } else {
        Object __r4830 = Boolean.TRUE;
        if (__r4830 != null && !(__r4830 == Boolean.FALSE)) {
         long n5___aux = clojure.lang.Numbers.dec((long)n5);
         n5 = n5___aux;
         continue;
        } else {
         return null;
        }
       }
      }
     }
    }
   } else {
    return s1;
   }
  }
 }
}
