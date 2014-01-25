package clojure;

import clojure.lang.*;

public final class pprint_fn__8026_fn__8027 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "count");
  const__2 = (java.lang.Object)0L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "prn");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 public pprint_fn__8026_fn__8027() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object arg_navigator2, java.lang.Object offsets3) {
  {
   long n__4366__auto__4 = clojure.lang.RT.longCast(((java.lang.Object)RT.get(params1, Keyword.intern(null, "count"))));
   {
    long i5 = 0L;
    while(true) {
     if (clojure.lang.Numbers.lt((long)i5, (long)n__4366__auto__4)) {
      ((IFn)const__4.getRawRoot()).invoke();
      long i5___aux = clojure.lang.Numbers.unchecked_inc((long)i5);
      i5 = i5___aux;
      continue;
     } else {
     }
     break;
    }
   }
  }
  return arg_navigator2;
 }
}
