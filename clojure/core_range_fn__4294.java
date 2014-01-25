package clojure;

import clojure.lang.*;

public final class core_range_fn__4294 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "chunk-buffer");
  const__1 = (java.lang.Object)32L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "not=");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "chunk-append");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "chunk-cons");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "chunk");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "range");
 }
 Object start1;
 Object step3;
 Object end2;
 public core_range_fn__4294(final Object start1, final Object step3, final Object end2) {
  super();
  this.start1 = start1;
  this.step3 = step3;
  this.end2 = end2;
 }
 public java.lang.Object invoke() {
  {
   Object b1 = ((IFn)const__0.getRawRoot()).invoke(const__1);
   Object __r2522;
   Object __r2523 = null;
   boolean or__3968__auto__2 = clojure.lang.Numbers.isZero(((java.lang.Object)this.step3));
   Object __r2524;
   if (or__3968__auto__2) {
    __r2524 = or__3968__auto__2;
   } else {
    __r2524 = clojure.lang.Util.equiv(((java.lang.Object)this.start1), ((java.lang.Object)this.end2));
   }
   if ((java.lang.Boolean)__r2524) {
    __r2522 = const__4.getRawRoot();
   } else {
    Object __r2525;
    if (clojure.lang.Numbers.isPos(((java.lang.Object)this.step3))) {
     __r2525 = const__6.getRawRoot();
    } else {
     Object __r2526;
     if (clojure.lang.Numbers.isNeg(((java.lang.Object)this.step3))) {
      __r2526 = const__8.getRawRoot();
     } else {
      __r2526 = null;
     }
     __r2525 = __r2526;
    }
    __r2522 = __r2525;
   }
   Object comp3 = __r2522;
   {
    Object i4 = this.start1;
    while(true) {
     Object __r2528 = null;
     {
      boolean and__3966__auto__5 = clojure.lang.Numbers.lt((long)clojure.lang.RT.count(((java.lang.Object)b1)), (long)32L);
      Object __r2529;
      if (and__3966__auto__5) {
       __r2529 = ((IFn)comp3).invoke(i4, this.end2);
      } else {
       __r2529 = (and__3966__auto__5 ? Boolean.TRUE : Boolean.FALSE);
      }
      __r2528 = __r2529;
     }
     Object __r2530 = __r2528;
     if (__r2530 != null && !(__r2530 == Boolean.FALSE)) {
      ((IFn)const__10.getRawRoot()).invoke(b1, i4);
      java.lang.Object i4___aux = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)i4), ((java.lang.Object)this.step3)));
      i4 = i4___aux;
      continue;
     } else {
      Object __r2531;
      Object __r2532 = ((IFn)comp3).invoke(i4, this.end2);
      if (__r2532 != null && !(__r2532 == Boolean.FALSE)) {
       __r2531 = ((IFn)const__14.getRawRoot()).invoke(i4, this.end2, this.step3);
      } else {
       __r2531 = null;
      }
      return ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(b1), __r2531);
     }
    }
   }
  }
 }
}
