package clojure;

import clojure.lang.*;

public final class xml_fn__6926_push_content__6927 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "content");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public xml_fn__6926_push_content__6927() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object e1, java.lang.Object c2) {
  Object __r4518 = null;
  {
   Object or__3968__auto__3 = RT.get(e1, Keyword.intern(null, "content"));
   Object __r4519;
   Object __r4520 = or__3968__auto__3;
   if (__r4520 != null && !(__r4520 == Boolean.FALSE)) {
    __r4519 = or__3968__auto__3;
   } else {
    __r4519 = clojure.lang.PersistentVector.EMPTY;
   }
   __r4518 = __r4519;
  }
  return ((IFn)const__0.getRawRoot()).invoke(e1, const__1, ((IFn)const__2.getRawRoot()).invoke(__r4518, c2));
 }
}
