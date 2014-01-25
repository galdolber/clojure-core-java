package clojure;

import clojure.lang.*;

public final class core_emit_protocol_fn__5980 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "keyword");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "name");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "on");
 }
 public core_emit_protocol_fn__5980() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  Object __r3813 = null;
  {
   Object or__3968__auto__2 = RT.get(s1, Keyword.intern(null, "on"));
   Object __r3814;
   Object __r3815 = or__3968__auto__2;
   if (__r3815 != null && !(__r3815 == Boolean.FALSE)) {
    __r3814 = or__3968__auto__2;
   } else {
    __r3814 = RT.get(s1, Keyword.intern(null, "name"));
   }
   __r3813 = __r3814;
  }
  return RT.vector(((IFn)const__0.getRawRoot()).invoke(RT.get(s1, Keyword.intern(null, "name"))), ((IFn)const__0.getRawRoot()).invoke(__r3813));
 }
}
