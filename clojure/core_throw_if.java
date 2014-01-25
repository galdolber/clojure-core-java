package clojure;

import clojure.lang.*;

public final class core_throw_if extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "format");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "into-array");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "drop");
  const__4 = (java.lang.Object)2L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "drop-while");
 }
 public core_throw_if() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object pred1, java.lang.Object fmt2, java.lang.Object args3) {
  Object __r3133 = pred1;
  if (__r3133 != null && !(__r3133 == Boolean.FALSE)) {
   {
    Object message4 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), fmt2, args3);
    Object exception5 = new java.lang.Exception((java.lang.String)((java.lang.String)message4));
    Object raw_trace6 = ((java.lang.StackTraceElement[])((java.lang.Throwable)exception5).getStackTrace());
    Object boring_QMARK_7 = new clojure.core_throw_if_boring_QMARK___4964();
    Object trace8 = ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4, ((IFn)const__5.getRawRoot()).invoke(boring_QMARK_7, raw_trace6)));
    ((java.lang.Throwable)exception5).setStackTrace((java.lang.StackTraceElement[])((java.lang.StackTraceElement[])trace8));
    Util.trow((Throwable)exception5);
    return null;
   }
  } else {
   return null;
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
