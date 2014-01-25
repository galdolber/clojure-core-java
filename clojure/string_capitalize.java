package clojure;

import clojure.lang.*;

public final class string_capitalize extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final java.lang.Object const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (java.lang.Object)2L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__5 = (java.lang.Object)0L;
  const__6 = (java.lang.Object)1L;
 }
 public string_capitalize() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  {
   Object s2 = ((java.lang.String)((java.lang.Object)s1).toString());
   if (clojure.lang.Numbers.lt((long)clojure.lang.RT.count(((java.lang.Object)s2)), (long)2L)) {
    return ((java.lang.String)((java.lang.String)s2).toUpperCase());
   } else {
    return ((IFn)const__3.getRawRoot()).invoke(((java.lang.String)((java.lang.String)((IFn)const__4.getRawRoot()).invoke(s2, const__5, const__6)).toUpperCase()), ((java.lang.String)((java.lang.String)((IFn)const__4.getRawRoot()).invoke(s2, const__6)).toLowerCase()));
   }
  }
 }
}
