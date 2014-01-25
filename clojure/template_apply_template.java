package clojure;

import clojure.lang.*;

public final class template_apply_template extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.IPersistentStack const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.IPersistentStack const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pr-str");
  const__3 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "vector?"), Symbol.intern(null, "argv")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 40, Keyword.intern(null, "column"), 11));
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "every?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__6 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "every?"), Symbol.intern(null, "symbol?"), Symbol.intern(null, "argv")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 41, Keyword.intern(null, "column"), 11));
  const__7 = (clojure.lang.Var)RT.var("clojure.walk", "prewalk-replace");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "zipmap");
 }
 public template_apply_template() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object argv1, java.lang.Object expr2, java.lang.Object values3) {
  Object __r4656 = ((IFn)const__0.getRawRoot()).invoke(argv1);
  if (__r4656 != null && !(__r4656 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.AssertionError(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke("Assert failed: ", ((IFn)const__2.getRawRoot()).invoke(const__3)))));
  }
  Object __r4658 = ((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), argv1);
  if (__r4658 != null && !(__r4658 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.AssertionError(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke("Assert failed: ", ((IFn)const__2.getRawRoot()).invoke(const__6)))));
  }
  return ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(argv1, values3), expr2);
 }
}
