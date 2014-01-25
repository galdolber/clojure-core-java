package clojure;

import clojure.lang.*;

public final class test_do_report extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final java.lang.Object const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test", "report");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "fail");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "merge");
  const__5 = (clojure.lang.Var)RT.var("clojure.test", "file-and-line");
  const__6 = (java.lang.Object)1L;
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "error");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "actual");
  const__9 = (java.lang.Object)0L;
 }
 public test_do_report() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  Object __r4672 = null;
  {
   Object pred__71002 = const__1.getRawRoot();
   Object expr__71013 = RT.get(m1, Keyword.intern(null, "type"));
   Object __r4673;
   Object __r4674 = ((IFn)pred__71002).invoke(const__3, expr__71013);
   if (__r4674 != null && !(__r4674 == Boolean.FALSE)) {
    __r4673 = ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(new java.lang.Throwable(), const__6), m1);
   } else {
    Object __r4675;
    Object __r4676 = ((IFn)pred__71002).invoke(const__7, expr__71013);
    if (__r4676 != null && !(__r4676 == Boolean.FALSE)) {
     __r4675 = ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(RT.get(m1, Keyword.intern(null, "actual")), const__9), m1);
    } else {
     __r4675 = m1;
    }
    __r4673 = __r4675;
   }
   __r4672 = __r4673;
  }
  return ((IFn)const__0.get()).invoke(__r4672);
 }
}
