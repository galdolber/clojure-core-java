package clojure;

import clojure.lang.*;

public final class core_promise_reify__6363 extends java.lang.Object implements clojure.lang.IBlockingDeref, clojure.lang.IFn, clojure.lang.IPending, clojure.lang.IDeref, clojure.lang.IObj {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "compare-and-set!");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "deref");
 }
 final clojure.lang.IPersistentMap __meta;
 Object v2;
 Object d1;
 public core_promise_reify__6363(final clojure.lang.IPersistentMap __meta, final Object v2, final Object d1) {
  super();
  this.__meta = __meta;
  this.v2 = v2;
  this.d1 = d1;
 }
 public core_promise_reify__6363(java.lang.Object __r4102, java.lang.Object __r4103) {
  this(null, __r4102, __r4103);
 }
 public clojure.lang.IPersistentMap meta() { return this.__meta; }
 public clojure.lang.IObj withMeta(clojure.lang.IPersistentMap __meta) {
  return new core_promise_reify__6363(__meta, (Object)v2, (Object)d1);
 }
 public java.lang.Object deref()  {
  try {
   ((java.util.concurrent.CountDownLatch)this.d1).await();
   return ((IFn)const__3.getRawRoot()).invoke(this.v2);
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public java.lang.Object deref(long timeout_ms1, java.lang.Object timeout_val2)  {
  try {
   if (((java.util.concurrent.CountDownLatch)this.d1).await((long)timeout_ms1, (java.util.concurrent.TimeUnit)((java.util.concurrent.TimeUnit)((java.util.concurrent.TimeUnit)java.util.concurrent.TimeUnit.MILLISECONDS)))) {
    return ((IFn)const__3.getRawRoot()).invoke(this.v2);
   } else {
    return timeout_val2;
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public boolean isRealized()  {
  return clojure.lang.Numbers.isZero((long)((java.util.concurrent.CountDownLatch)this.d1).getCount());
 }
 public java.lang.Object invoke(java.lang.Object x1)  {
  Object __r4106 = null;
  {
   boolean and__3966__auto__2 = clojure.lang.Numbers.isPos((long)((java.util.concurrent.CountDownLatch)this.d1).getCount());
   Object __r4107;
   if (and__3966__auto__2) {
    __r4107 = ((IFn)const__1.getRawRoot()).invoke(this.v2, this.d1, x1);
   } else {
    __r4107 = (and__3966__auto__2 ? Boolean.TRUE : Boolean.FALSE);
   }
   __r4106 = __r4107;
  }
  Object __r4108 = __r4106;
  if (__r4108 != null && !(__r4108 == Boolean.FALSE)) {
   ((java.util.concurrent.CountDownLatch)this.d1).countDown();
   return this;
  } else {
   return null;
  }
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15, java.lang.Object p16, java.lang.Object p17, java.lang.Object p18, java.lang.Object p19, java.lang.Object[] p20)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object call() throws java.lang.Exception {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public void run()  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15, java.lang.Object p16, java.lang.Object p17, java.lang.Object p18, java.lang.Object p19)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15, java.lang.Object p16, java.lang.Object p17, java.lang.Object p18)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke()  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object applyTo(clojure.lang.ISeq p0)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15, java.lang.Object p16)  {
  throw new RuntimeException("Reify non implemented method");
 }
 public java.lang.Object invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15, java.lang.Object p16, java.lang.Object p17)  {
  throw new RuntimeException("Reify non implemented method");
 }
}
