package clojure;

import clojure.lang.*;

public final class stacktrace_print_stack_trace extends clojure.lang.AFunction {
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
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-stack-trace");
  const__1 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-throwable");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "newline");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__5 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-trace-element");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "take");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__11 = (java.lang.Object)0L;
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public stacktrace_print_stack_trace() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object tr1, java.lang.Object n2) {
  {
   Object st3 = ((java.lang.StackTraceElement[])((java.lang.Throwable)tr1).getStackTrace());
   ((IFn)const__1.getRawRoot()).invoke(tr1);
   ((IFn)const__2.getRawRoot()).invoke();
   ((IFn)const__3.getRawRoot()).invoke(" at ");
   {
    Object temp__4115__auto__4 = ((IFn)const__4.getRawRoot()).invoke(st3);
    Object __r4645 = temp__4115__auto__4;
    if (__r4645 != null && !(__r4645 == Boolean.FALSE)) {
     {
      Object e5 = temp__4115__auto__4;
      ((IFn)const__5.getRawRoot()).invoke(e5);
     }
    } else {
     ((IFn)const__3.getRawRoot()).invoke("[empty stack trace]");
    }
   }
   ((IFn)const__2.getRawRoot()).invoke();
   {
    Object __r4646;
    if (clojure.lang.Util.identical(((java.lang.Object)n2), ((java.lang.Object)null))) {
     __r4646 = ((IFn)const__8.getRawRoot()).invoke(st3);
    } else {
     __r4646 = ((IFn)const__9.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)n2))), ((IFn)const__8.getRawRoot()).invoke(st3));
    }
    Object seq_70596 = ((IFn)const__6.getRawRoot()).invoke(__r4646);
    Object chunk_70607 = null;
    long count_70618 = 0L;
    long i_70629 = 0L;
    while(true) {
     if (clojure.lang.Numbers.lt((long)i_70629, (long)count_70618)) {
      {
       Object e10 = ((java.lang.Object)((clojure.lang.Indexed)chunk_70607).nth((int)RT.intCast(i_70629)));
       ((IFn)const__3.getRawRoot()).invoke("    ");
       ((IFn)const__5.getRawRoot()).invoke(e10);
       ((IFn)const__2.getRawRoot()).invoke();
       long i_70629___aux = clojure.lang.Numbers.unchecked_inc((long)i_70629);
       i_70629 = i_70629___aux;
       continue;
      }
     } else {
      {
       Object temp__4117__auto__11 = ((IFn)const__6.getRawRoot()).invoke(seq_70596);
       Object __r4649 = temp__4117__auto__11;
       if (__r4649 != null && !(__r4649 == Boolean.FALSE)) {
        {
         Object seq_705912 = temp__4117__auto__11;
         Object __r4651 = ((IFn)const__14.getRawRoot()).invoke(seq_705912);
         if (__r4651 != null && !(__r4651 == Boolean.FALSE)) {
          {
           Object c__4343__auto__13 = ((IFn)const__15.getRawRoot()).invoke(seq_705912);
           java.lang.Object seq_70596___aux = ((IFn)const__16.getRawRoot()).invoke(seq_705912);
           java.lang.Object chunk_70607___aux = c__4343__auto__13;
           long count_70618___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__13)));
           long i_70629___aux = clojure.lang.RT.intCast((long)0L);
           seq_70596 = seq_70596___aux;
           chunk_70607 = chunk_70607___aux;
           count_70618 = count_70618___aux;
           i_70629 = i_70629___aux;
           continue;
          }
         } else {
          {
           Object e14 = ((IFn)const__4.getRawRoot()).invoke(seq_705912);
           ((IFn)const__3.getRawRoot()).invoke("    ");
           ((IFn)const__5.getRawRoot()).invoke(e14);
           ((IFn)const__2.getRawRoot()).invoke();
           java.lang.Object seq_70596___aux = ((IFn)const__19.getRawRoot()).invoke(seq_705912);
           java.lang.Object chunk_70607___aux = null;
           long count_70618___aux = 0L;
           long i_70629___aux = 0L;
           seq_70596 = seq_70596___aux;
           chunk_70607 = chunk_70607___aux;
           count_70618 = count_70618___aux;
           i_70629 = i_70629___aux;
           continue;
          }
         }
        }
       } else {
        return null;
       }
      }
     }
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object tr1) {
  return ((IFn)const__0.getRawRoot()).invoke(tr1, null);
 }
}
