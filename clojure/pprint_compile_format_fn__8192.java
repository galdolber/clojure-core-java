package clojure;

import clojure.lang.*;

public final class pprint_compile_format_fn__8192 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__5 = (java.lang.Object)Character.valueOf((char)126);
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "compile-raw-string");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__10 = (clojure.lang.Var)RT.var("clojure.pprint", "compile-directive");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public pprint_compile_format_fn__8192() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__81911) {
  {
   Object vec__81932 = p__81911;
   Object s3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81932), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object offset4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81932), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5860 = ((IFn)const__3.getRawRoot()).invoke(s3);
   if (__r5860 != null && !(__r5860 == Boolean.FALSE)) {
    return RT.vector(null, s3);
   } else {
    {
     int tilde5 = ((java.lang.String)s3).indexOf((int)clojure.lang.RT.intCast(((java.lang.Object)const__5)));
     if (clojure.lang.Numbers.isNeg((long)tilde5)) {
      return RT.vector(((IFn)const__7.getRawRoot()).invoke(s3, offset4), RT.vector("", ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)offset4), (long)((java.lang.String)s3).length()))));
     } else {
      if (clojure.lang.Numbers.isZero((long)tilde5)) {
       return ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(s3, const__2), ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)offset4))));
      } else {
       Object __r5864 = Boolean.TRUE;
       if (__r5864 != null && !(__r5864 == Boolean.FALSE)) {
        return RT.vector(((IFn)const__7.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(s3, const__1, Integer.valueOf(tilde5)), offset4), RT.vector(((IFn)const__11.getRawRoot()).invoke(s3, Integer.valueOf(tilde5)), ((java.lang.Number)clojure.lang.Numbers.add((long)tilde5, ((java.lang.Object)offset4)))));
       } else {
        return null;
       }
      }
     }
    }
   }
  }
 }
}
