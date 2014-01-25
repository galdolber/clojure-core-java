package clojure;

import clojure.lang.*;

public final class core_fn__5419 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*print-dup*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*print-readably*");
  const__2 = (java.lang.Object)Character.valueOf((char)34);
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (java.lang.Object)0L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "char-escape-string");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 public core_fn__5419() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object w2) {
  try {
   Object __r3448 = null;
   {
    Object or__3968__auto__3 = const__0.get();
    Object __r3449;
    Object __r3450 = or__3968__auto__3;
    if (__r3450 != null && !(__r3450 == Boolean.FALSE)) {
     __r3449 = or__3968__auto__3;
    } else {
     __r3449 = const__1.get();
    }
    __r3448 = __r3449;
   }
   Object __r3451 = __r3448;
   if (__r3451 != null && !(__r3451 == Boolean.FALSE)) {
    ((java.io.Writer)w2).append((char)((Character)const__2).charValue());
    {
     long n__4366__auto__4 = clojure.lang.RT.longCast((int)clojure.lang.RT.count(((java.lang.Object)s1)));
     {
      long n5 = 0L;
      while(true) {
       if (clojure.lang.Numbers.lt((long)n5, (long)n__4366__auto__4)) {
        {
         char c6 = ((java.lang.String)s1).charAt((int)RT.intCast(n5));
         Object e7 = ((IFn)const__7.getRawRoot()).invoke(Character.valueOf(c6));
         Object __r3454 = e7;
         if (__r3454 != null && !(__r3454 == Boolean.FALSE)) {
          ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)e7));
         } else {
          ((java.io.Writer)w2).append((char)c6);
         }
        }
        long n5___aux = clojure.lang.Numbers.unchecked_inc((long)n5);
        n5 = n5___aux;
        continue;
       } else {
       }
       break;
      }
     }
    }
    ((java.io.Writer)w2).append((char)((Character)const__2).charValue());
   } else {
    ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)s1));
   }
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
