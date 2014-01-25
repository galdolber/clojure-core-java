package clojure;

import clojure.lang.*;

public final class string_replace_first_str extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (java.lang.Object)(-1L);
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__4 = (java.lang.Object)0L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "+");
 }
 public string_replace_first_str() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object match2, java.lang.Object replace3) {
  {
   Object s4 = ((java.lang.String)((java.lang.Object)s1).toString());
   int i5 = ((java.lang.String)s4).indexOf((java.lang.String)((java.lang.String)match2));
   if (clojure.lang.Util.equiv((long)-1L, (long)i5)) {
    return s4;
   } else {
    return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(s4, const__4, Integer.valueOf(i5)), replace3, ((IFn)const__3.getRawRoot()).invoke(s4, Numbers.num(clojure.lang.Numbers.add((long)i5, (long)((java.lang.String)match2).length()))));
   }
  }
 }
}
