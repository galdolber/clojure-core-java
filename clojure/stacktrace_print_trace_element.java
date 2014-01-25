package clojure;

import clojure.lang.*;

public final class stacktrace_print_trace_element extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "re-matches");
  const__1 = (java.lang.Object)java.util.regex.Pattern.compile("^([A-Za-z0-9_.-]+)\\$(\\w+)__\\d+$");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "printf");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 public stacktrace_print_trace_element() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object e1) {
  {
   Object class2 = ((java.lang.String)((java.lang.StackTraceElement)e1).getClassName());
   Object method3 = ((java.lang.String)((java.lang.StackTraceElement)e1).getMethodName());
   {
    Object match4 = ((IFn)const__0.getRawRoot()).invoke(const__1, ((IFn)const__2.getRawRoot()).invoke(class2));
    Object __r4637 = null;
    {
     Object and__3966__auto__5 = match4;
     Object __r4638;
     Object __r4639 = and__3966__auto__5;
     if (__r4639 != null && !(__r4639 == Boolean.FALSE)) {
      __r4638 = (clojure.lang.Util.equiv(((java.lang.Object)"invoke"), ((java.lang.Object)method3)) ? Boolean.TRUE : Boolean.FALSE);
     } else {
      __r4638 = and__3966__auto__5;
     }
     __r4637 = __r4638;
    }
    Object __r4640 = __r4637;
    if (__r4640 != null && !(__r4640 == Boolean.FALSE)) {
     ((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), "%s/%s", ((IFn)const__6.getRawRoot()).invoke(match4));
    } else {
     ((IFn)const__5.getRawRoot()).invoke("%s.%s", class2, method3);
    }
   }
  }
  Object __r4641 = null;
  {
   Object or__3968__auto__6 = ((java.lang.String)((java.lang.StackTraceElement)e1).getFileName());
   Object __r4642;
   Object __r4643 = or__3968__auto__6;
   if (__r4643 != null && !(__r4643 == Boolean.FALSE)) {
    __r4642 = or__3968__auto__6;
   } else {
    __r4642 = "";
   }
   __r4641 = __r4642;
  }
  return ((IFn)const__5.getRawRoot()).invoke(" (%s:%d)", __r4641, Integer.valueOf(((java.lang.StackTraceElement)e1).getLineNumber()));
 }
}
