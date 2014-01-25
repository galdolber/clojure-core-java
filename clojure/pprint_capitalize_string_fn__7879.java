package clojure;

import clojure.lang.*;

public final class pprint_capitalize_string_fn__7879 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.IPersistentStack const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__1 = (clojure.lang.IPersistentStack)RT.vector(null, null);
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "re-matcher");
  const__3 = (java.lang.Object)java.util.regex.Pattern.compile("\\W\\w");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "re-find");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__8 = (java.lang.Object)0L;
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "nth");
 }
 public pprint_capitalize_string_fn__7879() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  Object __r5581 = ((IFn)const__0.getRawRoot()).invoke(s1);
  if (__r5581 != null && !(__r5581 == Boolean.FALSE)) {
   return const__1;
  } else {
   {
    Object m2 = ((IFn)const__2.getRawRoot()).invoke(const__3, s1);
    Object match3 = ((IFn)const__4.getRawRoot()).invoke(m2);
    Object __r5582 = null;
    {
     Object and__3966__auto__4 = match3;
     Object __r5583;
     Object __r5584 = and__3966__auto__4;
     if (__r5584 != null && !(__r5584 == Boolean.FALSE)) {
      __r5583 = Numbers.num(clojure.lang.Numbers.inc((long)((java.util.regex.Matcher)m2).start()));
     } else {
      __r5583 = and__3966__auto__4;
     }
     __r5582 = __r5583;
    }
    Object offset5 = __r5582;
    Object __r5586 = offset5;
    if (__r5586 != null && !(__r5586 == Boolean.FALSE)) {
     return RT.vector(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(s1, const__8, offset5), Character.valueOf(java.lang.Character.toUpperCase((char)((Character)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)s1), (int)RT.intCast(offset5)))).charValue()))), ((IFn)const__7.getRawRoot()).invoke(s1, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)offset5)))));
    } else {
     return RT.vector(s1, null);
    }
   }
  }
 }
}
