package clojure;

import clojure.lang.*;

public final class pprint_check_arg_conditional extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "clauses");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-sub-format");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "base-args");
 }
 public pprint_check_arg_conditional() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object arg_navigator2, java.lang.Object offsets3) {
  {
   Object vec__78034 = ((IFn)const__0.getRawRoot()).invoke(arg_navigator2);
   Object arg5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78034), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78034), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object clauses7 = RT.get(params1, Keyword.intern(null, "clauses"));
   Object __r5428;
   Object __r5429 = arg5;
   if (__r5429 != null && !(__r5429 == Boolean.FALSE)) {
    __r5428 = ((IFn)const__5.getRawRoot()).invoke(clauses7);
   } else {
    __r5428 = null;
   }
   Object clause8 = __r5428;
   Object __r5431 = arg5;
   if (__r5431 != null && !(__r5431 == Boolean.FALSE)) {
    Object __r5433 = clause8;
    if (__r5433 != null && !(__r5433 == Boolean.FALSE)) {
     return ((IFn)const__6.getRawRoot()).invoke(clause8, arg_navigator2, RT.get(params1, Keyword.intern(null, "base-args")));
    } else {
     return arg_navigator2;
    }
   } else {
    return navigator6;
   }
  }
 }
}
