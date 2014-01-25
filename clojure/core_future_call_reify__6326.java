package clojure;

import clojure.lang.*;

public final class core_future_call_reify__6326 extends java.lang.Object implements java.util.concurrent.Future, clojure.lang.IBlockingDeref, clojure.lang.IPending, clojure.lang.IDeref, clojure.lang.IObj {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "deref-future");
 }
 final clojure.lang.IPersistentMap __meta;
 Object fut3;
 public core_future_call_reify__6326(final clojure.lang.IPersistentMap __meta, final Object fut3) {
  super();
  this.__meta = __meta;
  this.fut3 = fut3;
 }
 public core_future_call_reify__6326(java.lang.Object __r4086) {
  this(null, __r4086);
 }
 public clojure.lang.IPersistentMap meta() { return this.__meta; }
 public clojure.lang.IObj withMeta(clojure.lang.IPersistentMap __meta) {
  return new core_future_call_reify__6326(__meta, (Object)fut3);
 }
 public java.lang.Object deref()  {
  return ((IFn)const__0.getRawRoot()).invoke(this.fut3);
 }
 public java.lang.Object deref(long timeout_ms1, java.lang.Object timeout_val2)  {
  return ((IFn)const__0.getRawRoot()).invoke(this.fut3, Numbers.num(timeout_ms1), timeout_val2);
 }
 public boolean isRealized()  {
  return ((java.util.concurrent.Future)this.fut3).isDone();
 }
 public boolean cancel(boolean interrupt_QMARK_1)  {
  return ((java.util.concurrent.Future)this.fut3).cancel((boolean)interrupt_QMARK_1);
 }
 public boolean isDone()  {
  return ((java.util.concurrent.Future)this.fut3).isDone();
 }
 public boolean isCancelled()  {
  return ((java.util.concurrent.Future)this.fut3).isCancelled();
 }
 public java.lang.Object get(long timeout1, java.util.concurrent.TimeUnit unit2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
  try {
   return ((java.lang.Object)((java.util.concurrent.Future)this.fut3).get((long)timeout1, (java.util.concurrent.TimeUnit)((java.util.concurrent.TimeUnit)unit2)));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
  try {
   return ((java.lang.Object)((java.util.concurrent.Future)this.fut3).get());
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
