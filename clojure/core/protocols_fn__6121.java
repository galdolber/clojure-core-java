package clojure.core;

import clojure.lang.*;

public final class protocols_fn__6121 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "alength");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "aget");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "reduced?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public protocols_fn__6121() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a_seq1, java.lang.Object f2, java.lang.Object val3) {
  {
   Object arr4 = ((int[])((clojure.lang.ArraySeq.ArraySeq_int)a_seq1).array);
   {
    long i5 = clojure.lang.RT.longCast((int)((clojure.lang.ArraySeq.ArraySeq_int)a_seq1).index());
    Object val6 = val3;
    while(true) {
     if (clojure.lang.Numbers.lt((long)i5, (long)clojure.lang.RT.alength((int[])((int[])arr4)))) {
      {
       Object ret7 = ((IFn)f2).invoke(val6, Integer.valueOf(clojure.lang.RT.aget((int[])((int[])arr4), (int)clojure.lang.RT.intCast((long)i5))));
       if (clojure.lang.RT.isReduced(((java.lang.Object)ret7))) {
        return ((IFn)const__5.getRawRoot()).invoke(ret7);
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
