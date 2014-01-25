package clojure;

import clojure.lang.*;

public final class stacktrace_print_cause_trace extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-cause-trace");
  const__1 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-stack-trace");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "print");
 }
 public stacktrace_print_cause_trace() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object tr1, java.lang.Object n2) {
  while(true) {
   ((IFn)const__1.getRawRoot()).invoke(tr1, n2);
   {
    Object temp__4117__auto__3 = ((java.lang.Throwable)((java.lang.Throwable)tr1).getCause());
    Object __r4653 = temp__4117__auto__3;
    if (__r4653 != null && !(__r4653 == Boolean.FALSE)) {
     {
      Object cause4 = temp__4117__auto__3;
      ((IFn)const__2.getRawRoot()).invoke("Caused by: ");
      java.lang.Object tr1___aux = cause4;
      tr1 = tr1___aux;
      continue;
     }
    } else {
     return null;
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object tr1) {
  return ((IFn)const__0.getRawRoot()).invoke(tr1, null);
 }
}
