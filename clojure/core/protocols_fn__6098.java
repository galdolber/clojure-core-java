package clojure.core;

import clojure.lang.*;

public final class protocols_fn__6098 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reduced?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public protocols_fn__6098() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object str_seq1, java.lang.Object f2, java.lang.Object val3) {
  {
   Object s4 = ((java.lang.CharSequence)((clojure.lang.StringSeq)str_seq1).s);
   {
    long i5 = clojure.lang.RT.longCast((int)((clojure.lang.StringSeq)str_seq1).i);
    Object val6 = val3;
    while(true) {
     if (clojure.lang.Numbers.lt((long)i5, (long)((java.lang.CharSequence)s4).length())) {
      {
       Object ret7 = ((IFn)f2).invoke(val6, Character.valueOf(((java.lang.CharSequence)s4).charAt((int)RT.intCast(i5))));
       if (clojure.lang.RT.isReduced(((java.lang.Object)ret7))) {
        return ((IFn)const__2.getRawRoot()).invoke(ret7);
       } else {
        long i5___aux = clojure.lang.Numbers.inc((long)i5);
        java.lang.Object val6___aux = ret7;
        i5 = i5___aux;
        val6 = val6___aux;
        continue;
       }
      }
     } else {
      return val6;
     }
    }
   }
  }
 }
}
