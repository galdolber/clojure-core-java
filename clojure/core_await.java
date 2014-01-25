package clojure;

import clojure.lang.*;

public final class core_await extends clojure.lang.RestFn {
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
 public core_await() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object agents1) {
  try {
   if (clojure.lang.LockingTransaction.isRunning()) {
    Util.trow((Throwable)new java.lang.IllegalStateException((java.lang.String)((java.lang.String)"await in transaction")));
    return null;
   } else {
    Object __r2603 = const__0.get();
    if (__r2603 != null && !(__r2603 == Boolean.FALSE)) {
     Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)"Can't await in agent action")));
    } else {
    }
    {
     Object latch2 = new java.util.concurrent.CountDownLatch((int)clojure.lang.RT.count(((java.lang.Object)agents1)));
     Object count_down3 = new clojure.core_await_count_down__4347(latch2);
     {
      Object seq_43494 = ((IFn)const__2.getRawRoot()).invoke(agents1);
      Object chunk_43505 = null;
      long count_43516 = 0L;
      long i_43527 = 0L;
      while(true) {
       if (clojure.lang.Numbers.lt((long)i_43527, (long)count_43516)) {
        {
         Object agent8 = ((java.lang.Object)((clojure.lang.Indexed)chunk_43505).nth((int)RT.intCast(i_43527)));
         ((IFn)const__5.getRawRoot()).invoke(agent8, count_down3);
         long i_43527___aux = clojure.lang.Numbers.unchecked_inc((long)i_43527);
         i_43527 = i_43527___aux;
         continue;
        }
       } else {
        {
         Object temp__4117__auto__9 = ((IFn)const__2.getRawRoot()).invoke(seq_43494);
         Object __r2606 = temp__4117__auto__9;
         if (__r2606 != null && !(__r2606 == Boolean.FALSE)) {
          {
           Object seq_434910 = temp__4117__auto__9;
           Object __r2608 = ((IFn)const__7.getRawRoot()).invoke(seq_434910);
           if (__r2608 != null && !(__r2608 == Boolean.FALSE)) {
            {
             Object c__4343__auto__11 = ((IFn)const__8.getRawRoot()).invoke(seq_434910);
             java.lang.Object seq_43494___aux = ((IFn)const__9.getRawRoot()).invoke(seq_434910);
             java.lang.Object chunk_43505___aux = c__4343__auto__11;
             long count_43516___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__11)));
             long i_43527___aux = clojure.lang.RT.intCast((long)0L);
             seq_43494 = seq_43494___aux;
             chunk_43505 = chunk_43505___aux;
             count_43516 = count_43516___aux;
             i_43527 = i_43527___aux;
             continue;
            }
           } else {
            {
             Object agent12 = ((IFn)const__11.getRawRoot()).invoke(seq_434910);
             ((IFn)const__5.getRawRoot()).invoke(agent12, count_down3);
             java.lang.Object seq_43494___aux = ((IFn)const__12.getRawRoot()).invoke(seq_434910);
             java.lang.Object chunk_43505___aux = null;
             long count_43516___aux = 0L;
             long i_43527___aux = 0L;
             seq_43494 = seq_43494___aux;
             chunk_43505 = chunk_43505___aux;
             count_43516 = count_43516___aux;
             i_43527 = i_43527___aux;
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
     ((java.util.concurrent.CountDownLatch)latch2).await();
     return null;
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
