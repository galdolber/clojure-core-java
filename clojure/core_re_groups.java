package clojure;

import clojure.lang.*;

public final class core_re_groups extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public core_re_groups() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   int gc2 = ((java.util.regex.Matcher)m1).groupCount();
   if (clojure.lang.Numbers.isZero((long)gc2)) {
    return ((java.lang.String)((java.util.regex.Matcher)m1).group());
   } else {
    {
     Object ret3 = clojure.lang.PersistentVector.EMPTY;
     long c4 = 0L;
     while(true) {
      if (clojure.lang.Numbers.lte((long)c4, (long)gc2)) {
       java.lang.Object ret3___aux = ((IFn)const__3.getRawRoot()).invoke(ret3, ((java.lang.String)((java.util.regex.Matcher)m1).group((int)RT.intCast(c4))));
       long c4___aux = clojure.lang.Numbers.inc((long)c4);
       ret3 = ret3___aux;
       c4 = c4___aux;
       continue;
      } else {
       return ret3;
      }
     }
    }
   }
  }
 }
}
