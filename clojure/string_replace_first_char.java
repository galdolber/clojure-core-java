package clojure;

import clojure.lang.*;

public final class string_replace_first_char extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__2 = (java.lang.Object)(-1L);
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__5 = (java.lang.Object)0L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public string_replace_first_char() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object match2, java.lang.Object replace3) {
  {
   Object s4 = ((java.lang.String)((java.lang.Object)s1).toString());
   int i5 = ((java.lang.String)s4).indexOf((int)clojure.lang.RT.intCast(((java.lang.Object)match2)));
   if (clojure.lang.Util.equiv((long)-1L, (long)i5)) {
    return s4;
   } else {
    return ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(s4, const__5, Integer.valueOf(i5)), replace3, ((IFn)const__4.getRawRoot()).invoke(s4, Numbers.num(clojure.lang.Numbers.inc((long)i5))));
   }
  }
 }
}
