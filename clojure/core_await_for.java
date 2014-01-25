package clojure;

import clojure.lang.*;

public final class core_await_for extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*agent*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (java.lang.Object)0L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "send");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_await_for() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object timeout_ms1, java.lang.Object agents2) {
  try {
   if (clojure.lang.LockingTransaction.isRunning()) {
    Util.trow((Throwable)new java.lang.IllegalStateException((java.lang.String)((java.lang.String)"await-for in transaction")));
    return null;
   } else {
    Object __r2612 = const__0.get();
    if (__r2612 != null && !(__r2612 == Boolean.FALSE)) {
     Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)"Can't await in agent action")));
    } else {
    }
    {
     Object latch3 = new java.util.concurrent.CountDownLatch((int)clojure.lang.RT.count(((java.lang.Object)agents2)));
     Object count_down4 = new clojure.core_await_for_count_down__4357(latch3);
     {
      Object seq_43595 = ((IFn)const__2.getRawRoot()).invoke(agents2);
      Object chunk_43606 = null;
      long count_43617 = 0L;
      long i_43628 = 0L;
      while(true) {
       if (clojure.lang.Numbers.lt((long)i_43628, (long)count_43617)) {
        {
         Object agent9 = ((java.lang.Object)((clojure.lang.Indexed)chunk_43606).nth((int)RT.intCast(i_43628)));
         ((IFn)const__5.getRawRoot()).invoke(agent9, count_down4);
         long i_43628___aux = clojure.lang.Numbers.unchecked_inc((long)i_43628);
         i_43628 = i_43628___aux;
         continue;
        }
       } else {
        {
         Object temp__4117__auto__10 = ((IFn)const__2.getRawRoot()).invoke(seq_43595);
         Object __r2615 = temp__4117__auto__10;
         if (__r2615 != null && !(__r2615 == Boolean.FALSE)) {
          {
           Object seq_435911 = temp__4117__auto__10;
           Object __r2617 = ((IFn)const__7.getRawRoot()).invoke(seq_435911);
           if (__r2617 != null && !(__r2617 == Boolean.FALSE)) {
            {
             Object c__4343__auto__12 = ((IFn)const__8.getRawRoot()).invoke(seq_435911);
             java.lang.Object seq_43595___aux = ((IFn)const__9.getRawRoot()).invoke(seq_435911);
             java.lang.Object chunk_43606___aux = c__4343__auto__12;
             long count_43617___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__12)));
             long i_43628___aux = clojure.lang.RT.intCast((long)0L);
             seq_43595 = seq_43595___aux;
             chunk_43606 = chunk_43606___aux;
             count_43617 = count_43617___aux;
             i_43628 = i_43628___aux;
             continue;
            }
           } else {
            {
             Object agent13 = ((IFn)const__11.getRawRoot()).invoke(seq_435911);
             ((IFn)const__5.getRawRoot()).invoke(agent13, count_down4);
             java.lang.Object seq_43595___aux = ((IFn)const__12.getRawRoot()).invoke(seq_435911);
             java.lang.Object chunk_43606___aux = null;
             long count_43617___aux = 0L;
             long i_43628___aux = 0L;
             seq_43595 = seq_43595___aux;
             chunk_43606 = chunk_43606___aux;
             count_43617 = count_43617___aux;
             i_43628 = i_43628___aux;
             continue;
            }
           }
          }
         } else {
         }
        }
       }
       break;
      }
     }
     return (((java.util.concurrent.CountDownLatch)latch3).await((long)RT.longCast(timeout_ms1), (java.util.concurrent.TimeUnit)((java.util.concurrent.TimeUnit)((java.util.concurrent.TimeUnit)java.util.concurrent.TimeUnit.MILLISECONDS))) ? Boolean.TRUE : Boolean.FALSE);
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
