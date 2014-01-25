package clojure;

import clojure.lang.*;

public final class pprint_absolute_tabulation extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final java.lang.Object const__16;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "colnum");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "colinc");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "get-column");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__9 = (java.lang.Object)0L;
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "rem");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__16 = (java.lang.Object)Character.valueOf((char)32);
 }
 public pprint_absolute_tabulation() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object colnum4 = RT.get(params1, Keyword.intern(null, "colnum"));
   Object colinc5 = RT.get(params1, Keyword.intern(null, "colinc"));
   Object current6 = ((IFn)const__2.getRawRoot()).invoke(RT.get(((IFn)const__4.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__5.get())), Keyword.intern(null, "base")));
   Object __r5623;
   if (clojure.lang.Numbers.lt(((java.lang.Object)current6), ((java.lang.Object)colnum4))) {
    __r5623 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)colnum4), ((java.lang.Object)current6)));
   } else {
    Object __r5624;
    if (clojure.lang.Util.equiv(((java.lang.Object)colinc5), (long)0L)) {
     __r5624 = const__9;
    } else {
     Object __r5625;
     Object __r5626 = const__10;
     if (__r5626 != null && !(__r5626 == Boolean.FALSE)) {
      __r5625 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)colinc5), ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.remainder(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)current6), ((java.lang.Object)colnum4)))), ((java.lang.Object)colinc5))))));
     } else {
      __r5625 = null;
     }
     __r5624 = __r5625;
    }
    __r5623 = __r5624;
   }
   Object space_count7 = __r5623;
   ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__14.getRawRoot(), ((IFn)const__15.getRawRoot()).invoke(space_count7, const__16)));
  }
  return navigator2;
 }
}
