package clojure;

import clojure.lang.*;

public final class core_print_sequential extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final java.lang.Object const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*print-level*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "*print-dup*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "*print-length*");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__10 = (java.lang.Object)0L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__12 = (java.lang.Object)1L;
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public core_print_sequential() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object begin1, java.lang.Object print_one2, java.lang.Object sep3, java.lang.Object end4, java.lang.Object sequence5, java.lang.Object w6) {
  try {
   {
    Object __r3405 = null;
    {
     Object and__3966__auto__7 = ((IFn)const__3.getRawRoot()).invoke(const__4.get());
     Object __r3406;
     Object __r3407 = and__3966__auto__7;
     if (__r3407 != null && !(__r3407 == Boolean.FALSE)) {
      Object __r3408 = null;
      {
       Object and__3966__auto__8 = const__2.get();
       Object __r3409;
       Object __r3410 = and__3966__auto__8;
       if (__r3410 != null && !(__r3410 == Boolean.FALSE)) {
        __r3409 = ((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)const__2.get())));
       } else {
        __r3409 = and__3966__auto__8;
       }
       __r3408 = __r3409;
      }
      __r3406 = __r3408;
     } else {
      __r3406 = and__3966__auto__7;
     }
     __r3405 = __r3406;
    }
    ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, __r3405));
    try {
     Object __r3412 = null;
     {
      Object and__3966__auto__11 = const__2.get();
      Object __r3413;
      Object __r3414 = and__3966__auto__11;
      if (__r3414 != null && !(__r3414 == Boolean.FALSE)) {
       __r3413 = (clojure.lang.Numbers.isNeg(((java.lang.Object)const__2.get())) ? Boolean.TRUE : Boolean.FALSE);
      } else {
       __r3413 = and__3966__auto__11;
      }
      __r3412 = __r3413;
     }
     Object __r3415 = __r3412;
     if (__r3415 != null && !(__r3415 == Boolean.FALSE)) {
      ((java.io.Writer)w6).write((java.lang.String)((java.lang.String)"#"));
      return null;
     } else {
      ((java.io.Writer)w6).write((java.lang.String)((java.lang.String)begin1));
      {
       Object temp__4117__auto__12 = ((IFn)const__7.getRawRoot()).invoke(sequence5);
       Object __r3417 = temp__4117__auto__12;
       if (__r3417 != null && !(__r3417 == Boolean.FALSE)) {
        {
         Object xs13 = temp__4117__auto__12;
         Object __r3419 = null;
         {
          Object and__3966__auto__14 = ((IFn)const__3.getRawRoot()).invoke(const__4.get());
          Object __r3420;
          Object __r3421 = and__3966__auto__14;
          if (__r3421 != null && !(__r3421 == Boolean.FALSE)) {
           __r3420 = const__8.get();
          } else {
           __r3420 = and__3966__auto__14;
          }
          __r3419 = __r3420;
         }
         Object __r3422 = __r3419;
         if (__r3422 != null && !(__r3422 == Boolean.FALSE)) {
          {
           Object G__534615 = xs13;
           Object vec__534716 = G__534615;
           Object x17 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__534716), (int)RT.intCast(0L), ((java.lang.Object)null)));
           Object xs18 = ((IFn)const__11.getRawRoot()).invoke(vec__534716, const__12);
           Object print_length19 = const__8.get();
           {
            Object G__534620 = G__534615;
            Object print_length21 = print_length19;
            while(true) {
             {
              Object vec__534822 = G__534620;
              Object x23 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__534822), (int)RT.intCast(0L), ((java.lang.Object)null)));
              Object xs24 = ((IFn)const__11.getRawRoot()).invoke(vec__534822, const__12);
              Object print_length25 = print_length21;
              if (clojure.lang.Numbers.isZero(((java.lang.Object)print_length25))) {
               ((java.io.Writer)w6).write((java.lang.String)((java.lang.String)"..."));
              } else {
               ((IFn)print_one2).invoke(x23, w6);
               Object __r3425 = xs24;
               if (__r3425 != null && !(__r3425 == Boolean.FALSE)) {
                ((java.io.Writer)w6).write((java.lang.String)((java.lang.String)sep3));
                java.lang.Object G__534620___aux = xs24;
                java.lang.Object print_length21___aux = ((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)print_length25)));
                G__534620 = G__534620___aux;
                print_length21 = print_length21___aux;
                continue;
               } else {
               }
              }
             }
             break;
            }
           }
          }
         } else {
          {
           Object G__535026 = xs13;
           Object vec__535127 = G__535026;
           Object x28 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__535127), (int)RT.intCast(0L), ((java.lang.Object)null)));
           Object xs29 = ((IFn)const__11.getRawRoot()).invoke(vec__535127, const__12);
           {
            Object G__535030 = G__535026;
            while(true) {
             {
              Object vec__535231 = G__535030;
              Object x32 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__535231), (int)RT.intCast(0L), ((java.lang.Object)null)));
              Object xs33 = ((IFn)const__11.getRawRoot()).invoke(vec__535231, const__12);
              ((IFn)print_one2).invoke(x32, w6);
              Object __r3427 = xs33;
              if (__r3427 != null && !(__r3427 == Boolean.FALSE)) {
               ((java.io.Writer)w6).write((java.lang.String)((java.lang.String)sep3));
               java.lang.Object G__535030___aux = xs33;
               G__535030 = G__535030___aux;
               continue;
              } else {
              }
             }
             break;
            }
           }
          }
         }
        }
       } else {
       }
      }
      ((java.io.Writer)w6).write((java.lang.String)((java.lang.String)end4));
      return null;
     }
    } finally {
     ((IFn)const__14.getRawRoot()).invoke();
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
