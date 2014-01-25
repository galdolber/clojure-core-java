package clojure;

import clojure.lang.*;

public final class pprint_fn__8031_fn__8032 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "count");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "fresh-line");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__5 = (java.lang.Object)0L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "prn");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 public pprint_fn__8031_fn__8032() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object arg_navigator2, java.lang.Object offsets3) {
  {
   Object cnt4 = RT.get(params1, Keyword.intern(null, "count"));
   if (clojure.lang.Numbers.isPos(((java.lang.Object)cnt4))) {
    ((IFn)const__2.getRawRoot()).invoke();
   } else {
   }
   {
    long n__4366__auto__5 = clojure.lang.RT.longCast(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)cnt4)))));
    {
     long i6 = 0L;
     while(true) {
      if (clojure.lang.Numbers.lt((long)i6, (long)n__4366__auto__5)) {
       ((IFn)const__7.getRawRoot()).invoke();
       long i6___aux = clojure.lang.Numbers.unchecked_inc((long)i6);
       i6 = i6___aux;
       continue;
      } else {
      }
      break;
     }
    }
   }
  }
  return arg_navigator2;
 }
}
