package clojure;

import clojure.lang.*;

public final class pprint_buffer_length extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "end-pos");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "last");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "start-pos");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__6 = (java.lang.Object)0L;
 }
 public pprint_buffer_length() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object l1) {
  {
   Object l2 = ((IFn)const__0.getRawRoot()).invoke(l1);
   Object __r4857 = l2;
   if (__r4857 != null && !(__r4857 == Boolean.FALSE)) {
    return ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)RT.get(((IFn)const__3.getRawRoot()).invoke(l2), Keyword.intern(null, "end-pos"))), ((java.lang.Object)RT.get(((IFn)const__5.getRawRoot()).invoke(l2), Keyword.intern(null, "start-pos")))));
   } else {
    return const__6;
   }
  }
 }
}
