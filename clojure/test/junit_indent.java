package clojure.test;

import clojure.lang.*;

public final class junit_indent extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*");
  const__2 = (clojure.lang.Var)RT.var("clojure.test.junit", "*depth*");
  const__3 = (java.lang.Object)4L;
  const__4 = (java.lang.Object)0L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 public junit_indent() {
  super();
 }
 public java.lang.Object invoke() {
  {
   long n__4366__auto__1 = clojure.lang.RT.longCast(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.multiply(((java.lang.Object)const__2.get()), (long)4L))));
   {
    long n2 = 0L;
    while(true) {
     if (clojure.lang.Numbers.lt((long)n2, (long)n__4366__auto__1)) {
      ((IFn)const__6.getRawRoot()).invoke(" ");
      long n2___aux = clojure.lang.Numbers.unchecked_inc((long)n2);
      n2 = n2___aux;
      continue;
     } else {
      return null;
     }
    }
   }
  }
 }
}
