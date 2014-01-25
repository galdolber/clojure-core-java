package clojure;

import clojure.lang.*;

public final class core_update_in extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "update-in");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "get");
 }
 public core_update_in() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object m1, java.lang.Object p__50512, java.lang.Object f3, java.lang.Object args4) {
  {
   Object vec__50525 = p__50512;
   Object k6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__50525), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object ks7 = ((IFn)const__2.getRawRoot()).invoke(vec__50525, const__3);
   Object __r3239 = ks7;
   if (__r3239 != null && !(__r3239 == Boolean.FALSE)) {
    return ((IFn)const__4.getRawRoot()).invoke(m1, k6, ((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)m1), ((java.lang.Object)k6))), ks7, f3, args4));
   } else {
    return ((IFn)const__4.getRawRoot()).invoke(m1, k6, ((IFn)const__5.getRawRoot()).invoke(f3, ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)m1), ((java.lang.Object)k6))), args4));
   }
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
