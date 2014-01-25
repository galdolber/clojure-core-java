package clojure;

import clojure.lang.*;

public final class core_print_meta extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "*print-dup*");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "*print-meta*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "*print-readably*");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__7 = (java.lang.Object)1L;
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "pr-on");
 }
 public core_print_meta() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object o1, java.lang.Object w2) {
  try {
   {
    Object temp__4117__auto__3 = ((IFn)const__0.getRawRoot()).invoke(o1);
    Object __r3429 = temp__4117__auto__3;
    if (__r3429 != null && !(__r3429 == Boolean.FALSE)) {
     {
      Object m4 = temp__4117__auto__3;
      Object __r3431 = null;
      {
       boolean and__3966__auto__5 = clojure.lang.Numbers.isPos((long)clojure.lang.RT.count(((java.lang.Object)m4)));
       Object __r3432;
       if (and__3966__auto__5) {
        Object __r3433 = null;
        {
         Object or__3968__auto__6 = const__3.get();
         Object __r3434;
         Object __r3435 = or__3968__auto__6;
         if (__r3435 != null && !(__r3435 == Boolean.FALSE)) {
          __r3434 = or__3968__auto__6;
         } else {
          Object __r3436 = null;
          {
           Object and__3966__auto__7 = const__4.get();
           Object __r3437;
           Object __r3438 = and__3966__auto__7;
           if (__r3438 != null && !(__r3438 == Boolean.FALSE)) {
            __r3437 = const__5.get();
           } else {
            __r3437 = and__3966__auto__7;
           }
           __r3436 = __r3437;
          }
          __r3434 = __r3436;
         }
         __r3433 = __r3434;
        }
        __r3432 = __r3433;
       } else {
        __r3432 = (and__3966__auto__5 ? Boolean.TRUE : Boolean.FALSE);
       }
       __r3431 = __r3432;
      }
      Object __r3439 = __r3431;
      if (__r3439 != null && !(__r3439 == Boolean.FALSE)) {
       ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"^"));
       Object __r3441 = null;
       {
        boolean and__3966__auto__8 = clojure.lang.Util.equiv((long)clojure.lang.RT.count(((java.lang.Object)m4)), (long)1L);
        Object __r3442;
        if (and__3966__auto__8) {
         __r3442 = RT.get(m4, Keyword.intern(null, "tag"));
        } else {
         __r3442 = (and__3966__auto__8 ? Boolean.TRUE : Boolean.FALSE);
        }
        __r3441 = __r3442;
       }
       Object __r3443 = __r3441;
       if (__r3443 != null && !(__r3443 == Boolean.FALSE)) {
        ((IFn)const__9.getRawRoot()).invoke(RT.get(m4, Keyword.intern(null, "tag")), w2);
       } else {
        ((IFn)const__9.getRawRoot()).invoke(m4, w2);
       }
       ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)" "));
       return null;
      } else {
       return null;
      }
     }
    } else {
     return null;
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
