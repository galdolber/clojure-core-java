package clojure;

import clojure.lang.*;

public final class main_stack_element_str extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.main", "demunge");
 }
 public main_stack_element_str() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object el1) {
  {
   Object file2 = ((java.lang.String)((java.lang.StackTraceElement)el1).getFileName());
   Object __r4429 = null;
   {
    Object and__3966__auto__3 = file2;
    Object __r4430;
    Object __r4431 = and__3966__auto__3;
    if (__r4431 != null && !(__r4431 == Boolean.FALSE)) {
     Object __r4432 = null;
     {
      boolean or__3968__auto__4 = ((java.lang.String)file2).endsWith((java.lang.String)((java.lang.String)".clj"));
      Object __r4433;
      if (or__3968__auto__4) {
       __r4433 = (or__3968__auto__4 ? Boolean.TRUE : Boolean.FALSE);
      } else {
       __r4433 = (clojure.lang.Util.equiv(((java.lang.Object)file2), ((java.lang.Object)"NO_SOURCE_FILE")) ? Boolean.TRUE : Boolean.FALSE);
      }
      __r4432 = (java.lang.Boolean)__r4433;
     }
     __r4430 = __r4432;
    } else {
     __r4430 = and__3966__auto__3;
    }
    __r4429 = __r4430;
   }
   Object clojure_fn_QMARK_5 = __r4429;
   Object __r4434;
   Object __r4435 = clojure_fn_QMARK_5;
   if (__r4435 != null && !(__r4435 == Boolean.FALSE)) {
    __r4434 = ((IFn)const__2.getRawRoot()).invoke(((java.lang.String)((java.lang.StackTraceElement)el1).getClassName()));
   } else {
    __r4434 = ((IFn)const__1.getRawRoot()).invoke(((java.lang.String)((java.lang.StackTraceElement)el1).getClassName()), ".", ((java.lang.String)((java.lang.StackTraceElement)el1).getMethodName()));
   }
   return ((IFn)const__1.getRawRoot()).invoke(__r4434, " (", ((java.lang.String)((java.lang.StackTraceElement)el1).getFileName()), ":", Integer.valueOf(((java.lang.StackTraceElement)el1).getLineNumber()), ")");
  }
 }
}
