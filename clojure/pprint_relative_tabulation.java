package clojure;

import clojure.lang.*;

public final class pprint_relative_tabulation extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final java.lang.Object const__16;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "colnum");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "colinc");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "get-column");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "rem");
  const__9 = (java.lang.Object)0L;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__16 = (java.lang.Object)Character.valueOf((char)32);
 }
 public pprint_relative_tabulation() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object colrel4 = RT.get(params1, Keyword.intern(null, "colnum"));
   Object colinc5 = RT.get(params1, Keyword.intern(null, "colinc"));
   Object start_col6 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)colrel4), ((java.lang.Object)((IFn)const__3.getRawRoot()).invoke(RT.get(((IFn)const__5.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6.get())), Keyword.intern(null, "base"))))));
   Object __r5627;
   if (clojure.lang.Numbers.isPos(((java.lang.Object)colinc5))) {
    __r5627 = ((java.lang.Number)clojure.lang.Numbers.remainder(((java.lang.Object)start_col6), ((java.lang.Object)colinc5)));
   } else {
    __r5627 = const__9;
   }
   Object offset7 = __r5627;
   Object __r5628;
   if (clojure.lang.Util.equiv((long)0L, ((java.lang.Object)offset7))) {
    __r5628 = const__9;
   } else {
    __r5628 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)colinc5), ((java.lang.Object)offset7)));
   }
   Object space_count8 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)colrel4), ((java.lang.Object)__r5628)));
   ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__14.getRawRoot(), ((IFn)const__15.getRawRoot()).invoke(space_count8, const__16)));
  }
  return navigator2;
 }
}
