package clojure;

import clojure.lang.*;

public final class uuid_default_uuid_reader extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.IPersistentStack const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pr-str");
  const__3 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "string?"), Symbol.intern(null, "form")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 12, Keyword.intern(null, "column"), 10));
 }
 public uuid_default_uuid_reader() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object form1) {
  Object __r4076 = ((IFn)const__0.getRawRoot()).invoke(form1);
  if (__r4076 != null && !(__r4076 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.AssertionError(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke("Assert failed: ", ((IFn)const__2.getRawRoot()).invoke(const__3)))));
  }
  return ((java.util.UUID)java.util.UUID.fromString((java.lang.String)((java.lang.String)form1)));
 }
}
