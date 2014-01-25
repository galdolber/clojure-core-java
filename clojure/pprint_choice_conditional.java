package clojure;

import clojure.lang.*;

public final class pprint_choice_conditional extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "selector");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__3 = (java.lang.Object)0L;
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "clauses");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__11 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-sub-format");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "base-args");
 }
 public pprint_choice_conditional() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object arg_navigator2, java.lang.Object offsets3) {
  {
   Object arg4 = RT.get(params1, Keyword.intern(null, "selector"));
   Object __r5417;
   Object __r5418 = arg4;
   if (__r5418 != null && !(__r5418 == Boolean.FALSE)) {
    __r5417 = RT.vector(arg4, arg_navigator2);
   } else {
    __r5417 = ((IFn)const__1.getRawRoot()).invoke(arg_navigator2);
   }
   Object vec__77985 = __r5417;
   Object arg6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77985), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77985), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object clauses8 = RT.get(params1, Keyword.intern(null, "clauses"));
   Object __r5419;
   Object __r5420 = null;
   boolean or__3968__auto__9 = clojure.lang.Numbers.isNeg(((java.lang.Object)arg6));
   Object __r5421;
   if (or__3968__auto__9) {
    __r5421 = or__3968__auto__9;
   } else {
    __r5421 = clojure.lang.Numbers.gte(((java.lang.Object)arg6), (long)clojure.lang.RT.count(((java.lang.Object)clauses8)));
   }
   if ((java.lang.Boolean)__r5421) {
    __r5419 = ((IFn)const__9.getRawRoot()).invoke(RT.get(params1, Keyword.intern(null, "else")));
   } else {
    __r5419 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)clauses8), (int)RT.intCast(arg6)));
   }
   Object clause10 = __r5419;
   Object __r5423 = clause10;
   if (__r5423 != null && !(__r5423 == Boolean.FALSE)) {
    return ((IFn)const__11.getRawRoot()).invoke(clause10, navigator7, RT.get(params1, Keyword.intern(null, "base-args")));
   } else {
    return navigator7;
   }
  }
 }
}
