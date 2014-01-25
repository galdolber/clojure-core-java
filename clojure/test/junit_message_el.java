package clojure.test;

import clojure.lang.*;

public final class junit_message_el extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test.junit", "indent");
  const__1 = (clojure.lang.Var)RT.var("clojure.test.junit", "start-element");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "message");
  const__3 = (clojure.lang.Var)RT.var("clojure.test.junit", "element-content");
  const__4 = (clojure.lang.Var)RT.var("clojure.test", "file-position");
  const__5 = (java.lang.Object)5L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__7 = (java.lang.Object)0L;
  const__8 = (java.lang.Object)1L;
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__12 = (clojure.lang.Var)RT.var("clojure.test.junit", "finish-element");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "println");
 }
 public junit_message_el() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object tag1, java.lang.Object message2, java.lang.Object expected_str3, java.lang.Object actual_str4) {
  ((IFn)const__0.getRawRoot()).invoke();
  Object __r4781;
  Object __r4782 = message2;
  if (__r4782 != null && !(__r4782 == Boolean.FALSE)) {
   __r4781 = RT.mapUniqueKeys(const__2, message2);
  } else {
   __r4781 = clojure.lang.PersistentArrayMap.EMPTY;
  }
  ((IFn)const__1.getRawRoot()).invoke(tag1, Boolean.FALSE, __r4781);
  Object __r4783 = null;
  {
   Object vec__72825 = ((IFn)const__4.getRawRoot()).invoke(const__5);
   Object file6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__72825), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object line7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__72825), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object detail8 = ((IFn)const__9.getRawRoot()).invoke(const__10.getRawRoot(), ((IFn)const__11.getRawRoot()).invoke("\n", RT.vector(((IFn)const__10.getRawRoot()).invoke("expected: ", expected_str3), ((IFn)const__10.getRawRoot()).invoke("  actual: ", actual_str4), ((IFn)const__10.getRawRoot()).invoke("      at: ", file6, ":", line7))));
   Object __r4784;
   Object __r4785 = message2;
   if (__r4785 != null && !(__r4785 == Boolean.FALSE)) {
    __r4784 = ((IFn)const__10.getRawRoot()).invoke(message2, "\n", detail8);
   } else {
    __r4784 = detail8;
   }
   __r4783 = __r4784;
  }
  ((IFn)const__3.getRawRoot()).invoke(__r4783);
  ((IFn)const__12.getRawRoot()).invoke(tag1, Boolean.FALSE);
  return ((IFn)const__13.getRawRoot()).invoke();
 }
}
